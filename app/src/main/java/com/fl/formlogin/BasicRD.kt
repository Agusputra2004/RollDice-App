package com.fl.formlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class BasicRD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_rd)

        val roll: Button = findViewById(R.id.btnroll)
        val res: Button = findViewById(R.id.btnres)
        val gdadu1: ImageView = findViewById(R.id.daduview)
        val txt: TextView = findViewById(R.id.ket)

        roll.setOnClickListener { lemparDadu() }
        res.setOnClickListener { resetDadu() }
//            val gambar : String = "1"
//            val a = gambar.toInt()
//            val drawableResource = when (a) {
//                1 -> R.drawable.empty_dice
//
//                else -> {R.drawable.empty_dice}
//            }
//            gdadu1.setImageResource(drawableResource)
//            txt.setText("")

    }

    private fun resetDadu() {
        val gdadu1: ImageView = findViewById(R.id.daduview)
        val txt: TextView = findViewById(R.id.ket)
        gdadu1.setImageResource(R.drawable.empty_dice)
        txt.setText("")
    }

    private fun lemparDadu() {
        val angkaRandom = (1..6).random()
        val gdadu: ImageView = findViewById(R.id.daduview)
        val txt1: TextView = findViewById(R.id.ket)

        val hasil = angkaRandom.toInt()
        txt1.text = hasil.toString()

        val drawableResource = when (angkaRandom) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        gdadu.setImageResource(drawableResource)
    }
}