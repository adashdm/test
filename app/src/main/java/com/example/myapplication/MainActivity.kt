package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainlayout)
        var count = 1
        val myButton:Button = findViewById(R.id.button)
        val myButton2:Button = findViewById(R.id.button2)
        myButton.setOnClickListener {
                count = count + 1
                Toast.makeText(this, "Змінна: ${count}", Toast.LENGTH_SHORT).show()
        }
        myButton2.setOnClickListener {
            if(count > 1) {
                count = count - 1
                Toast.makeText(this, "Змінна: ${count}", Toast.LENGTH_SHORT).show()
            }
            else Toast.makeText(this, "Значення меньше за 1", Toast.LENGTH_SHORT).show()
        }
    }


}