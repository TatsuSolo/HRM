package com.foysal.practice.hrm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import es.dmoral.toasty.Toasty


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editId = findViewById<EditText>(R.id.login_id)
        var editPass = findViewById<EditText>(R.id.login_pass)
        val loginBtn = findViewById<Button>(R.id.btn_login)

        loginBtn.setOnClickListener {
            if(editId.text.toString().isEmpty()){
                Toasty.warning(this,
                    "Please Enter Your Id", Toast.LENGTH_SHORT).show()
            }else if(editPass.text.toString().isEmpty()){
                Toasty.warning(this,
                    "Please Enter Your Password", Toast.LENGTH_SHORT).show()
            }else{

            }
        }
    }
}