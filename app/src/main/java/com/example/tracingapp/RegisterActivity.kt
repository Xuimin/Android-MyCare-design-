package com.example.tracingapp

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import androidx.appcompat.app.ActionBar

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val actionBar: ActionBar? = supportActionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.on_primary_dark)))
        actionBar?.setTitle(Html.fromHtml("<big><big>Register</big></big>"))
    }

    fun Login(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_left, R.anim.fade_out)
    }

    fun Main(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_left, R.anim.fade_out)
    }
}