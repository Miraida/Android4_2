package com.geek.android4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geek.android4_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var ui : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)
    }

}