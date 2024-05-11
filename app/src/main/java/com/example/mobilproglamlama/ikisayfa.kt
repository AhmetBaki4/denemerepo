package com.example.mobilproglamlama

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ikisayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikisayfa)
val etiketkutusu: TextView = findViewById(R.id.tvMesaj)
        val gelen_icerik = intent.getStringExtra("ICERIK")
        etiketkutusu.text= gelen_icerik

    }
}