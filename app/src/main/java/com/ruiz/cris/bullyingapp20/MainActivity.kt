package com.ruiz.cris.bullyingapp20

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val reciclerView : RecyclerView = findViewById(R.id.rv_main)
        reciclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val infographics = ArrayList<Infographic>()

        infographics.add(Infographic(R.string.titleMainOne, R.string.textMainOne,R.drawable.bullying_main_one))
        infographics.add(Infographic(R.string.titleMainTwo, R.string.textMainTwo,R.drawable.bullying_main_two))
        infographics.add(Infographic(R.string.titleMainThree, R.string.textMainThree,R.drawable.bullying_main_three))
        infographics.add(Infographic(R.string.titleMainFour, R.string.textMainFour,R.drawable.bullying_main_four))

        val adapter = AdapterInfographic(infographics)

        reciclerView.adapter = adapter

    }
}
