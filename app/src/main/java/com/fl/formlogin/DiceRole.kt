package com.fl.formlogin

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

const val EXTRA_MESSAGE = "com.fl.formlogin.MESSAGE"
val listhasil: MutableList<String> = mutableListOf<String>()

class DiceRole : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_role)

        //deklarasi variabel
        val rollButton: Button = findViewById(R.id.button)
        val hslButton: Button = findViewById(R.id.btnhasil)
        val rollButton1: Button = findViewById(R.id.button1)
        val randomInt = (1..6).random()
        val randomInt1 = (1..6).random()
        val resultText: TextView = findViewById(R.id.tagline)
        val resultText1: TextView = findViewById(R.id.tagline1)
        val hasil: TextView = findViewById(R.id.jawab)
        val rstt: Button = findViewById(R.id.rst)
        val hstr: Button = findViewById(R.id.bthstr)


        hstr.setOnClickListener{
                val htr = Intent(this@DiceRole, History::class.java)
                startActivity(htr)
        }
        rstt.setOnClickListener{ RstDice() }
        rollButton.setOnClickListener{ rollDice() }
            //toast atau notifikasi ketika dadu dilempar

//            val notif = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
//            notif.show()
//            val diceImage: ImageView = findViewById(R.id.imgview)
//            resultText.text = randomInt.toString()
//            val drawableResource = when (randomInt) {
//                1 -> R.drawable.dice_1
//                2 -> R.drawable.dice_2
//                3 -> R.drawable.dice_3
//                4 -> R.drawable.dice_4
//                5 -> R.drawable.dice_5
//                else -> R.drawable.dice_6
//            }
//            diceImage.setImageResource(drawableResource)


        rollButton1.setOnClickListener{ rollDice2()}
//            val hei = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
//            hei.show()
//            val diceImage1: ImageView = findViewById(R.id.imgview1)
//            resultText1.text = randomInt1.toString()
//            val drawableResource = when (randomInt1) {
//                1 -> R.drawable.dice_1
//                2 -> R.drawable.dice_2
//                3 -> R.drawable.dice_3
//                4 -> R.drawable.dice_4
//                5 -> R.drawable.dice_5
//                else -> R.drawable.dice_6
//            }
//            diceImage1.setImageResource(drawableResource)




        hslButton.setOnClickListener{

            btnhasil()
        }
//            val a = resultText.text.toString().toInt()
//            val b = resultText1.text.toString().toInt()
//            val hasil1 = a+b
//            hasil.text = hasil1.toString()


    }

    private fun RstDice() {
        val rt3: TextView = findViewById(R.id.tagline)
        val rt4: TextView = findViewById(R.id.tagline1)
        val di3: ImageView = findViewById(R.id.imgview)
        val di4: ImageView = findViewById(R.id.imgview1)
        val hsl1: EditText = findViewById(R.id.jawab)
        rt3.setText("")
        rt4.setText("")
        hsl1.setText("")
        di3.setImageResource(R.drawable.empty_dice)
        di4.setImageResource(R.drawable.empty_dice)
    }

    private fun btnhasil() {
        val resultText: TextView = findViewById(R.id.tagline)
        val resultText2: TextView = findViewById(R.id.tagline1)
        val hslhtg: EditText = findViewById(R.id.jawab)

        val r = resultText.text.toString().toInt()
        val a = resultText2.text.toString().toInt()

        val tambah = r+a
        val inputjwb = hslhtg.text.toString()
        val quest1 = resultText.text.toString()
        val quest2 = resultText2.text.toString()
        val answer =  tambah.toString()
        val yanswer = hslhtg.text.toString()


        if (inputjwb.isEmpty()) {
            hslhtg.error="Isi Terlebih Dahulu"
            Toast.makeText(this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show()


        }
        else {
            val hslinput: Int = inputjwb.toInt()
            if (hslinput==tambah) {
                Toast.makeText(this,"Jawaban Kamu Benar", Toast.LENGTH_SHORT).show()
//                listhasil.add("Jawab :"+yanswer+"\n Soal :"+quest1+"+"+quest2+"="+answer+"\nJawaban Kamu Benar")
//                listhasil.add("Keterangan : Benar")
                listhasil.add("Soal : "+quest1+" + "+quest2+" = "+answer+"\nJawaban Kamu : "+yanswer+"\nKeterangan : Benar")
            } else {
                Toast.makeText(this,"Jawaban Kamu Salah", Toast.LENGTH_SHORT).show()
//                listhasil.add("Jawab :"+yanswer+"\n Soal :"+quest1+"+"+quest2+"="+answer+"\nJawaban Kamu Salah")
//                listhasil.add("Keterangan : Salah")
                listhasil.add("Soal : "+quest1+" + "+quest2+" = "+answer+"\nJawaban Kamu : "+yanswer+"\nKeterangan : Salah")
            }

        }





    }

    private fun rollDice2() {

//        val randomInt = (1..6).random()
//        val drawableResource = when (randomInt) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
        val randomInt2 = (1..6).random()
        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val resultText2 : TextView = findViewById(R.id.tagline1)
        val diceImage1: ImageView = findViewById(R.id.imgview1)
//        resultText2.text = randomInt.toString()
        resultText2.text = randomInt2.toString()
//        diceImage.setImageResource(drawableResource)
        diceImage1.setImageResource(drawableResource2)

        val hasil = randomInt2.toInt()
        resultText2.text = hasil.toString()
    }

    private fun rollDice() {
        val resulttText : TextView = findViewById(R.id.tagline)
        val diceImage: ImageView = findViewById(R.id.imgview)
//        val diceImage1: ImageView = findViewById(R.id.imgview1)

        val randomInt = (1..6).random()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
//        }
//        val randomInt2 = (1..6).random()
//        val drawableResource2 = when (randomInt2) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
        }
        resulttText.text = randomInt.toString()
//        resulttText.text = randomInt2.toString()
        diceImage.setImageResource(drawableResource)
//        diceImage1.setImageResource(drawableResource)

        val hasil = randomInt.toInt()
        resulttText.text = hasil.toString()
    }

    //tampilan text view berubah ketika role dice


    }

