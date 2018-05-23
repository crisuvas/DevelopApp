package com.ruiz.cris.bullyingapp20

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ReaderActivity : AppCompatActivity() {

    private lateinit var img : ImageView
    private lateinit var title: TextView
    private lateinit var text: TextView
    private var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reader)

        img = findViewById(R.id.iv_Image)
        title = findViewById(R.id.tv_titleHistory)
        text = findViewById(R.id.tv_textHistory)

        getNum()
        setContent()
    }

    private fun getNum(){
        num = intent.getIntExtra("position", 0)
    }
    private fun setContent(){
        when(num){
            0,1 -> {
                img.resources.getDrawable(R.drawable.will)
                title.setText(R.string.will)
                text.setText(R.string.willStory)
            }
            2->{
                img.resources.getDrawable(R.drawable.marisela)
                title.setText(R.string.marisela)
                text.setText(R.string.mariselaHistory)
            }
            3 ->{
                img.resources.getDrawable(R.drawable.curtis)
                title.setText(R.string.curtis)
                text.setText(R.string.curtisHistory)
            }
            4->{
                img.resources.getDrawable(R.drawable.ceyanne)
                title.setText(R.string.ceyanne)
                text.setText(R.string.ceyanneHistory)
            }
        }
    }
}
