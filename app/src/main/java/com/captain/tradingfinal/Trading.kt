package com.captain.tradingfinal

import com.captain.tradingfinal.base.Percent
import com.captain.tradingfinal.base.isDebug
import com.captain.tradingfinal.base.mProfitInTheOppositeDirection
import com.captain.tradingfinal.base.setPercent
import com.captain.tradingfinal.`fun`.KExtend

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



fun main(){
    isDebug = false
    mProfitInTheOppositeDirection = false// false 表示顺势， true 表示逆势
    setPercent(enter = Percent.IsO_618, win = Percent.Is1_382, fail = Percent.Is1)

    val base = 0.0
    val start = 3560.260
    val end = 3545.870
    val isDown = true

    if(isDown){
        KExtend.down(base+ start, base + end)
    }else{
        KExtend.up(base+ start, base + end)
    }

//    KFibExtend.up(base+ start, base + end)
//    FibNormal.down(base+ start, base + end)
}










