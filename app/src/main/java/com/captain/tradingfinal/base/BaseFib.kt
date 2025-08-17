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
object BaseFib {

    //斐波那契回撤比例
    private val fibLevels = listOf(0.0, 0.236, 0.382, 0.5, 0.618, 0.786, 1.0)

    /**
     * 计算上升趋势的回撤支撑位（从高点回落的支撑位置）
     * @param start 上升趋势起涨点（低点）
     * @param end 上升趋势终点（高点）
     * @return 回撤水平到价格的映射（水平值 -> 价格）
     */
    fun up(start: Double, end: Double): Map<Double, Double>{
        require(end > start) { "上升趋势要求终点价格必须大于起点价格" }
        val diff = end - start
        val map = fibLevels.associateWith { level ->
            end - (diff * level)  // 计算公式：高点 - (总涨幅 × 回撤率)
        }
//        printRetracements("上升趋势", map)
        return  map

    }

    /**
     * 计算下降趋势的回撤阻力位（从低点反弹的阻力位置）
     * @param start 下降趋势起跌点（高点）
     * @param end 下降趋势终点（低点）
     * @return 回撤水平到价格的映射（水平值 -> 价格）
     */
    fun down(start: Double, end: Double): Map<Double, Double>{
        require(end < start) { "下降趋势要求终点价格必须小于起点价格" }
        val diff = start - end
        val map =  fibLevels.associateWith { level ->
            end + (diff * level)  // 计算公式：低点 + (总跌幅 × 回撤率)
        }
//        printRetracements("下降趋势", map)
        return  map

    }
}