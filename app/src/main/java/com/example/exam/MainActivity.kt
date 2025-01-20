package com.example.exam

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity:FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.bottom_nav)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.selectedItemId = R.id.bottom_nav_fragment1

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_nav_fragment1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, FragmentOne())
                        .commit()
                }

                R.id.bottom_nav_fragment2 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, FragmentTwo())
                        .commit()
                }
            }
            true
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer,FragmentOne())
            .commit()
    }
}