package com.pnj.beginnerprojectdicoding

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.pnj.beginnerprojectdicoding.databinding.ActivityDetailBinding
import com.pnj.beginnerprojectdicoding.model.Content

class DetailActivity : AppCompatActivity() {
    companion object {
        const val CONTENT = "content"
    }

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val content = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra(CONTENT, Content::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(CONTENT)
        }


        if(content != null){
            val contentTitle = "${content.title} (${content.year})"
            title = contentTitle
            binding.posterBackground.setImageResource(content.imageResourceId)
            binding.posterImage.setImageResource(content.imageResourceId)
            binding.detailTitle.text = contentTitle
            binding.overviewContent.text = content.overview
            binding.genreContent.text = content.genre.joinToString(", ")

            binding.actionWatchTrailer.setOnClickListener {
                val web = Intent(Intent.ACTION_VIEW, Uri.parse(content.trailer))
                startActivity(web)
            }

            binding.actionShare.setOnClickListener {
                val share = Intent(Intent.ACTION_SEND)
                share.type = "text/plain"
                share.putExtra(Intent.EXTRA_TEXT, content.link)
                startActivity(Intent.createChooser(share, "Share"))
            }

            val rating = "${content.rating}/10"
            binding.ratingContent.text = rating
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home -> {
                finish()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}