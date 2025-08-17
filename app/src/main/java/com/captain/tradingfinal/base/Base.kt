package com.captain.tradingfinal.base

/**
 * ━━━━ Code is far away from ━━━━━━
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫         救救孩子,bug勿扰...
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━ bug with the more protecting ━━━
 *
 * @autor lwj
 * @version 1.0.0
 * Created by 2025年-08月
 */

/** 格式化打印回撤结果 */

var isDebug = true
var mProfitInTheOppositeDirection = false// false 表示顺势盈利， true 表示逆势盈利


private var isWin0_382 = false
private var isWin0_5 = false
private var isWin0_618 = false
private var isWin0_786 = false
private var isWin1 = false
private var isWin1_382 = false
private var isWin1_5 = false
private var isWin1_618 = false
private var isWin2 = false
private var isWin2_618 = false


private var isFail0_618 = false
private var isFail0_786 = false
private var isFail1 = false
private var isFail1_382 = false



private var isEnter0_236 = false
private var isEnter0_382 = false
private var isEnter0_5 = false
private var isEnter0_618 = false

enum class Percent{
    IsO_236,
    IsO_382,
    IsO_5,
    IsO_618,
    Is0_786,
    Is1,
    Is1_382,
    Is1_5,
    Is1_618,
    Is2,
    Is2_618
}



/**
 * @param enter 进场
 * @param win 止盈
 * @param fail 止损
 * */
fun setPercent(enter: Percent, win: Percent, fail: Percent){
    isEnter0_236 = false
    isEnter0_382 = false
    isEnter0_5 = false
    isEnter0_618 = false


    isWin0_382 = false
    isWin0_5 = false
    isWin0_618 = false
    isWin0_786 = false
    isWin1 = false
    isWin1_382 = false
    isWin1_5 = false
    isWin1_618 = false
    isWin2 = false
    isWin2_618 = false


    isFail0_618 = false
    isFail0_786 = false
    isFail1 = false
    isFail1_382 = false

    when(enter) {
        Percent.IsO_236 -> isEnter0_236 = true
        Percent.IsO_382 -> isEnter0_382 = true
        Percent.IsO_5 -> isEnter0_5 = true
        Percent.IsO_618 -> isEnter0_618 = true
        else -> {}
    }


    when(win) {
        Percent.IsO_382 -> isWin0_382 = true
        Percent.IsO_5 -> isWin0_5 = true
        Percent.IsO_618 -> isWin0_618 = true
        Percent.Is0_786 -> isWin0_786 = true
        Percent.Is1 -> isWin1 = true
        Percent.Is1_382 -> isWin1_382 = true
        Percent.Is1_5 -> isWin1_5 = true
        Percent.Is1_618 -> isWin1_618 = true
        Percent.Is2 -> isWin2 = true
        Percent.Is2_618 -> isWin2_618 = true
        else -> {}
    }


    when(fail) {
        Percent.IsO_618 -> isFail0_618 = true
        Percent.Is0_786 -> isFail0_786 = true
        Percent.Is1 -> isFail1 = true
        Percent.Is1_382 -> isFail1_382 = true
        else -> {}
    }
}





/** 格式化打印回撤结果 */
fun printRetracements(name: String, retracements: Map<Double, Double>, isShort: Boolean = false, isReverse: Boolean = false) {
    if(isDebug){
        printDebug(name, retracements, isShort, isReverse)
    }else{
        printRelease(name, retracements, isShort, isReverse)
    }
}

/**
 * @param isReverse true是逆势方向的斐波那契, false是顺势方向的斐波那契
 * */
private fun printRelease(name: String, retracements: Map<Double, Double>, isShort: Boolean = false, isReverse: Boolean = false) {
    println()
    println("$name 斐波那契回撤位：")
    println("| 价格    |   水平     |")
    println("|---------|------------|")
    retracements.entries.sortedBy { it.key }.forEach { (level, price) ->
        //            println("| ${"%.1f%%".format(level * 100)} | ${"%.4f".format(price)} |")
        if(isShort){//打短
            if(isReverse){//反方向斐波那契扩展
                var endTag = ""
                endTag = when(level){
                    0.236 -> "进场 (起涨的第一根大阳或者大阴)"
                    0.382 -> "进场 (上一根k线是趋势变弱的大阳或大阴)"
                    0.5 -> "进场 (求稳)"
                    0.618 -> "止损位1 （趋势变弱推荐）"
                    0.786 -> "止损位2 （趋势变弱且可能反转推荐）"
                    1.0 -> "止损位3"
                    else -> ""
                }
                println("| ${"%.4f".format(price)} | ${level} | ${endTag}")
            }else{
                var endTag = ""
                endTag = when(level){
                    0.618 -> "止盈位1"
                    0.786 -> "止盈位2 (大阳或大阴线后，但趋势已经变弱)"
                    1.0 -> "止盈位3 (起涨第一根大阳或大阴后)"
                    else -> ""
                }
                println("| ${"%.4f".format(price)} | ${level} | ${endTag}")
            }
        }else{
            var endTag = ""
            endTag = when(level){
                0.5 -> "----------"
                1.0 -> "----------"
                1.618 -> "----------"
                else -> ""
            }
            println("| ${"%.4f".format(price)} | ${level} | ${endTag}")
        }

    }
}




private fun printDebug(name: String, retracements: Map<Double, Double>, isShort: Boolean = false, isReverse: Boolean = false) {
    println()
    println("| 价格    |   水平     |")
    println("|---------|------------|")
    retracements.entries.sortedBy { it.key }.forEach { (level, price) ->

        //            println("| ${"%.1f%%".format(level * 100)} | ${"%.4f".format(price)} |")
        if(isShort){//打短
            if(isReverse){//反方向斐波那契扩展
                var endTag = ""
                when(level){
                    0.236 -> {
                        if(!mProfitInTheOppositeDirection){//顺势方向
                            endTag = "进场"
                            if(isEnter0_236){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }
                    }

                    0.382 -> {
                        if(!mProfitInTheOppositeDirection){
                            endTag = "进场"
                            if(isEnter0_382){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }else{
                            endTag = "止盈位"
                            if(isWin0_382){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }
                    }

                    0.5 -> {
                        if(!mProfitInTheOppositeDirection){
                            endTag = "进场"
                            if(isEnter0_5){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }else{
                            endTag = "止盈位"
                            if(isWin0_5){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }
                        //                        println("| ${"%.4f".format(price)} | ${endTag}")

                    }

                    0.618 -> {
                        if(!mProfitInTheOppositeDirection){

                            if(isEnter0_618){
                                endTag = "进场"
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }


                            if(isFail0_618){
                                endTag = "止损位"
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }else{
                            endTag = "止盈位"
                            if(isWin0_618){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }


                    }

                    0.786 -> {
                        if(!mProfitInTheOppositeDirection){
                            endTag = "止损位"
                            if(isFail0_786){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }else{
                            endTag = "止盈位"
                            if(isWin0_786){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }


                    }
                    1.0 -> {
                        if(!mProfitInTheOppositeDirection){
                            endTag = "止损位"
                            if(isFail1){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }else{
                            endTag = "止盈位"
                            if(isWin1){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }


                    }

                    1.382 -> {
                        if(!mProfitInTheOppositeDirection){
                            endTag = "止损位"
                            if(isFail1_382){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }else{
                            endTag = "止盈位"
                            if(isWin1_382){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }


                    }

                    1.618 -> {
                        if(!mProfitInTheOppositeDirection){

                        }else{
                            endTag = "止盈位"
                            if(isWin1_618){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }
                    }

                    2.0 -> {
                        if(!mProfitInTheOppositeDirection){

                        }else{
                            endTag = "止盈位"
                            if(isWin2){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }
                    }

                    2.618 -> {
                        if(!mProfitInTheOppositeDirection){

                        }else{
                            endTag = "止盈位"
                            if(isWin2_618){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }
                    }

                    else -> {}
                }


                //                println("| ${"%.4f".format(price)} | ${level} | ${endTag}")
            }else{//顺势斐波那契
                var endTag = ""
                when(level){
                    0.236 -> {
                        if(mProfitInTheOppositeDirection){//反方向盈利，表示反转
                            endTag = "进场"
                            if(isEnter0_236){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }
                    }

                    0.382 -> {
                        if(mProfitInTheOppositeDirection){
                            endTag = "进场"
                            if(isEnter0_382){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }else{
                            endTag = "止盈位"
                            if(isWin0_382){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }
                    }

                    0.5 -> {
                        if(mProfitInTheOppositeDirection){
                            endTag = "进场"
                            if(isEnter0_5){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }else{
                            endTag = "止盈位"
                            if(isWin0_5){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }
                        //                        println("| ${"%.4f".format(price)} | ${endTag}")

                    }

                    0.618 -> {
                        if(mProfitInTheOppositeDirection){

                            if(isEnter0_618){
                                endTag = "进场"
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }


                            if(isFail0_618){
                                endTag = "止损位"
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }else{
                            endTag = "止盈位"
                            if(isWin0_618){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }


                    }

                    0.786 -> {
                        if(mProfitInTheOppositeDirection){
                            endTag = "止损位"
                            if(isFail0_786){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }else{
                            endTag = "止盈位"
                            if(isWin0_786){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }


                    }
                    1.0 -> {
                        if(mProfitInTheOppositeDirection){
                            endTag = "止损位"
                            if(isFail1){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }else{
                            endTag = "止盈位"
                            if(isWin1){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }


                    }

                    1.382 -> {
                        if(mProfitInTheOppositeDirection){
                            endTag = "止损位"
                            if(isFail1_382){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }else{
                            endTag = "止盈位"
                            if(isWin1_382){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }


                    }

                    1.618 -> {
                        if(mProfitInTheOppositeDirection){

                        }else{
                            endTag = "止盈位"
                            if(isWin1_618){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }
                    }

                    2.0 -> {
                        if(mProfitInTheOppositeDirection){

                        }else{
                            endTag = "止盈位"
                            if(isWin2){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }
                    }

                    2.618 -> {
                        if(mProfitInTheOppositeDirection){

                        }else{
                            endTag = "止盈位"
                            if(isWin2_618){
                                println("| ${"%.4f".format(price)} | ${endTag}")
                            }
                        }
                    }
                    else -> {}
                }

                //                println("| ${"%.4f".format(price)} | ${level} | ${endTag}")
            }
        }else{
            var endTag = ""
            endTag = when(level){
                0.5 -> "----------"
                1.0 -> "----------"
                1.618 -> "----------"
                else -> ""
            }
            println("| ${"%.4f".format(price)} | ${level} | ${endTag}")
        }

    }
}