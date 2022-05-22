package com.hoon.flower_lizard.screen

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.hoon.flower_lizard.R
import com.hoon.flower_lizard.databinding.ActivityFeedBinding

class FeedActivity : AppCompatActivity() {
    private var mBinding : ActivityFeedBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_feed)

        mBinding = ActivityFeedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.feedImage.setImageResource(R.drawable.cat)
        binding.feedContent.setText("this feed content")
        binding.feedButton.setOnClickListener {
            Toast.makeText(this, "button1", Toast.LENGTH_LONG).show()
        }

        binding.feedButton2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("title")
            builder.setMessage("button2")
            builder.setPositiveButton("ok",
                DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "button1", Toast.LENGTH_LONG).show()
            })
            builder.setNegativeButton("cancel",
                DialogInterface.OnClickListener { dialog, which ->
                    builder.setCancelable(true)
                })
            builder.show()
        }

    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}