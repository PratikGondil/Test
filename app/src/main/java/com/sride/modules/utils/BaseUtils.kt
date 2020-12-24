package com.sride.modules.utils

import android.app.Activity
import android.app.ProgressDialog
import android.content.Context

object BaseUtils {

    lateinit var progressDialog: ProgressDialog
    fun showProgress(activity :Activity) {
        progressDialog = ProgressDialog(activity)
        progressDialog.setMessage("Application is loading, please wait")
        progressDialog.show()
    }

    fun stopProgress() {
     progressDialog.hide()
    }

}