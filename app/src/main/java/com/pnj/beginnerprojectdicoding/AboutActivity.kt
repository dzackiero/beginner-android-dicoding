package com.pnj.beginnerprojectdicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pnj.beginnerprojectdicoding.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "About Page"
    }
}