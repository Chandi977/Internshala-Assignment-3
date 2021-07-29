package com.charan.loginandregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {
    lateinit var txtData: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        txtData = findViewById(R.id.txtDashboard)
        if (intent != null) {
            val details = intent.getBundleExtra("details")
            val data = details?.getString("data")
            if (data == "login") {
                val text = "Mobile Number : ${details.getString("mobile")} \n " +
                        "Password : ${details.getString("password")}"
                txtData.text = text
            }
            if (data == "register") {
                val text = " Name : ${details.getString("name")} \n " +
                        "Mobile Number : ${details.getString("mobile")} \n " +
                        "Password : ${details.getString("password")} \n " +
                        "Address: ${details.getString("address")}"
                txtData.text = text
            }
            if (data == "forgot") {
                val text = "Mobile Number : ${details.getString("mobile")} \n " +
                        "Email : ${details.getString("email")}"
                txtData.text = text
            }
        } else {
            /*No data was received through the intent*/
            txtData.text = "Text will not be null"
        }
    }
}