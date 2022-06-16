package com.example.tracingapp.history

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.RecyclerView
import com.example.tracingapp.menu.DetailsActivity
import com.example.tracingapp.menu.faq.FaqActivity
import com.example.tracingapp.R
import com.example.tracingapp.WelcomeActivity

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val actionBar: ActionBar? = supportActionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.transparent)))
        actionBar?.setTitle(Html.fromHtml("<big><big>History</big></big>"))

        val history: Array<History> =
            arrayOf(
                History(
                    id = 1,
                    icon = R.drawable.img_location,
                    name = "Forward School",
                    location = "2, Lebuh Acheh 10300 George Town, Penang, Malaysia",
                    date = "1 April 2022",
                    time = "09.00AM"
                ),
                History(
                    id = 2,
                    icon = R.drawable.img_location,
                    name = "Forward School",
                    location = "2, Lebuh Acheh 10300 George Town, Penang, Malaysia",
                    date = "2 April 2022",
                    time = "09.00AM"
                ),
                History(
                    id = 3,
                    icon = R.drawable.img_location,
                    name = "Forward School",
                    location = "2, Lebuh Acheh 10300 George Town, Penang, Malaysia",
                    date = "3 April 2022",
                    time = "09.00AM"
                ),
                History(
                    id = 4,
                    icon = R.drawable.img_location,
                    name = "Forward School",
                    location = "2, Lebuh Acheh 10300 George Town, Penang, Malaysia",
                    date = "4 April 2022",
                    time = "09.00AM"
                ),
                History(
                    id = 5,
                    icon = R.drawable.img_location,
                    name = "Forward School",
                    location = "2, Lebuh Acheh 10300 George Town, Penang, Malaysia",
                    date = "5 April 2022",
                    time = "09.00AM"
                ),
                History(
                    id = 6,
                    icon = R.drawable.img_location,
                    name = "Forward School",
                    location = "2, Lebuh Acheh 10300 George Town, Penang, Malaysia",
                    date = "6 April 2022",
                    time = "09.00AM"
                ),
                History(
                    id = 7,
                    icon = R.drawable.img_location,
                    name = "Forward School",
                    location = "2, Lebuh Acheh 10300 George Town, Penang, Malaysia",
                    date = "7 April 2022",
                    time = "09.00AM"
                ),
                History(
                    id = 8,
                    icon = R.drawable.img_location,
                    name = "Forward School",
                    location = "2, Lebuh Acheh 10300 George Town, Penang, Malaysia",
                    date = "8 April 2022",
                    time = "09.00AM"
                ),
                History(
                    id = 9,
                    icon = R.drawable.img_location,
                    name = "Forward School",
                    location = "2, Lebuh Acheh 10300 George Town, Penang, Malaysia",
                    date = "9 April 2022",
                    time = "09.00AM"
                ),
                History(
                    id = 10,
                    icon = R.drawable.img_location,
                    name = "Forward School",
                    location = "2, Lebuh Acheh 10300 George Town, Penang, Malaysia",
                    date = "10 April 2022",
                    time = "09.00AM"
                ),
                History(
                    id = 11,
                    icon = R.drawable.img_location,
                    name = "Forward School",
                    location = "2, Lebuh Acheh 10300 George Town, Penang, Malaysia",
                    date = "11 April 2022",
                    time = "09.00AM"
                ),
                History(
                    id = 12,
                    icon = R.drawable.img_location,
                    name = "Forward School",
                    location = "2, Lebuh Acheh 10300 George Town, Penang, Malaysia",
                    date = "12 April 2022",
                    time = "09.00AM"
                )
            )

        val recyclerView:RecyclerView = findViewById(R.id.rv_history)
        recyclerView.adapter = HistoryAdapter(history)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.history_nav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId) {
            R.id.nav_details -> {
                val intent: Intent = Intent(this, DetailsActivity::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_left, R.anim.fade_out)
                true
            }
            R.id.nav_faq -> {
                val intent: Intent = Intent(this@HistoryActivity, FaqActivity::class.java)
                startActivity(intent)
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
                val intent: Intent = Intent(this@HistoryActivity, WelcomeActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}