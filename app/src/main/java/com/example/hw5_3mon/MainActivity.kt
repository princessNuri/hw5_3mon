package com.example.hw5_3mon

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw5_3mon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var sum =0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.btn.setOnClickListener {
            if (sum == 10 || binding.btn.text.equals("-1")) {
                binding.btn.text = "-1"
                sum--
                binding.textview.text = sum.toString()
                if (sum == 0){
                    binding.btn.text = "+1"
                }
            }
            else{
                sum++
                binding.textview.text = sum.toString()
            }
        }
    }

    }




