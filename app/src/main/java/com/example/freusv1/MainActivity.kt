package com.example.freusv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freusv1.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityMainBinding
    private val listDado = arrayListOf( R.drawable.diceum,
            R.drawable.dicedois,
            R.drawable.dicetres,
            R.drawable.dicequatro,
            R.drawable.dicecinco,
            R.drawable.diceseis)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)

            _binding.apply {
                imageViewDado.setOnClickListener{
                    val numRandom: Int = Random.nextInt(listDado.size)
                    imageViewDado.setImageResource(listDado[numRandom])

                }
            }
        val view = _binding.root
        setContentView(view)
    }
}