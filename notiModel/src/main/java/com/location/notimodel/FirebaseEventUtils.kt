package com.location.notimodel

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.annotation.Keep
import com.google.firebase.analytics.FirebaseAnalytics

@Keep
object FirebaseEventUtils {
    private var firebaseAnalytics: FirebaseAnalytics? = null

    fun initFirebase(context: Context) {
        firebaseAnalytics = FirebaseAnalytics.getInstance(context)
    }

    fun setAnalyticsEvent(
        eventName: String,
        value: String = "",
        context: Context,
    ) {
        firebaseAnalytics?.let {
            if (BlueTenOrgManager.isDebug) {
                Log.e("aaa", "setAnalyticsEvent: 埋点值 -- ${eventName}")
            }
            if (value.isEmpty()) {
                it.logEvent(eventName, null)
            } else {
                it.logEvent(eventName, Bundle().apply {
                    putString(eventName, value)
                })
            }
        } ?: kotlin.run {
            firebaseAnalytics = FirebaseAnalytics.getInstance(context)
            firebaseAnalytics?.let {
                if (BlueTenOrgManager.isDebug) {
                    Log.e("aaa", "setAnalyticsEvent: 埋点值 -- ${eventName}")
                }
                if (value.isEmpty()) {
                    it.logEvent(eventName, null)
                } else {
                    it.logEvent(eventName, Bundle().apply {
                        putString(eventName, value)
                    })
                }
            }
        }
    }
}