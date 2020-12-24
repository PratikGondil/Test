package com.sride.modules.userdatamodule.viewmodel

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sride.modules.apirepository.repositories.apicallbacks.user.response.IGetWheatherDataResponse
import com.sride.modules.apirepository.repositories.frameworkrequest.wheather.WheatherDataRepository
import com.sride.modules.apirepository.repositories.model.wheather.objWheatherData
import com.sride.modules.covidstatmodule.uiListner.IWheatherDataHandler
import com.sride.modules.covidstatmodule.uiListner.IUserDataView

class WheatherDataViewModel(application: Application) : AndroidViewModel(application), IWheatherDataHandler, IGetWheatherDataResponse {
    lateinit var IUserDataView: IUserDataView
    var responseobserver: MutableLiveData<objWheatherData> = MutableLiveData()
    var temp = ObservableField<String>()
    var minTemp = ObservableField<String>()
    var maxTemp = ObservableField<String>()
    var day = ObservableField<String>()

    override fun callWheatherDataAPI(startdate: String, endDate: String) {
        WheatherDataRepository.apiWheatherDataReq(this, startdate,endDate)
    }

    override fun onSuccessResponse(response: objWheatherData?, isError: Boolean) {
        responseobserver.value = response
    }

    override fun onFailureResponse() {


    }

    fun onDateSelection() {
        IUserDataView.callDatePicker()
    }


}