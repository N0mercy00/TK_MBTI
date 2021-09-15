package com.dongdong999.tk_mbti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dongdong999.tk_mbti.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var tempPoint : Int =0;
        var IEpoint : Int =0;
        var SNpoint : Int =0;


        //답안 입력 테스트 완료 총점 입력도 완료
        binding.rgIE1.setOnCheckedChangeListener{group,id->
            IEpoint=tempPoint
            tempPoint=0
            when(id){
                R.id.rb_IE1NN->{
                    tempPoint=0
                    tempPoint-=2

                    Log.d("TAG","현재 IE 점수 : ${tempPoint},${IEpoint}")
                }
                R.id.rb_IE1N->{
                    tempPoint=0
                    tempPoint-=1
                    Log.d("TAG","현재 IE 점수 : ${tempPoint}")
                }
                R.id.rb_IE1M->{
                    tempPoint=0

                    Log.d("TAG","현재 IE 점수 : ${tempPoint}")
                }
                R.id.rb_IE1Y->{
                    tempPoint=0
                    tempPoint+=1
                    Log.d("TAG","현재 IE 점수 : ${tempPoint}")
                }
                R.id.rb_IE1YY->{
                    tempPoint=0
                    tempPoint+=2
                    Log.d("TAG","현재 IE 점수 : ${tempPoint}")
                }

            }
        }

        IEpoint=tempPoint
        Log.d("TAG","현재 IE 점수 : ${IEpoint}")

    }
}