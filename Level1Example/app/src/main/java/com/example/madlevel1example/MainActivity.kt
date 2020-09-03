package com.example.madlevel1example

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.madlevel1example.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConfirm.setOnClickListener {
            checkAnswer()
        }
    }




    fun checkAnswer(){
        val answer = binding.etAnswer.text.toString()
        if (answer == getString(R.string.giraf)){
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this, getString(R.string.inCorrect), Toast.LENGTH_LONG).show()
        }
    }
}