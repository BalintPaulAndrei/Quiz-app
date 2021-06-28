package com.example.quizzappv20

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar!!.hide()
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

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