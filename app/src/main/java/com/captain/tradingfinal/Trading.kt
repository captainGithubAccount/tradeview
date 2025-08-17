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
    isDebug = true
    mProfitInTheOppositeDirection = false// false 表示顺势， true 表示逆势
    setPercent(enter = Percent.IsO_236, win = Percent.Is2, fail = Percent.Is0_786)

    val base = 117000
    val start = 671.30
    val end = 449.81
    val isDown = true
    if(isDown){
        KExtend.down(base+ start, base + end)
    }else{
        KExtend.up(base+ start, base + end)
    }

//    KFibExtend.up(base+ start, base + end)
//    FibNormal.down(base+ start, base + end)
}










