package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }


    private fun initViews(){

        binding.btnSubmit.setOnClickListener {
            checkAnswer()
        }
    }

    private fun checkAnswer(){
        if ((et31.text.toString() == "T" || et31.text.toString() == "t") &&
            (et32.text.toString() == "F" || et32.text.toString() == "f") &&
            (et33.text.toString() == "F" || et33.text.toString() == "f") &&
            (et34.text.toString() == "F" || et34.text.toString() == "f")){

            Toast.makeText(this, getString(R.string.txtCorrect), Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, getString(R.string.txtIncorrect), Toast.LENGTH_SHORT).show()
        }

    }
}