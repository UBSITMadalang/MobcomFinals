package edu.ubaguio.madalangproject

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

class Profile : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)








        val eventscheduler = findViewById<Button>(R.id.Eventscheduler)

        val logouta = findViewById<Button>(R.id.logoutout)
        val button = findViewById<Button>(R.id.button2)

        //get data from intent
        val intent = intent
        val name = intent.getStringExtra("Name")



        //textview
        val resultTv = findViewById<TextView>(R.id.resultTv)
        //setText
        resultTv.text = "Welcome: "+name


        button.setOnClickListener{
            val intent = Intent(this, EditProfile::class.java)
            startActivity(intent)
        }


        logouta.setOnClickListener{
            val intent = Intent(this, Signin::class.java)
            startActivity(intent)
        }



        eventscheduler.setOnClickListener{
            val intent = Intent(this, Eventscheduler::class.java)
            startActivity(intent)
        }
    }
}