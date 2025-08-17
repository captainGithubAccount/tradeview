package com.captain.tradingfinal.`fun`

import com.captain.tradingfinal.base.BaseFib
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
object FibNormal {
    fun up(start: Double, end: Double){
        isDebug = false
        val map = BaseFib.up(start, end)
        printRetracements("上升趋势回撤", map)

    }


    fun down(start: Double, end: Double){
        isDebug = false
        val map = BaseFib.down(start, end)
        printRetracements("下降趋势回撤", map)
    }
}