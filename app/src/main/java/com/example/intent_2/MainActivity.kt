package com.example.intent_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.eT1
import kotlinx.android.synthetic.main.activity_main.eT2
import kotlinx.android.synthetic.main.activity_main.eT3
import kotlinx.android.synthetic.main.activity_main.eT4
import kotlinx.android.synthetic.main.activity_main.orderBtn

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        orderBtn.setOnClickListener {
            val orderList=eT1.text.toString()+" "+eT2.text.toString()+" "+eT3.text.toString()+" "+eT4.text.toString()

            intent=Intent(this,SecondScreen::class.java)

            intent.putExtra("allOrders",orderList)
            startActivity(intent)
        }
    }
}