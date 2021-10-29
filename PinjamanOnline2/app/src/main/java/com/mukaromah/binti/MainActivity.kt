package com.mukaromah.binti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.mukaromah.binti.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHitung.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {

        val uang = binding.etInput.text.toString().trim()
        val tenor = binding.etTenor.text.toString().trim()

        var biayaLayanan = uang.toDouble() - (uang.toDouble() * 0.05)

        var bunga = 0.0375 * tenor.toDouble()
        var totalBayar = uang.toDouble() + (uang.toDouble() * bunga)

        binding.tvDanaCair.text = biayaLayanan.toString()
        binding.tvTotalBayar.text = totalBayar.toString()


    }
}