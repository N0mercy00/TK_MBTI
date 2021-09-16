package com.dongdong999.tk_mbti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dongdong999.tk_mbti.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var tempPoint : Int =0; //임시값
        var IECalPoint : Double=0.0 //IE 환산점수 -100->E  100->I
        var IEqusetion :Array<Int> = arrayOf(0,0,0)//문제별 점수값값

        var SNCalPoint : Double=0.0
        var SNqusetion :Array<Int> = arrayOf(0,0,0)



        super.onCreate(savedInstanceState)
        val binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)




        //IE_Part
        binding.rgIE1.setOnCheckedChangeListener{group,id->
            IEqusetion[0]=tempPoint
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
            IEqusetion[0]=tempPoint
        }
        binding.rgIE2.setOnCheckedChangeListener { group,id->
            IEqusetion[1]=tempPoint
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
            IEqusetion[1]=tempPoint
        }
        binding.rgIE3.setOnCheckedChangeListener { group,id->
            IEqusetion[2]=tempPoint
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
            IEqusetion[2]=tempPoint
        }
        //

        //SN_Part
        binding.rgSN1.setOnCheckedChangeListener { group,id->
            SNqusetion[0]=tempPoint
            tempPoint=0
            when(id){
                R.id.rb_SN1NN->{
                    tempPoint=0
                    tempPoint-=2

                }
                R.id.rb_SN1N->{
                    tempPoint=0
                    tempPoint-=1
                }
                R.id.rb_SN1M->{
                    tempPoint=0
                }
                R.id.rb_SN1Y->{
                    tempPoint=0
                    tempPoint+=1
                }
                R.id.rb_SN1YY->{
                    tempPoint=0
                    tempPoint+=2
                }
            }
            SNqusetion[0]=tempPoint
        }
        binding.rgSN2.setOnCheckedChangeListener { group,id->
            SNqusetion[1]=tempPoint
            tempPoint=0
            when(id){
                R.id.rb_SN2NN->{
                    tempPoint=0
                    tempPoint-=2

                }
                R.id.rb_SN2N->{
                    tempPoint=0
                    tempPoint-=1
                }
                R.id.rb_SN2M->{
                    tempPoint=0
                }
                R.id.rb_SN2Y->{
                    tempPoint=0
                    tempPoint+=1
                }
                R.id.rb_SN2YY->{
                    tempPoint=0
                    tempPoint+=2
                }
            }
            SNqusetion[1]=tempPoint
        }
        binding.rgSN3.setOnCheckedChangeListener { group,id->
            SNqusetion[2]=tempPoint
            tempPoint=0
            when(id){
                R.id.rb_SN3NN->{
                    tempPoint=0
                    tempPoint-=2

                }
                R.id.rb_SN3N->{
                    tempPoint=0
                    tempPoint-=1
                }
                R.id.rb_SN3M->{
                    tempPoint=0
                }
                R.id.rb_SN3Y->{
                    tempPoint=0
                    tempPoint+=1
                }
                R.id.rb_SN3YY->{
                    tempPoint=0
                    tempPoint+=2
                }
            }
            SNqusetion[2]=tempPoint
        }
        //

        binding.btnGotoResult.setOnClickListener {
            IECalPoint=((IEqusetion[0]+IEqusetion[1]+IEqusetion[2]).toDouble()/3)*50
            Log.d("TAG","환산 IE 점수 : ${IECalPoint}")

            SNCalPoint=((SNqusetion[0]+SNqusetion[1]+SNqusetion[2]).toDouble()/3)*50
            Log.d("TAG","환산 SN 점수 : ${SNCalPoint}")

        }


    }
}