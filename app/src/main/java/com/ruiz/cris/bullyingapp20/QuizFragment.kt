package com.ruiz.cris.bullyingapp20

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class QuizFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val viewQuiz = inflater.inflate(R.layout.fragment_quiz, container, false)

        var buttonQuiz : Button = viewQuiz.findViewById(R.id.enter_btn)

        buttonQuiz.setOnClickListener({
            val intent = Intent(context, QuizActivity::class.java)
            startActivity(intent)
        })
        return viewQuiz
    }

}