package com.captain.luo

import com.captain.luo.base.Percent
import com.captain.luo.base.isDebug
import com.captain.luo.base.mProfitInTheOppositeDirection
import com.captain.luo.base.setPercent
import com.captain.luo.`fun`.KExtend

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
    val start = 4331.095
    val end = 4334.610
    val isDown = false

    if(isDown){
        KExtend.down(base+ start, base + end)
    }else{
        KExtend.up(base+ start, base + end)
    }

//    KFibExtend.up(base+ start, base + end)
//    FibNormal.down(base+ start, base + end)
}










