package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton:Button = findViewById(R.id.buRoll)
        myButton.setOnClickListener() {
            rollDice();
            rollDice2();
        }
    }
    private fun rollDice() {
        val myDice1=Dice(6)
        val number = myDice1.roll()
        val imageResource = when (number) {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        val diceIv:ImageView= findViewById(R.id.ivDice)
        diceIv.setImageResource(imageResource)
    }
    private fun rollDice2() {
        val myDice1=Dice(6)
        val number2 = myDice1.roll()
        val imageResource = when (number2) {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        val diceIv:ImageView= findViewById(R.id.ivDice2)
        diceIv.setImageResource(imageResource)
    }

}
class  Dice (val numSides1: Int) {
    fun roll(): Int {
        return(1..numSides1).random()

    }

}
