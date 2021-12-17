package com.lucascabral.mycameraxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lucascabral.mycameraxapp.databinding.ActivityResultTakePictureBinding

class ResultTakePictureActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultTakePictureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultTakePictureBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}