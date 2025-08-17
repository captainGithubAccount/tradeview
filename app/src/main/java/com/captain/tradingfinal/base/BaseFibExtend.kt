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
object BaseFibExtend {
    // 定义常用的斐波那契比例集合
    private val FIB_RATIOS = listOf(0.0, 0.236, 0.382, 0.5, 0.618, 0.786, 1.0, 1.382, 1.5 ,1.618, 2.0, 2.618)





    /**
     * 计算上涨趋势的斐波那契扩展位
     * @param trendStart 上升趋势起点（最低点）
     * @param trendEnd 上升趋势终点（最高点）
     * @param newStart 新的起涨点（回调结束位置）
     */
    fun up(trendStart: Double, trendEnd: Double, newStart: Double): Map<Double, Double> {
        val trendRange = trendEnd - trendStart
        val map =  FIB_RATIOS.associateWith { ratio ->
            newStart + (trendRange * ratio)  // 公式：新起点 + 趋势幅度 × 比例
        }

//        printRetracements(title, map)

        return map
    }


    /**
     * 计算下跌趋势的斐波那契扩展位
     * @param trendStart 下跌趋势起点（最高点）
     * @param trendEnd 下跌趋势终点（最低点）
     * @param newStart 新的起跌点（反弹结束位置）
     */
    fun down(trendStart: Double, trendEnd: Double, newStart: Double): Map<Double, Double> {
        val trendRange = trendStart - trendEnd
        val map =  FIB_RATIOS.associateWith { ratio ->
            newStart - (trendRange * ratio)  // 公式：新起点 - 趋势幅度 × 比例
        }

//        printRetracements(title, map)
        return map
    }



    /**
     * 计算上涨反方向扩展位（用于下跌趋势的反向止损）
     * @param high 下跌起始点（最高价）
     * @param low 下跌结束点（最低价）
     * @param pullback 当前反弹位
     * @return 比率-价格映射表（比率从大到小排序）
     */
    fun upReverse(
        high: Double,
        low: Double,
        pullback: Double
    ): Map<Double, Double> {
        val moveDown = high - low
        val map =  FIB_RATIOS.associateWith { ratio ->
            pullback + moveDown * ratio
        }

        return map
    }

    /**
     * 计算下跌反方向扩展位（用于上涨趋势的反向止损）
     * @param low 上涨起始点（最低价）
     * @param high 上涨结束点（最高价）
     * @param pullback 当前回撤位
     * @return 比率-价格映射表（比率从大到小排序）
     */
    fun downReverse(
        low: Double,
        high: Double,
        pullback: Double
    ): Map<Double, Double> {
        val moveUp = high - low
        val map = FIB_RATIOS.associateWith { ratio ->
            pullback - moveUp * ratio
        }

        return map
    }



}