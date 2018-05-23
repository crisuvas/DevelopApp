package com.ruiz.cris.bullyingapp20

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import kotlinx.android.synthetic.main.fragment_stories.*


class StoriesFragment : Fragment(), View.OnClickListener {

    private lateinit var imgWill: ImageView
    private lateinit var imgMarisela: ImageView
    private lateinit var imgCurtis: ImageView
    private lateinit var imgCeyanne: ImageView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_stories, container, false)

        imgWill = v.findViewById(R.id.iv_will)
        imgMarisela = v.findViewById(R.id.iv_marisela)
        imgCurtis = v.findViewById(R.id.iv_curtis)
        imgCeyanne = v.findViewById(R.id.iv_ceyanne)

        imgWill.setOnClickListener(this)
        imgMarisela.setOnClickListener(this)
        imgCurtis.setOnClickListener(this)
        imgCeyanne.setOnClickListener(this)


        return v
    }

    override fun onClick(v: View?) {
        val intent = Intent(context, ReaderActivity::class.java)
        when(v!!.id){
            R.id.iv_will ->
                    intent.putExtra("position", 1)
            R.id.iv_marisela ->
                    intent.putExtra("position",2)
            R.id.iv_curtis ->
                intent.putExtra("position", 3)
            R.id.iv_ceyanne ->
                intent.putExtra("position",4)
        }
        startActivity(intent)
    }
}