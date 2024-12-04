package com.example.task_039

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.task_039.databinding.ActivityWidgetsBinding

class WidgetsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWidgetsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWidgetsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.showDlgWindowsBTN.setOnClickListener{
            Toast.makeText(
                applicationContext,
                "Появляются диалоговые окна",
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.returnBTN.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java) ;
            startActivity(intent)
        }
    }
}