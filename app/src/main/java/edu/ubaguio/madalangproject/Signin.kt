package edu.ubaguio.madalangproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import edu.ubaguio.madalangproject.databinding.ActivitySigninBinding

class Signin : AppCompatActivity() {
    private lateinit var binding: ActivitySigninBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)


        firebaseAuth = FirebaseAuth.getInstance()
        binding.textView.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

        binding.button.setOnClickListener {
            val email = binding.emailEt.text.toString()
            val pass = binding.passET.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty()) {

                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val intent = Intent(this, Profile::class.java)
                        Toast.makeText(this, "User Successfully Signed in!!", Toast.LENGTH_SHORT).show()
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                    }
                }
            } else {
                Toast.makeText(this, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT).show()

            }
        }
        val nameEt = findViewById<EditText>(R.id.emailEt)


        val saveBtn = findViewById<Button>(R.id.button)

        //handle button click
        saveBtn.setOnClickListener {
            //get text from edittexts
            val name = nameEt.text.toString()



            //intent to start activity
            val intent = Intent(this@Signin, Profile::class.java)
            intent.putExtra("Name", name)


            startActivity(intent)

        }
    }
}