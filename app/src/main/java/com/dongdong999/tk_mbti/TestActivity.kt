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
        var IEPoint : Int =0;
        var IECalPoint : Double=0.0
        var IE1 : Int =0;
        var IE2 : Int =0;
        var IE3 : Int =0;
        var SNpoint : Int =0;


        //답안 입력 테스트 완료 총점 입력도 완료
        binding.rgIE1.setOnCheckedChangeListener{group,id->
            IE1=tempPoint
            tempPoint=0
            when(id){
                R.id.rb_IE1NN->{
                    tempPoint=0
                    tempPoint-=2
                }
                R.id.rb_IE1N->{
                    tempPoint=0
                    tempPoint-=1
                }
                R.id.rb_IE1M->{
                    tempPoint=0
                }
                R.id.rb_IE1Y->{
                    tempPoint=0
                    tempPoint+=1
                }
                R.id.rb_IE1YY->{
                    tempPoint=0
                    tempPoint+=2
                }

            }
            IE1=tempPoint
        }

        binding.rgIE2.setOnCheckedChangeListener { group,id->
            IE2=tempPoint
            tempPoint=0
            when(id){
                R.id.rb_IE2NN->{
                    tempPoint=0
                    tempPoint-=2

                }
                R.id.rb_IE2N->{
                    tempPoint=0
                    tempPoint-=1
                }
                R.id.rb_IE2M->{
                    tempPoint=0
                }
                R.id.rb_IE2Y->{
                    tempPoint=0
                    tempPoint+=1
                }
                R.id.rb_IE2YY->{
                    tempPoint=0
                    tempPoint+=2
                }
            }
            IE2=tempPoint
        }

        binding.rgIE3.setOnCheckedChangeListener { group,id->
            IE3=tempPoint
            tempPoint=0
            when(id){
                R.id.rb_IE3NN->{
                    tempPoint=0
                    tempPoint-=2

                }
                R.id.rb_IE3N->{
                    tempPoint=0
                    tempPoint-=1
                }
                R.id.rb_IE3M->{
                    tempPoint=0
                }
                R.id.rb_IE3Y->{
                    tempPoint=0
                    tempPoint+=1
                }
                R.id.rb_IE3YY->{
                    tempPoint=0
                    tempPoint+=2
                }
            }
            IE3=tempPoint
        }

        binding.btnGotoResult.setOnClickListener {

            IEPoint=0
            IEPoint=IE1+IE2+IE3
            Log.d("TAG","IE1 점수 : ${IE1},IE2 점수 : ${IE2}")
            Log.d("TAG","현재 토탈 IE 점수 : ${IEPoint}")

            IECalPoint=(IEPoint.toDouble()/3)*50
            Log.d("TAG","환산 IE 점수 : ${IECalPoint}")

        }


    }
}