package edu.ubaguio.madalangproject

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Eventscheduler : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eventscheduler)

        val reciepients = findViewById<EditText>(R.id.reciepeints)
        val date = findViewById<EditText>(R.id.datee)
        val timestarts = findViewById<EditText>(R.id.timestarts)
        val timeends = findViewById<EditText>(R.id.timeends)
        val title = findViewById<EditText>(R.id.titlell)
        val venue = findViewById<EditText>(R.id.venue)




        val saveBtn = findViewById<Button>(R.id.save)

        saveBtn.setOnClickListener {
            //get text from edittexts
            val name = reciepients.text.toString()
            val date = date.text.toString()
            val timestarts = timestarts.text.toString()
            val timeends = timeends.text.toString()
            val title = title.text.toString()
            val venue = venue.text.toString()





            //intent to start activity
            val intent = Intent(this@Eventscheduler, Events::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("date", date)
            intent.putExtra("Time starts", timestarts)
            intent.putExtra("time ends", timeends)
            intent.putExtra("title", title)
            intent.putExtra("venue", venue)




            startActivity(intent)

        }
        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener{
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }


    }
}