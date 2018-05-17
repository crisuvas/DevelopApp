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

        infographics.add(Infographic("¿Qué es?", "Este es un texto de prueba 1",R.drawable.bullying_description_image))
        infographics.add(Infographic("¿Qué es2?", "Este es un texto de prueba 12",R.drawable.bullying_description_image))
        infographics.add(Infographic("¿Qué es3?", "Este es un texto de prueba 13",R.drawable.bullying_description_image))

        val adapter = AdapterInfographic(infographics)

        reciclerView.adapter = adapter

    }
}
