package com.charan.loginandregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout

class RegisterActivity : AppCompatActivity() {
    lateinit var btnRegister: Button
    lateinit var edtName: EditText
    lateinit var edtPhoneNumber: EditText
    lateinit var edtPassword: EditText
    lateinit var edtEmail: EditText
    lateinit var edtAddress: EditText
    lateinit var edtConfirmPassword: EditText
    lateinit var rlRegister: RelativeLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.title = "Register Yourself"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        rlRegister = findViewById(R.id.rlRegister)
        edtName = findViewById(R.id.edtRegisterName)
        edtPhoneNumber = findViewById(R.id.edtRegisterPhoneNumber)
        edtEmail = findViewById(R.id.edtRegisterEmail)
        edtPassword = findViewById(R.id.edtRegisterPassword)
        edtConfirmPassword = findViewById(R.id.edtRegisterConfirmPassword)
        edtAddress = findViewById(R.id.edtRegisterAddress)
        btnRegister = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener {
            val intent = Intent(this@RegisterActivity, DashboardActivity::class.java)
            val bundle = Bundle()
            bundle.putString("data", "register")
            bundle.putString("name", edtName.text.toString())
            bundle.putString("mobile", edtPhoneNumber.text.toString())
            bundle.putString("password", edtPassword.text.toString())
            bundle.putString("address", edtAddress.text.toString())
            intent.putExtra("details", bundle)
            startActivity(intent)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
