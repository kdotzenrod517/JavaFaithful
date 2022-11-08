package com.android.example.javafaithful

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.example.javafaithful.R
import com.android.example.javafaithful.Dog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDawg = Dog("Fido", 3)
    }
}