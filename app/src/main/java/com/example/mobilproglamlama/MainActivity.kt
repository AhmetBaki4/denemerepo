package com.example.mobilproglamlama

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val icerikKutusu: EditText = findViewById(R.id.editText2)
        val gonderButonu: Button = findViewById(R.id.btnGirisYap)
        gonderButonu.setOnClickListener {
            val kutuicerigi = icerikKutusu.text.toString()
            val  intent : Intent = Intent( this,ikisayfa::class.java)
            val name = icerikKutusu
            intent.putExtra( "ICERIK",kutuicerigi)
            startActivity(intent)

            println("ikinci commit")
        }
    }
}