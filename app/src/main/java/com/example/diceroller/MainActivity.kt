package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton = findViewById<Button>(R.id.button)

        val diceImage = findViewById<ImageView>(R.id.imageViewDice)

        rollButton.setOnClickListener {
            /*val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
            toast.show()*/


            /*var txtView = findViewById<TextView>(R.id.textViewMessage)
            var valueOfView = if(txtView.text.toString() == "") 0 else txtView.text.toString().toInt()
            valueOfView++
            txtView.text = valueOfView.toString()*/

            rollDice(diceImage)
        }

        rollDice(diceImage)
    }

    /**
     * Will display the result of a diced roll and add to a text view
     */
    private fun rollDice(imageView: ImageView) {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        when(diceRoll){
            1 -> imageView.setImageResource(R.drawable.dice_1)
            2 -> imageView.setImageResource(R.drawable.dice_2)
            3 -> imageView.setImageResource(R.drawable.dice_3)
            4 -> imageView.setImageResource(R.drawable.dice_4)
            5 -> imageView.setImageResource(R.drawable.dice_5)
            6 -> imageView.setImageResource(R.drawable.dice_6)
        }

        imageView.contentDescription = diceRoll.toString()


    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}