package com.fl.formlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username: String = "admin"
        val password: String = "admin1234"

        val Username: EditText = findViewById(R.id.username)
        val Password: EditText = findViewById(R.id.password)
        val Button: Button = findViewById(R.id.button)

        Button.setOnClickListener(View.OnClickListener {
            if (Username.text.isEmpty() || Password.text.isEmpty()) {
                Toast.makeText(this, "Data tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            }
            else if (Username.text.toString().equals(username) && Password.text.toString().equals(password)) {
                kotlin.run {
                    Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show()
                    val intent1 = Intent(this@MainActivity, SecondActivity::class.java)
                    startActivity(intent1)
                }
            }
            else {
                Toast.makeText(this, "Login Gagal!", Toast.LENGTH_SHORT).show()
            }
    })
    }
}
