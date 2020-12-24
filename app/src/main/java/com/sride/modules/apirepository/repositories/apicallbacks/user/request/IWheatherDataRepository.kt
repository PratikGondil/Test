package com.sride.modules.apirepository
import com.sride.modules.apirepository.repositories.apicallbacks.user.response.IGetWheatherDataResponse


/*
* Temporary Callback
 */
interface IWheatherDataRepository {

    fun apiWheatherDataReq(
        wheatherDataResponseListener: IGetWheatherDataResponse,
        date: String,
        endDate: String
    )



}