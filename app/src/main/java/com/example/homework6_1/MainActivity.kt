package com.example.homework6_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework6_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val text = arrayListOf("hello", "dude", "person")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()

    }

    private fun initListeners() {
        binding.addBtn.setOnClickListener {
            if (binding.editText.text.toString().isNotEmpty())
                text.add(binding.editText.text.toString())
            println(text)
        }
        binding.outputBtn.setOnClickListener {
            binding.TextTv.text = text.toString()
        }
    }
}