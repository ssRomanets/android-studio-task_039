package com.example.task_039

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task_039.databinding.ActivityChatBinding

class ChatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.authorTV.text=  "author existence"
        binding.partnerTV.text= "partner existence"

        binding.returnBTN.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java) ;
            startActivity(intent)
        }
    }
}