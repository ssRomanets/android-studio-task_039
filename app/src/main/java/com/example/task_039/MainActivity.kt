package com.example.task_039

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.example.task_039.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var list = mutableListOf(
        GridViewModal(R.drawable.chat,"chat"),
        GridViewModal(R.drawable.home,"home"),
        GridViewModal(R.drawable.logout,"logout"),
        GridViewModal(R.drawable.profile,"profile"),
        GridViewModal(R.drawable.settings,"settings"),
        GridViewModal(R.drawable.widgets,"widgets"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = GridViewAdapter(list = list, this@MainActivity)
        binding.gridViewGV.adapter = adapter

        binding.gridViewGV.onItemClickListener = AdapterView.OnItemClickListener {_, _, position, _ ->
            Toast.makeText(
                applicationContext,
                " ${list[position].imageContent}",
                Toast.LENGTH_SHORT
            ).show()

            var intentOut: Intent? = null;
            when(position){
                0 -> {intentOut = Intent(this, ChatActivity::class.java) }
                1 -> {intentOut = Intent(this, HomeActivity::class.java) }
                2 -> {intentOut = Intent(this, LogoutActivity::class.java)}
                3 -> {intentOut = Intent(this, ProfileActivity::class.java)}
                4 -> {intentOut = Intent(this, SettingsActivity::class.java)}
                5 -> {intentOut = Intent(this, WidgetsActivity::class.java)}
            }
            startActivity(intentOut)
        }
    }
}