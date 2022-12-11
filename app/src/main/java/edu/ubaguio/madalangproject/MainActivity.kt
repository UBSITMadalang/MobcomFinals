package edu.ubaguio.madalangproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

import edu.ubaguio.madalangproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val loginn = findViewById<Button>(R.id.mainsigninbtn)
        loginn.setOnClickListener{
            val intent = Intent(this, Signin::class.java)
            startActivity(intent)
        }
        val register = findViewById<Button>(R.id.mainsignupbtn)
        register.setOnClickListener{
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }


    }
}