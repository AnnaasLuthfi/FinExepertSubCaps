package com.myapps.expert1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.myapps.expert1.databinding.ActivityMainBinding
import com.myapps.expert1.ui.home.HomeFragment


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        supportFragmentManager.beginTransaction().replace(R.id.container, HomeFragment()).commit()
        binding.bottomNavigation.selectedItemId = R.id.nav_home;

        binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.nav_home -> fragment = HomeFragment()
                R.id.nav_favorite -> {
                    val uri = Uri.parse("sport://favorite")
                    startActivity(Intent(Intent.ACTION_VIEW, uri))
                }
            }
            if (fragment != null) {
                supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
            }
            true
        }

    }

}