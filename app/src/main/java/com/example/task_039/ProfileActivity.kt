package com.example.task_039

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_039.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myFaceIV.setImageResource(R.drawable.my_face)
        binding.firstNameTV.text="Aleksandr"
        binding.lastNameTV.text="Romanets"
        binding.ageTV.text="43"

        binding.returnBTN.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java) ;
            startActivity(intent)
        }
    }
}