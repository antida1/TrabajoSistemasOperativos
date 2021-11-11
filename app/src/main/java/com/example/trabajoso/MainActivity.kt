package com.example.trabajoso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.view.*
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // get reference to all views
        var et_user_name = findViewById(R.id.editTextTextPersonName) as EditText
        var et_email = findViewById(R.id.editTextTextEmailAddress) as EditText
        var et_id = findViewById(R.id.editTextNumber) as EditText
        var btn_enviar = findViewById(R.id.button) as Button

        btn_enviar.setOnClickListener {
            val name = et_user_name.text;
            val email = et_email.text;
            val id = et_id.text;
            //Toast.makeText(this@MainActivity, user_name, Toast.LENGTH_LONG).show()
            print(name)
            print(email)
            print(id)

        }
    }





}