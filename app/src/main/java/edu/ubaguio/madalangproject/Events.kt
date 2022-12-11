package edu.ubaguio.madalangproject

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Events : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)

        //get data from intent
        val intent = intent
        val name = intent.getStringExtra("Name")
        val date = intent.getStringExtra("date")
        val timestarts = intent.getStringExtra("time starts")
        val timeends = intent.getStringExtra("time ends")
        val title = intent.getStringExtra("title")
        val venue = intent.getStringExtra("venue")




        //textview
        val resultTv = findViewById<TextView>(R.id.resultTv)
        //setText
        resultTv.text = "Name: "+name+"\nDate: "+date+"\nTime Starts: "+timestarts+"\nTime Ends: "+timeends+"\nTitle: "+title+"\nVenue: "+venue



    }
}