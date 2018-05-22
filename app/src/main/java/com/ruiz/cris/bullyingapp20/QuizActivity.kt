package com.ruiz.cris.bullyingapp20

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class QuizActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tvTitleQuestion: TextView
    private lateinit var tvTextQuestion: TextView
    private lateinit var btnNext: Button
    private lateinit var rgOptions: RadioGroup
    private lateinit var rbAlways: RadioButton
    private lateinit var rbSometimes: RadioButton
    private lateinit var rbNever: RadioButton
    private var numberQuestion = 1
    private var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        tvTitleQuestion = findViewById(R.id.tv_titleQuestion)
        tvTextQuestion = findViewById(R.id.tv_textQuestion)
        rgOptions = findViewById(R.id.rg_options)
        rbAlways = findViewById(R.id.rb_always)
        rbSometimes = findViewById(R.id.rb_sometimes)
        rbNever = findViewById(R.id.rb_never)
        btnNext = findViewById(R.id.button_next)

        readQuestion()
        btnNext.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (rgOptions.checkedRadioButtonId != -1) {
            for (n in numberQuestion..20) {

                if(rbAlways.isChecked){
                    points += 2
                    numberQuestion++
                }else if (rbSometimes.isChecked){
                    points += 1
                    numberQuestion++
                }else if(rbNever.isChecked){
                    numberQuestion++
                }
                if (numberQuestion != 21) {
                    readQuestion()
                } else {
                    val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra("totalPoint", points)
                    startActivity(intent)
                }
                break
            }
        }
    }
    private fun readQuestion(){
        when(numberQuestion){
            1 ->{
                tvTitleQuestion.setText(R.string.titleQuestion1)
                tvTextQuestion.setText(R.string.textQuestion1)
            }
            2 ->{
                tvTitleQuestion.setText(R.string.titleQuestion2)
                tvTextQuestion.setText(R.string.textQuestion2)
            }
            3 ->{
                tvTitleQuestion.setText(R.string.titleQuestion3)
                tvTextQuestion.setText(R.string.textQuestion3)
            }
            4 ->{
                tvTitleQuestion.setText(R.string.titleQuestion4)
                tvTextQuestion.setText(R.string.textQuestion4)
            }
            5 ->{
                tvTitleQuestion.setText(R.string.titleQuestion5)
                tvTextQuestion.setText(R.string.textQuestion5)
            }
            6 ->{
                tvTitleQuestion.setText(R.string.titleQuestion6)
                tvTextQuestion.setText(R.string.textQuestion6)
            }
            7 -> {
                tvTitleQuestion.setText(R.string.titleQuestion7)
                tvTextQuestion.setText(R.string.textQuestion7)
            }
            8 ->{
                tvTitleQuestion.setText(R.string.titleQuestion8)
                tvTextQuestion.setText(R.string.textQuestion8)
            }
            9 ->{
                tvTitleQuestion.setText(R.string.titleQuestion9)
                tvTextQuestion.setText(R.string.textQuestion9)
            }
            10 ->{
                tvTitleQuestion.setText(R.string.titleQuestion10)
                tvTextQuestion.setText(R.string.textQuestion10)
            }
            11 ->{
                tvTitleQuestion.setText(R.string.titleQuestion11)
                tvTextQuestion.setText(R.string.textQuestion11)
            }
            12 ->{
                tvTitleQuestion.setText(R.string.titleQuestion12)
                tvTextQuestion.setText(R.string.textQuestion12)
            }
            13 ->{
                tvTitleQuestion.setText(R.string.titleQuestion13)
                tvTextQuestion.setText(R.string.textQuestion13)
            }
            14 ->{
                tvTitleQuestion.setText(R.string.titleQuestion14)
                tvTextQuestion.setText(R.string.textQuestion14)
            }
            15 ->{
                tvTitleQuestion.setText(R.string.titleQuestion15)
                tvTextQuestion.setText(R.string.textQuestion15)
            }
            16 ->{
                tvTitleQuestion.setText(R.string.titleQuestion16)
                tvTextQuestion.setText(R.string.textQuestion16)
            }
            17 ->{
                tvTitleQuestion.setText(R.string.titleQuestion17)
                tvTextQuestion.setText(R.string.textQuestion17)
            }
            18 ->{
                tvTitleQuestion.setText(R.string.titleQuestion18)
                tvTextQuestion.setText(R.string.textQuestion18)
            }
            19 ->{
                tvTitleQuestion.setText(R.string.titleQuestion19)
                tvTextQuestion.setText(R.string.textQuestion19)
            }
            20 ->{
                tvTitleQuestion.setText(R.string.titleQuestion20)
                tvTextQuestion.setText(R.string.textQuestion20)
            }
        }
    }

}
