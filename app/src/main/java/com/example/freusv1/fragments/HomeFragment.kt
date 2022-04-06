package com.example.freusv1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.freusv1.R
import com.example.freusv1.databinding.FragmentHomeBinding
import kotlin.random.Random

class HomeFragment : Fragment() {
    private lateinit var _binding: FragmentHomeBinding
    private val listDado = arrayListOf( R.drawable.diceum,
        R.drawable.dicedois,
        R.drawable.dicetres,
        R.drawable.dicequatro,
        R.drawable.dicecinco,
        R.drawable.diceseis)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        _binding.apply {
            imageViewDado.setOnClickListener{
                Toast.makeText(context, "click", Toast.LENGTH_SHORT).show()
            }
        }

        return _binding.root
    }
}