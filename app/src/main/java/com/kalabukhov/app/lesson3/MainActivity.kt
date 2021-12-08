package com.kalabukhov.app.lesson3

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.kalabukhov.app.lesson3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        val toolbar = findViewById<Toolbar>(R.id.bottom_navigation_menu)
        setSupportActionBar(toolbar)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        return if (navigateFragment(id)) {
            true
        } else super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    private fun navigateFragment(id: Int): Boolean {
        when (id) {
            R.id.page_1 -> {
                binding.fragmentContainer.setBackgroundColor(Color.RED)
                return true
            }
            R.id.page_2 -> {
                binding.fragmentContainer.setBackgroundColor(Color.BLACK)
                return true
            }
        }
        return true
    }
}