package com.example.quizzappv20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar!!.hide()
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_main)
    }

    fun logout(view: View) {
        FirebaseAuth.getInstance().signOut();
        startActivity(Intent(this, LoginActivity::class.java))
        finish();
    }

    fun startQuizz(view: View) {
        startActivity(Intent(this, QuestionsActivity::class.java))
        finish();
    }
}