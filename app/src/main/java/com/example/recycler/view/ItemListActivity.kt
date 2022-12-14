package com.example.recycler.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.data.Product
import com.example.recycler.handlers.ProductClickListener
import com.example.tablayout.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type


class ItemListActivity : AppCompatActivity(), ProductClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_list)

        val type: Type = object : TypeToken<List<Product?>?>() {}.type

        val productList: ArrayList<Product> = Gson().fromJson(
            intent.getStringExtra("productList"),
            type)

        val recyclerProductItem : RecyclerView = findViewById(R.id.recyclerCategoryItem)

        val adapter = ProductAdapter(productList, this)
        recyclerProductItem.adapter = adapter

    }

    override fun onProductItemClicked(product: Product) {
        val intent = Intent(this, ProductDetailActivity::class.java)
        intent.putExtra("product", Gson().toJson(product))
        startActivity(intent)
    }

}