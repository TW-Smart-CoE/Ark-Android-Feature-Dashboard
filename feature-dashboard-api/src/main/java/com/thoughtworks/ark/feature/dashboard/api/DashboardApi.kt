package com.thoughtworks.ark.feature.dashboard.api

import android.content.Context
import com.thoughtworks.ark.router.annotation.Service

@Service
interface DashboardApi {
    fun showToast(context: Context, msg: String)
}