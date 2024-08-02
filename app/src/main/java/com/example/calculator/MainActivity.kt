package com.example.calculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener{
            val input1 = binding.inpt1.text.toString().toInt()
            val input2 = binding.inpt2.text.toString().toInt()

            val result = input1 + input2
            binding.res.text = result.toString() // Display the result as text

        }

        binding.btnMinus.setOnClickListener{
            val input1 = binding.inpt1.text.toString().toInt()
            val input2 = binding.inpt2.text.toString().toInt()

            val result = input1 - input2
            binding.res.text = result.toString() // Display the result as text

        }

        binding.btnDivide.setOnClickListener{
            val input1 = binding.inpt1.text.toString().toInt()
            val input2 = binding.inpt2.text.toString().toInt()

            val result = input1 / input2
            binding.res.text = result.toString() // Display the result as text

        }

        binding.btnMultiply.setOnClickListener{
            val input1 = binding.inpt1.text.toString().toInt()
            val input2 = binding.inpt2.text.toString().toInt()

            val result = input1 * input2
            binding.res.text = result.toString() // Display the result as text

        }
    }
}