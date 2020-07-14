package com.example.withallah.java.withallah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.withallah.R
import kotlinx.android.synthetic.main.activity_azkar_source.*

class azkar_source : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_azkar_source)
    var int =intent.extras!!.getString("azkar")
    txt_azkar.text=int
    }
}