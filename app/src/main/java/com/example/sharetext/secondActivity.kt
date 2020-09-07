package com.example.sharetext

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class secondActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val message=intent.getStringExtra(EXTRA_MESSAGE)
        val textview=findViewById<TextView>(R.id.viewText).apply{
            text=message
        }
    }
}