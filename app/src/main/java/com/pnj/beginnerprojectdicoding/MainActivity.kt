package com.pnj.beginnerprojectdicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.pnj.beginnerprojectdicoding.adapter.ItemCardAdapter
import com.pnj.beginnerprojectdicoding.data.Datasource
import com.pnj.beginnerprojectdicoding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recyclerMain
        recyclerView.adapter = ItemCardAdapter(Datasource().getContents()){
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(DetailActivity.CONTENT, it)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.goto_about, menu)
        val menuItem = menu?.findItem(R.id.about_page)
        menuItem?.icon = ContextCompat.getDrawable(this, R.drawable.ic_profile)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about_page -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)

                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}