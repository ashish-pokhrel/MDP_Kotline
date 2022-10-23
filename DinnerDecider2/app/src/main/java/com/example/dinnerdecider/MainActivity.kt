package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var foodNameTxt: TextView
    private lateinit var newFoodName: EditText
    private lateinit var addFoodBtn: Button
    private lateinit var decideBtn: Button


    private val foodArrayList = arrayOf( "Hamburger", "Pizza",
        "Mexican", "American", "Chinese")

    private val foods= ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foodNameTxt = findViewById(R.id.foodNameTxt)
        newFoodName = findViewById(R.id.newFoodTxt)
        addFoodBtn = findViewById(R.id.addFoodBtn)
        decideBtn = findViewById(R.id.decideBtn)

        foods.addAll(foodArrayList)

        addFoodBtn.setOnClickListener{
            val newFoodNameValue = newFoodName.text.toString()
            foods.add(newFoodNameValue)
            newFoodName.text.clear()

        }

        decideBtn.setOnClickListener{
            val randomIndex = Random.nextInt(0, foods.size)
            foodNameTxt.text = foods[randomIndex]
        }

    }
}