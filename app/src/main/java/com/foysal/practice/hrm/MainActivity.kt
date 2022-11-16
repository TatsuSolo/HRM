package com.foysal.practice.hrm

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import es.dmoral.toasty.Toasty


class MainActivity : AppCompatActivity() {

    private var loginList: ArrayList<Login>?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loginList = LoginDetails.getLogin()
        Log.i("login Size", "${loginList!!.size}")
        var editId = findViewById<EditText>(R.id.login_id)
        var editPass = findViewById<EditText>(R.id.login_pass)
        val loginBtn = findViewById<Button>(R.id.btn_login)

        /*login("1", "1234", loginList!!)*/

        loginBtn.setOnClickListener {

            val id = editId.text.toString()
            val pass = editPass.text.toString()

            if(editId.text.toString().isEmpty()){
                Toasty.warning(this,
                    "Please Enter Your Id", Toast.LENGTH_SHORT).show()
            }else if(editPass.text.toString().isEmpty()){
                Toasty.warning(this,
                    "Please Enter Your Password", Toast.LENGTH_SHORT).show()
            }else{
                login(id, pass, loginList!!)
            }
        }
    }
    private fun login(id:String, password:String, user: ArrayList<Login>){

        for( i in user){
            if(i.id == id && i.password == password){
                /*Log.i("Size", "${i!!.tag}")*/
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("id", id)
                intent.putExtra("password", password)
                intent.putExtra("tag", i.tag)
                Toasty.success(this,"Success", Toast.LENGTH_SHORT).show()
                startActivity(intent)
                finish()
            }
        }

    }
}