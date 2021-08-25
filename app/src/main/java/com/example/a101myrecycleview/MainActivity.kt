package com.example.a101myrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.a101myrecycleview.data.Product
import com.example.a101myrecycleview.data.ProductAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = listOf<Product>(
            Product("Apple", 2.50, R.drawable.ic_baseline_architecture_24),
            Product("Durian", 12.50, R.drawable.ic_baseline_audiotrack_24),
            Product("Orange ", 1.30, R.drawable.ic_baseline_architecture_24),
            Product("Pen", 5.30, R.drawable.ic_baseline_audiotrack_24),
            Product("Apple", 2.50, R.drawable.ic_baseline_architecture_24),
            Product("Durian", 12.50, R.drawable.ic_baseline_architecture_24),
            Product("Orange ", 1.30, R.drawable.ic_baseline_audiotrack_24),
            Product("Pen", 5.30, R.drawable.ic_baseline_architecture_24),
            Product("Apple", 2.50, R.drawable.ic_baseline_audiotrack_24),
            Product("Durian", 12.50, R.drawable.ic_baseline_architecture_24),
            Product("Orange ", 1.30, R.drawable.ic_baseline_architecture_24),
            Product("Pen", 5.30, R.drawable.ic_baseline_audiotrack_24),
            )

        val myRecycleView : RecyclerView = findViewById(R.id.productRecycleView)
        myRecycleView.adapter = ProductAdapter(productList)
        myRecycleView.setHasFixedSize(true)

    }
}