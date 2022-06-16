package com.example.tracingapp.menu

import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.Intent
import android.graphics.PorterDuff
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.example.tracingapp.MainActivity
import com.example.tracingapp.R
import com.example.tracingapp.WelcomeActivity
import com.example.tracingapp.history.HistoryActivity
import com.example.tracingapp.menu.faq.FaqActivity


class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val actionBar: ActionBar? = supportActionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.transparent)))
        actionBar?.setTitle(Html.fromHtml("<big><big>My Details</big></big>"))

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.details_nav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.nav_faq -> {
                val intent: Intent = Intent(this, FaqActivity::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_left, R.anim.fade_out)
                true
            }
            R.id.nav_history -> {
                val intent: Intent = Intent(this, HistoryActivity::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_left, R.anim.fade_out)
                true
            }
            R.id.nav_helpdesk -> {
                val uri: String = "https://mysejahtera.malaysia.gov.my/help_en/"

                val i: Intent = Intent(Intent.ACTION_VIEW)
                i.setData(Uri.parse(uri))
                startActivity(i)
                true
            }
            R.id.nav_logout -> {
                val intent: Intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun saveDetails(view: View) {
        val intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_right, R.anim.fade_out)
        Toast.makeText(this, "Your personal details has been successfully updated!", Toast.LENGTH_LONG).show()
    }

    fun closeActivity(view: View) {
        val intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_right, R.anim.fade_out)
    }
}