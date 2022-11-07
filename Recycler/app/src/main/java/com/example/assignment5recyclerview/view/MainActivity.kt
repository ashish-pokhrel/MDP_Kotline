package com.example.assignment5recyclerview.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.assignment5recyclerview.R
import com.example.assignment5recyclerview.data.Product
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun goToProductListActivity(productList: ArrayList<Product>) {
        val intent = Intent(this, ItemListActivity::class.java)
        intent.putExtra("productList", Gson().toJson(productList))
        startActivity(intent)
    }

    fun onElectronicClicked(view: View) {
        val electronicItemList = ArrayList<Product>()
        val product1 = Product(
            "HP printer",
            250.00,
            "Black",
            "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/paro-taktshang-monastery-royalty-free-image-1602870288.jpg?crop=0.669xw:1.00xh;0.136xw,0&resize=640:*",
            "PRT1",
            "4 in one printer with A1 size print"
        )

        val product2 = Product(
            "Sony Gramphone",
            128.25,
            "White",
            "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/paro-taktshang-monastery-royalty-free-image-1602870288.jpg?crop=0.669xw:1.00xh;0.136xw,0&resize=640:*",
            "Audio15",
            "Treditional style Gramophone."
        )

        val product3 = Product(
            "Lenovo Laptop",
            950.00,
            "Grey",
            "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/marble-elephant-in-fully-carved-famous-sandstone-royalty-free-image-1602776763.jpg?crop=1xw:1xh;center,top&resize=480:*",
            "COM25",
            "Very thin laptop. Suitable for travellers."
        )
        val product4 = Product(
            "HP Zbook",
            2800.00,
            "Grey",
            "https://digitalprofileimage.pas.com.np/Province//Province_Two.jpg",
            "COM01",
            "Very Strong Mobile Workstation"
        )

        val product5 = Product(
            "SIM7000 module",
            128.25,
            "blue",
            "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/marble-elephant-in-fully-carved-famous-sandstone-royalty-free-image-1602776763.jpg?crop=1xw:1xh;center,top&resize=480:*",
            "COM35",
            "IoT Cellular + GPS + Antenna Shield module"
        )

        electronicItemList.add(product1)
        electronicItemList.add(product2)
        electronicItemList.add(product3)
        electronicItemList.add(product4)
        electronicItemList.add(product5)

        goToProductListActivity(electronicItemList)

    }

    fun onClothingClicked(view: View) {
        val clothingItemList = ArrayList<Product>()
    }

    fun onBeautyClicked(view: View) {
        val beautyItemList = ArrayList<Product>()
    }

    fun onFoodClicked(view: View) {
        val foodItemList = ArrayList<Product>()
    }


}