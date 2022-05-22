package com.hoon.flower_lizard.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hoon.flower_lizard.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private var mBinding : ActivityLoginBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)

        mBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.userId.setHint("id")
        binding.userPw.setHint("password")
        val id = binding.userId.text
        binding.login.setOnClickListener {
            Toast.makeText(this, id, Toast.LENGTH_SHORT).show()
        }

    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}