package com.foysal.practice.hrm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.isVisible

class HomeActivity : AppCompatActivity() {

    lateinit var btnEntry: Button
    lateinit var btnAuthorize : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnEntry = findViewById(R.id.ho_act_ex)
        btnAuthorize = findViewById(R.id.ho_act_aut)


        val id = intent.getStringExtra("id")
        val password = intent.getStringExtra("password")
        val tag = intent.getStringExtra("tag")

        if(tag == "Employee"){
            btnAuthorize.isVisible = false
        }
    btnEntry.setOnClickListener {
        val intent = Intent(this, ExceptionEntryActivity::class.java)
        intent.putExtra("id", id)
        intent.putExtra("password", password)
        intent.putExtra("tag", tag)
        startActivity(intent)
    }
    btnAuthorize.setOnClickListener{
        val intent = Intent(this,ExceptionAuthorizeActivity::class.java )
        intent.putExtra("id", id)
        intent.putExtra("password", password)
        intent.putExtra("tag", tag)
        startActivity(intent)
    }

    }
}