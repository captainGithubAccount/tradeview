package com.captain.tradingfinal.`fun`

import com.captain.tradingfinal.base.BaseFibExtend
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
* 单根k线斐波那契拓展
* */
object KExtend {

    fun up(trendStart: Double, trendEnd: Double) {
        val map2 = BaseFibExtend.upReverse(trendStart, trendEnd, trendEnd)
        printRetracements("上升单根k线反方向斐波拓展", map2, true, true)

        val map = BaseFibExtend.up(trendStart, trendEnd, trendEnd)
        printRetracements("上升单根k线斐波拓展", map, true, false)
    }


    fun down(trendStart: Double, trendEnd: Double) {
        val map2 = BaseFibExtend.downReverse(trendStart, trendEnd, trendEnd)
        printRetracements("下降单根k线反方向斐波拓展", map2, true, true)

        val map = BaseFibExtend.down(trendStart, trendEnd, trendEnd)
        printRetracements("下降单根k线", map, true, false)


    }
}