package com.ruiz.cris.bullyingapp20

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout


class HomeFragment : Fragment(){

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view : View = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.findViewById(R.id.rv_main)
        val infographics = ArrayList<Infographic>()
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)

        infographics.add(Infographic(R.string.titleMainOne, R.string.textMainOne, R.drawable.bullying_main_one))
        infographics.add(Infographic(R.string.titleMainTwo, R.string.textMainTwo, R.drawable.bullying_main_two))
        infographics.add(Infographic(R.string.titleMainThree, R.string.textMainThree, R.drawable.bullying_main_three))
        infographics.add(Infographic(R.string.titleMainFour, R.string.textMainFour, R.drawable.bullying_main_four))

        val adapter = AdapterInfographic(infographics)
        recyclerView.adapter = adapter

        return view
    }

}