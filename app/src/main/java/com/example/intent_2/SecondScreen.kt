package com.example.intent_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_screen.textView

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)


        val orderList=intent.getStringExtra("allOrders")

        textView.text="Your Order : cm"+orderList.toString()
    }
}