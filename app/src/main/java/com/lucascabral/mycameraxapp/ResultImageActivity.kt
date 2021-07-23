package com.lucascabral.mycameraxapp

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.lucascabral.mycameraxapp.databinding.ActivityResultImageBinding

class ResultImageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startActivityForResult(
            Intent(MediaStore.ACTION_IMAGE_CAPTURE),
            REQUEST_IMAGE_CAPTURE
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE &&
            resultCode == RESULT_OK
        ) {
            (data?.extras?.get("data") as? Bitmap?)?.let { photo ->
                binding.resultImageView.setImageBitmap(photo)
            }
        }
    }

    companion object {
        const val REQUEST_IMAGE_CAPTURE = 2
    }
}