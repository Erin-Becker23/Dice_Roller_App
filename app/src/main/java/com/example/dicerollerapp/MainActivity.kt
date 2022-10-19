package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button) //tying a variable to the button id we created
        rollButton.text = "Push me"

        rollButton.setOnClickListener{
            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()
            //sets it so that there's a short notification when the button gets clicked
            rollDice()
        }
    }

    private fun rollDice() {
        val randNum = Random.nextInt(6)+1
//        val dice_roll: TextView = findViewById(R.id.roll_number)
        val diceImage: ImageView = findViewById(R.id.dice_image)
//        dice_roll.text = randNum.toString()
        val drawableResource = when (randNum){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource((drawableResource))

    }

}