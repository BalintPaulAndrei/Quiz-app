package com.example.quizzappv20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val correctAnswers = intent.getStringExtra(Constants.CORRECT_ANSWERS)
        tv_your_score.text = "Your score is:  $correctAnswers/20"
    }

    fun startQuizz(view: View) {
        startActivity(Intent(this, QuestionsActivity::class.java))
        finish();
    }

    fun logout(view: View) {
        FirebaseAuth.getInstance().signOut();
        startActivity(Intent(this, LoginActivity::class.java))
        finish();
    }
}