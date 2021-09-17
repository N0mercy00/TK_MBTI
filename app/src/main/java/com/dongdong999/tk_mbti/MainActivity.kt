package com.dongdong999.tk_mbti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dongdong999.tk_mbti.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMainStart.setOnClickListener {
           startActivity(Intent(this,TestActivity::class.java))
        }
        binding.btnMainGotoReview.setOnClickListener {
            Toast.makeText(this,"아직 구현되지 않은 기능입니다.",Toast.LENGTH_SHORT).show()
        }
    }
}