package com.example.putatoewallet.presentation

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.putatoewallet.R
import com.example.putatoewallet.databinding.ActivityWalletBinding

class WalletActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWalletBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWalletBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //supportActionBar?.elevation = 0f
        //supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#419ea7")))
        window.statusBarColor = Color.parseColor("#757575")
        setSupportActionBar(binding.customToolbar.toolbar)
        binding.customToolbar.toolbar.setOnClickListener {
            Toast.makeText(this, "Back Press Clicked!", Toast.LENGTH_SHORT).show()
        }


    }
}