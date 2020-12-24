package com.sride.modules.covidstatmodule.uiListner

interface IWheatherDataHandler {
    fun callWheatherDataAPI(trim: String, nextDate: String)

}