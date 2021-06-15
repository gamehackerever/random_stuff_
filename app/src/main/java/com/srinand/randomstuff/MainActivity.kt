package com.srinand.randomstuff

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfStuff = arrayListOf("Study Physics", "Study Chemistry", "Sit Simply", "Just Die")
        finalButton.setOnClickListener {
            val randomNum = (0..listOfStuff.count() - 1).random()
            printHere.setText(listOfStuff[randomNum])
        }

        addButton.setOnClickListener {
            val addedOpt = addedOption.text.toString()
            listOfStuff.add(addedOpt)
            addedOption.text.clear()
            val Toast = Toast.makeText(this, "Option Added", Toast.LENGTH_LONG)
            Toast.show()
        }
    }
}


