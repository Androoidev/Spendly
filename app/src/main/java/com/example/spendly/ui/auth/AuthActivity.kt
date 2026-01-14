package com.example.spendly.ui.auth

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.spendly.R
import com.example.spendly.ui.dashboard.DashboardActivity

class AuthActivity : AppCompatActivity() {
    private lateinit var btnNavigate : AppCompatButton
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