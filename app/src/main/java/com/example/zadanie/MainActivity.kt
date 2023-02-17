package com.example.zadanie

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rbtn = findViewById<Button>(R.id.clear)

        val szer = findViewById<ProgressBar>(R.id.progressBar)
        val wys = findViewById<ProgressBar>(R.id.progressBar2)

        val zdj = findViewById<ImageView>(R.id.imageView)
        val wysb1 = findViewById<SeekBar>(R.id.seekBar)
        val szerb1 = findViewById<SeekBar>(R.id.seekBar4)

        val zdj2 = findViewById<ImageView>(R.id.imageView2)
        val wysb2 = findViewById<SeekBar>(R.id.seekBar2)
        val szerb2 = findViewById<SeekBar>(R.id.seekBar5)

        val zdj3 = findViewById<ImageView>(R.id.imageView3)
        val wysb3 = findViewById<SeekBar>(R.id.seekBar3)
        val szerb3 = findViewById<SeekBar>(R.id.seekBar6)

        rbtn.setOnClickListener {
            szerb1.progress = 100
            szerb2.progress = 100
            szerb3.progress = 100
            szer.progress = 100

            wysb1.progress = 100
            wysb2.progress = 100
            wysb3.progress = 100
            wys.progress = 100
        }

        fun wysokosci() {
            wys.progress = (wysb1.progress + wysb2.progress + wysb3.progress ) / 3
        }
        fun szerokosci() {
            szer.progress = (szerb1.progress + szerb2.progress + szerb3.progress ) / 3
        }

        szerb1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                zdj.scaleX = progress.toFloat() / 100f
                szerokosci()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        wysb1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                zdj.scaleY = progress.toFloat() / 100f
                wysokosci()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        szerb2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                zdj2.scaleX = progress.toFloat() / 100f
                szerokosci()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        wysb2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                zdj2.scaleY = progress.toFloat() / 100f
                wysokosci()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        szerb3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                zdj3.scaleX = progress.toFloat() / 100f
                szerokosci()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        wysb3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                zdj3.scaleY = progress.toFloat() / 100f
                wysokosci()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })



    }
}