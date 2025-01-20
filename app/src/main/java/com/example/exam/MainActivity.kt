package com.example.exam

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity:FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.bottom_nav)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.selectedItemId = R.id.item1

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, RecyclerViewMain())
                        .commit()
                }

                R.id.item2 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, ViewPagerMain())
                        .commit()
                }
            }
            true
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer,RecyclerViewMain())
            .commit()
    }
}