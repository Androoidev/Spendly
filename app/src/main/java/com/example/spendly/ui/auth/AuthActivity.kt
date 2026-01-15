package com.example.spendly.ui.auth

import android.os.Bundle
import android.content.Intent
import androidx.activity.viewModels
import androidx.appcompat.widget.AppCompatButton
import com.example.spendly.R
import com.example.spendly.ui.base.BaseActivity
import com.example.spendly.ui.dashboard.DashboardActivity

class AuthActivity : BaseActivity() {

    private lateinit var btnNavigate : AppCompatButton
    private val viewModel: AuthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        btnNavigate = findViewById(R.id.btnNavigate)

        btnNavigate.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}