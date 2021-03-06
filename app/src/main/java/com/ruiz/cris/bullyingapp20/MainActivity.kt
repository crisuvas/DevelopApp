package com.ruiz.cris.bullyingapp20

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private lateinit var bottonNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottonNav = findViewById(R.id.bottom_navigation)
        bottonNav.setOnNavigationItemSelectedListener(this)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, HomeFragment()).commit()

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var selectedFragment : Fragment? = null

        when(item.itemId){
            R.id.home_btn ->
                    selectedFragment = HomeFragment()
            R.id.quiz_btn ->
                    selectedFragment = QuizFragment()
            R.id.stories_btn ->
                    selectedFragment = StoriesFragment()
        }

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, selectedFragment).commit()

        return true
    }

}
