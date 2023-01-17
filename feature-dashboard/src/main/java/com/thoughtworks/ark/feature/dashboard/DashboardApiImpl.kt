package com.thoughtworks.ark.feature.dashboard

import android.content.Context
import android.widget.Toast
import com.thoughtworks.ark.feature.dashboard.api.DashboardApi
import com.thoughtworks.ark.router.annotation.ServiceImpl

@ServiceImpl
class DashboardApiImpl : DashboardApi {
    override fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}