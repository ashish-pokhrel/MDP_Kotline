package com.example.recycler.handlers

import com.example.recycler.data.Product

interface ProductClickListener {
    fun onProductItemClicked(product: Product)
}