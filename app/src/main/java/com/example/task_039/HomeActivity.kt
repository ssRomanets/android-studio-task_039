package com.example.task_039

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.task_039.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.inputBTN.setOnClickListener{
            Toast.makeText(applicationContext, "Идет вход в проект", Toast.LENGTH_SHORT).show()
        }

        binding.returnBTN.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java) ;
            startActivity(intent)
        }
    }
}