package com.example.madlevel1task1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.madlevel1task1.databinding.ActivityHigherLowerBinding
import kotlinx.android.synthetic.main.activity_higher_lower.*

class HigherLowerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHigherLowerBinding
    private var currentThrow:Int = 1
    private var lastThrow:Int = 1
    private var score:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHigherLowerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews(){
        updateUI()

        btnLower.setOnClickListener {onLowerClick()}
        btnEqualTo.setOnClickListener {onEqualClick()}
        btnHigherThan.setOnClickListener {onHigherClick()}
    }

    private fun updateUI(){
        binding.tvLastThrow.text = getString(R.string.last_throw, lastThrow)
        //TODO FIX SCORE: Score is not being updated the first time a correct answer is guessed
        binding.tvScore.text = getString(R.string.score, score)

        when(currentThrow){
            1-> binding.ivDice.setImageResource(R.drawable.dice1)
            2-> binding.ivDice.setImageResource(R.drawable.dice2)
            3-> binding.ivDice.setImageResource(R.drawable.dice3)
            4-> binding.ivDice.setImageResource(R.drawable.dice4)
            5-> binding.ivDice.setImageResource(R.drawable.dice5)
            6-> binding.ivDice.setImageResource(R.drawable.dice6)

        }
    }

    private fun rollDice(){
        //TODO
        lastThrow = currentThrow
        currentThrow = (1..6).random()
        updateUI()
    }

    private fun onAnswerCorrect(){
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show()
    }

    private fun onAnswerIncorrect(){
        Toast.makeText(this, getString(R.string.inCorrect), Toast.LENGTH_SHORT).show()
    }

    private fun onLowerClick(){
        rollDice()
        if (currentThrow < lastThrow){
            onAnswerCorrect()
            score ++
        }else{
            onAnswerIncorrect()
        }
    }

    private fun onEqualClick(){
        rollDice()
        if (currentThrow == lastThrow){
            onAnswerCorrect()
            score ++
        }else{
            onAnswerIncorrect()
        }
    }

    private fun onHigherClick(){
        rollDice()
        if (currentThrow > lastThrow){
            onAnswerCorrect()
            score ++
        }else{
            onAnswerIncorrect()
        }
    }

}