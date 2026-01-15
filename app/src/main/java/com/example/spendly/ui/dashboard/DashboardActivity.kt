package com.example.spendly.ui.dashboard

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.spendly.R
import com.example.spendly.ui.base.BaseActivity

class DashboardActivity : BaseActivity() {

    private val viewModel: DashboardViewModel by viewModels()
    private var uiState = DashboardUiState()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
    }
}