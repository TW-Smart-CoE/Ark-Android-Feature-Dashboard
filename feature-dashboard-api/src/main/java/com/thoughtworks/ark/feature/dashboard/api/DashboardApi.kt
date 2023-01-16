package com.thoughtworks.ark.feature.dashboard.api

import androidx.fragment.app.Fragment
import com.thoughtworks.ark.router.annotation.Service

@Service
interface DashboardApi {
    fun getDashboardFragment(): Fragment
}