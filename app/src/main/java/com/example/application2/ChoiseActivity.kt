package com.example.application2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class ChoiseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choise)


        val chb1 = findViewById<CheckBox>(R.id.Film1)
        val chb2 = findViewById<CheckBox>(R.id.Film2)
        val chb3 = findViewById<CheckBox>(R.id.Film3)



        val buttom1 = findViewById<Button>(R.id.Back)

        buttom1.setOnClickListener {
            val intent = Intent()
                intent.putExtra("fildText", chb1.text.toString())
                intent.putExtra("chbb1", chb1.isChecked)
                setResult (Activity.RESULT_OK, intent)

                intent.putExtra("fildText1", chb2.text.toString())
                intent.putExtra("chbb2", chb2.isChecked)
                setResult(Activity.RESULT_OK, intent)

                intent.putExtra("fildText2", chb3.text.toString())
                intent.putExtra("chbb3", chb3.isChecked)
                setResult(Activity.RESULT_OK, intent)
                finish()
            }

        }
}
