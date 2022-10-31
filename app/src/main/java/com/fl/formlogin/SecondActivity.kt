package com.fl.formlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val BtnRd: Button = findViewById(R.id.button)
        val BtnCd: Button = findViewById(R.id.button22)

        BtnRd.setOnClickListener(View.OnClickListener {
            kotlin.run {
                val pindah = Intent(this@SecondActivity, BasicRD::class.java)
                startActivity(pindah)
            }
        })

        BtnCd.setOnClickListener(View.OnClickListener {
            kotlin.run {
                val pindah2 = Intent(this@SecondActivity, DiceRole::class.java)
                startActivity(pindah2)
            }
        })
    }
}