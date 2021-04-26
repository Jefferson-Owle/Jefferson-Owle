package com.example.plusorminusone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


@Suppress("IfThenToSafeAccess", "VARIABLE_WITH_REDUNDANT_INITIALIZER")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create variables to add button functionality
        var plus = findViewById<Button>(R.id.increment)
        var minus = findViewById<Button>(R.id.decrement)
        var currentValue = findViewById<TextView>(R.id.textView)

        // Cast currentValue.text to a string so we can call String functions
        var valueString: String = currentValue.text as String
        // Cast that string to an integer so we can do the math operations
        var valueInt: Int = valueString.toInt()

        // Define what the plus button ("Up") should do
        plus.setOnClickListener{
            // Increment the value in integer form, then cast back as a string to change the displayed value.
            valueInt++
            currentValue.text = valueInt.toString()
        }

        // Define what the minus button ("Down") should do
        minus.setOnClickListener{
            // Decrement the value in integer form, then cast back as a string to change the displayed value.
            valueInt--
            currentValue.text = valueInt.toString()
        }

    }

}