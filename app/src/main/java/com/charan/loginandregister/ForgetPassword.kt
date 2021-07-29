package com.charan.loginandregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ForgetPassword : AppCompatActivity() {
    lateinit var edtForgotMobile: EditText
    lateinit var edtForgotEmail: EditText
    lateinit var btnForgotNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        edtForgotMobile = findViewById(R.id.edtForgetMobile)
        edtForgotEmail = findViewById(R.id.edtForgotEmail)
        btnForgotNext = findViewById(R.id.btnForgotNext)
        btnForgotNext.setOnClickListener {
            val intent = Intent(this@ForgetPassword, DashboardActivity::class.java)
            val bundle = Bundle()
            bundle.putString("data", "forgot")
            bundle.putString("mobile", edtForgotMobile.text.toString())
            bundle.putString("email", edtForgotEmail.text.toString())
            intent.putExtra("details", bundle)
            startActivity(intent)
        }
    }
}