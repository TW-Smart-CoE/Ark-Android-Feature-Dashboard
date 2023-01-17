package com.thoughtworks.ark.feature.dashboard

import android.content.Context
import androidx.lifecycle.ViewModel
import com.thoughtworks.ark.feature.home.api.HomeApi
import com.thoughtworks.ark.router.Router
import com.thoughtworks.ark.router.internal.InternalHelper.findFragmentActivity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

data class DashboardUiState(val label: String)

@HiltViewModel
class DashboardViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(DashboardUiState(label = "This is dashboard Fragment"))
    val uiState = _uiState.asStateFlow()

    fun increaseHomeCount(context: Context) {
        val fragmentActivity = context.findFragmentActivity()
        fragmentActivity?.let {
            val fragment = fragmentActivity.supportFragmentManager.findFragmentByTag("home")
            if (fragment != null) {
                val homeApi = Router.service<HomeApi>()
                homeApi.increaseHomeCount(fragment)
            }
        }
    }
}