package com.geek.android4_2.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geek.android4_2.R
import com.geek.android4_2.databinding.ActivityMainBinding
import com.geek.android4_2.exten.loadImage
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var ui: ActivityMainBinding
    private var listOfUrl = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)

        setupList()
        setupListeners()
    }

    private fun setupList() {
        listOfUrl.addAll(resources.getStringArray(R.array.image_urls))
    }

    private fun setupListeners() {
        ui.btnSubmit.setOnClickListener {
            if (!ui.etUrlImage.text.isNullOrEmpty()) {
                listOfUrl.add(ui.etUrlImage.text.toString())
                ui.etUrlImage.setText("")
            }
        }
        ui.btnRandom.setOnClickListener {
            ui.ivImage.loadImage(listOfUrl[random()])
        }
    }

    private fun random(): Int {
        return Random().nextInt(listOfUrl.size)
    }
}