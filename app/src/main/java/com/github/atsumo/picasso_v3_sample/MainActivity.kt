package com.github.atsumo.picasso_v3_sample

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.atsumo.picasso_v3_sample.databinding.ActivityMainBinding
import com.squareup.picasso3.provider.PicassoProvider

class MainActivity : AppCompatActivity() {

  companion object {
    private const val RAMDOM_IMAGE_URL = "https://source.unslash.com/random"
  }

  private val binding: ActivityMainBinding by lazy {
    DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    binding.button.setOnClickListener {
      loadImage()
    }
  }

  private fun loadImage() {
//    PicassoPro
    PicassoProvider.get()
        .load(RAMDOM_IMAGE_URL)
        .into(binding.imageContainer)
  }
}
