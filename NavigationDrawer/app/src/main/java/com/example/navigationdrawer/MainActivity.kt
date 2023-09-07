package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.navigationdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        NavigationUI.setupWithNavController(main.navigationView, navHostFragment.navController)

        main.toolbar.title = "Title"

        val toggle = ActionBarDrawerToggle(this, main.drawer,
            main.toolbar, 0,0)
        main.drawer.addDrawerListener(toggle)
        toggle.syncState()

        val title = main.navigationView.inflateHeaderView(R.layout.navigation_drawer_title)
        title.findViewById<TextView>(R.id.textViewTitle).text = "Hello"

    }

    override fun onBackPressed() {
        if(main.drawer.isDrawerOpen(GravityCompat.START)){
            main.drawer.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }
}