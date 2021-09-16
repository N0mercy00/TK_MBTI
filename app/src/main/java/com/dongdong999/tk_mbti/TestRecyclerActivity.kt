package com.dongdong999.tk_mbti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dongdong999.tk_mbti.databinding.ActivityTestBinding
import com.dongdong999.tk_mbti.databinding.ActivityTestRecyclerBinding
import com.dongdong999.tk_mbti.databinding.ItemRecyclerBinding

class TestRecyclerActivity : AppCompatActivity() {
    lateinit var binding : ActivityTestRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter =CustomAdapter()
        binding.rcTest.adapter=adapter

        adapter.additem(Question(getString(R.string.QuestionIE1)))
        adapter.additem(Question(getString(R.string.QuestionIE2)))
        adapter.additem(Question(getString(R.string.QuestionIE3)))
        adapter.additem(Question(getString(R.string.QuestionIE1)))

        adapter.notifyDataSetChanged()
    }


}