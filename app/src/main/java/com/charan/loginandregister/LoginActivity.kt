package com.charan.loginandregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var txtRegister: TextView
    lateinit var btnLogin: Button
    lateinit var edtMobileNumber: EditText
    lateinit var edtPassword: EditText
    lateinit var txtForgotPassword: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        edtMobileNumber = findViewById(R.id.etMobileNumber)
        edtPassword = findViewById(R.id.etPassword)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegisterYourself)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword.setOnClickListener {
            startActivity(Intent(this@LoginActivity, ForgetPassword::class.java))
        }
        txtRegister.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
        }
        btnLogin.setOnClickListener {
            val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
            val bundle = Bundle()
            bundle.putString("data", "login")
            bundle.putString("mobile", edtMobileNumber.text.toString())
            bundle.putString("password", edtPassword.text.toString())
            intent.putExtra("details", bundle)
            startActivity(intent)
        }

    }
}