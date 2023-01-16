package com.thoughtworks.ark.feature.dashboard

import androidx.fragment.app.Fragment
import com.thoughtworks.ark.feature.dashboard.api.DashboardApi
import com.thoughtworks.ark.feature.dashboard.ui.DashboardFragment
import com.thoughtworks.ark.router.annotation.ServiceImpl

@ServiceImpl
class DashboardApiImpl : DashboardApi {
    override fun getDashboardFragment(): Fragment {
        return DashboardFragment()
    }
}