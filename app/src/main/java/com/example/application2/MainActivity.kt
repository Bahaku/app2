package com.example.application2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val go = findViewById<Button>(R.id.Goo)

        go.setOnClickListener {
            val intent = Intent(applicationContext, ChoiseActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val checkedBox = data?.getBooleanExtra("chbb1", false)
        val chechedBox1 = data?.getBooleanExtra("chbb2", false)
        val film1 = findViewById<TextView>(R.id.choise1)
        val film2 = findViewById<TextView>(R.id.choise2)
        val film3 = findViewById<TextView>(R.id.choise3)
        val checkedBox2 = data?.getBooleanExtra("chbb3", false)
        val notChoise = "Не выбрано"



        if (requestCode == 1 && resultCode == Activity.RESULT_OK && checkedBox!!){
            Toast.makeText(applicationContext, "Сработало", Toast.LENGTH_LONG).show()
            val textFilm1 = data?.getStringExtra("fildText")
            film1.text = textFilm1
        } else{
            film1.text = notChoise
        }
        if (requestCode == 1 && resultCode == Activity.RESULT_OK && chechedBox1!!){
            val textFilm2 = data?.getStringExtra("fildText1")
            film2.text = textFilm2
        } else{
            film2.text = notChoise

        }
        if (requestCode == 1 && resultCode == Activity.RESULT_OK && checkedBox2!!){
        val textFilm3 = data?.getStringExtra("fildText2")
        film3.text = textFilm3
    } else{
        film3.text = notChoise
    }
}}