package com.ruiz.cris.bullyingapp20

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tvPercentage: TextView
    private lateinit var tvRecommendation: TextView
    private lateinit var btnFinish: Button
    private var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tvPercentage = findViewById(R.id.tv_percentage)
        tvRecommendation = findViewById(R.id.tv_recommendation)
        btnFinish = findViewById(R.id.btn_finish)
        setText()
        btnFinish.setOnClickListener(this)
    }

    private fun setText(){
        points = intent.getIntExtra("totalPoint", 0)
        points *= 5
        tvPercentage.text = "${points} %"
        when(points){
            in 0..4->
                tvRecommendation.setText(R.string.recommendation1)
            in 5..9->
                tvRecommendation.setText(R.string.recommendation2)
            in 10..14->
                tvRecommendation.setText(R.string.recommendation3)
            in 15..20->
                tvRecommendation.setText(R.string.recommendation4)
        }
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
