package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton = findViewById<Button>(R.id.button)

        rollButton.setOnClickListener {
            /*val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
            toast.show()*/


            /*var txtView = findViewById<TextView>(R.id.textViewMessage)
            var valueOfView = if(txtView.text.toString() == "") 0 else txtView.text.toString().toInt()
            valueOfView++
            txtView.text = valueOfView.toString()*/

            rollDice(findViewById<TextView>(R.id.textViewMessage))
        }
    }

    /**
     * Will display the result of a diced roll and add to a text view
     */
    private fun rollDice(txtView: TextView) {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        txtView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}