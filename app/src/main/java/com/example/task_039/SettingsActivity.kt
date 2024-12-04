package com.example.task_039

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.task_039.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.brightnessBTN.setOnClickListener{
            Toast.makeText(
                applicationContext,
                "Появляется окно настроек яркости",
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.contrastsBTN.setOnClickListener{
            Toast.makeText(
                applicationContext,
                "Появляется окно настроек контрастности",
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.scalingBTN.setOnClickListener{
            Toast.makeText(
                applicationContext,
                "Появляется окно настроек масштабирования",
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.returnBTN.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java) ;
            startActivity(intent)
        }
    }
}