package com.example.a7minutesworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Choreographer
import android.widget.FrameLayout
import android.widget.Toast
import com.example.a7minutesworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

       // val flStartButton : FrameLayout = findViewById(R.id.flStart)
        binding?.flStart?.setOnClickListener{
           val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)  //intent = aim , so start aim towards exercise page
        }

        binding?.flBMI?.setOnClickListener{
            val intent = Intent(this, BMIActivity::class.java)
            startActivity(intent)  //intent = aim , so start aim towards exercise page
        }

        binding?.flHistory?.setOnClickListener{
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)  //intent = aim , so start aim towards exercise page
        }

    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null  //to avoid memory leak
    }
}