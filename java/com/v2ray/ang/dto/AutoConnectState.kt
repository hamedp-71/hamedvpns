package com.v2ray.ang.dto

sealed class AutoConnectState {

    
    object Idle : AutoConnectState()

    
    object Connecting : AutoConnectState()

    
    data class Testing(val testedCount: Int, val total: Int) : AutoConnectState()

    
    data class Connected(val guid: String, val delayMillis: Long) : AutoConnectState()

    
    object AllFailed : AutoConnectState()
}
