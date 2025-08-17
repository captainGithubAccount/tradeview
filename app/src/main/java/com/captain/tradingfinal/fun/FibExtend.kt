package com.captain.tradingfinal.`fun`

import com.captain.tradingfinal.base.BaseFibExtend
import com.captain.tradingfinal.base.isDebug
import com.captain.tradingfinal.base.printRetracements

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

/*
* 斐波那契拓展
* */
object FibExtend {

    fun up(trendStart: Double, trendEnd: Double, newStart: Double) {
        isDebug = false
        val map = BaseFibExtend.up(trendStart, trendEnd, newStart)
        printRetracements("上升趋势拓展", map)
    }




    fun down(trendStart: Double, trendEnd: Double, newStart: Double) {
        isDebug = false
        val map = BaseFibExtend.down(trendStart, trendEnd, newStart)
        printRetracements("下降趋势拓展", map)
    }
}