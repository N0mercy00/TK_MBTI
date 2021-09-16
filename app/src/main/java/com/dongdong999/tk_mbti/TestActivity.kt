package com.dongdong999.tk_mbti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dongdong999.tk_mbti.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var tempPoint : Int =0; //임시값
        var IEqusetion :Array<Int> = arrayOf(0,0,0)//문제별 점수값값
        var SNqusetion :Array<Int> = arrayOf(0,0,0)
        var TFqusetion :Array<Int> = arrayOf(0,0,0)
        var JPqusetion :Array<Int> = arrayOf(0,0,0)

        var resultType :String =""
        var CalPoint:Array<Double> = arrayOf(0.0,0.0,0.0,0.0)// 환산점수 각 배열의 요소가 IE SN TF JP 점수
                                                            // -100->E  100->I

        var intent : Intent

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

        //TF_Part
        binding.rgTF1.setOnCheckedChangeListener { group,id->

            TFqusetion[0]=tempPoint
            tempPoint=0
            when(id){
                R.id.rb_TF1NN->{
                    tempPoint=0
                    tempPoint-=2
                }
                R.id.rb_TF1N->{
                    tempPoint=0
                    tempPoint-=1
                }
                R.id.rb_TF1M->{
                    tempPoint=0
                }
                R.id.rb_TF1Y->{
                    tempPoint=0
                    tempPoint+=1
                }
                R.id.rb_TF1YY->{
                    tempPoint=0
                    tempPoint+=2
                }
            }
            TFqusetion[0]=tempPoint
        }
        binding.rgTF2.setOnCheckedChangeListener { group,id->
            TFqusetion[1]=tempPoint
            tempPoint=0
            when(id){
                R.id.rb_TF2NN->{
                    tempPoint=0
                    tempPoint-=2

                }
                R.id.rb_TF2N->{
                    tempPoint=0
                    tempPoint-=1
                }
                R.id.rb_TF2M->{
                    tempPoint=0
                }
                R.id.rb_TF2Y->{
                    tempPoint=0
                    tempPoint+=1
                }
                R.id.rb_TF2YY->{
                    tempPoint=0
                    tempPoint+=2
                }
            }
            TFqusetion[1]=tempPoint
        }
        binding.rgTF3.setOnCheckedChangeListener { group,id->
            TFqusetion[2]=tempPoint
            tempPoint=0
            when(id){
                R.id.rb_TF3NN->{
                    tempPoint=0
                    tempPoint-=2

                }
                R.id.rb_TF3N->{
                    tempPoint=0
                    tempPoint-=1
                }
                R.id.rb_TF3M->{
                    tempPoint=0
                }
                R.id.rb_TF3Y->{
                    tempPoint=0
                    tempPoint+=1
                }
                R.id.rb_TF3YY->{
                    tempPoint=0
                    tempPoint+=2
                }
            }
            TFqusetion[2]=tempPoint
        }
        //

        //JP_part
        binding.rgJP1.setOnCheckedChangeListener { group,id->
            JPqusetion[0]=tempPoint
            tempPoint=0
            when(id){
                R.id.rb_JP1NN->{
                    tempPoint=0
                    tempPoint-=2
                }
                R.id.rb_JP1N->{
                    tempPoint=0
                    tempPoint-=1
                }
                R.id.rb_JP1M->{
                    tempPoint=0
                }
                R.id.rb_JP1Y->{
                    tempPoint=0
                    tempPoint+=1
                }
                R.id.rb_JP1YY->{
                    tempPoint=0
                    tempPoint+=2
                }
            }
            JPqusetion[0]=tempPoint
        }
        binding.rgJP2.setOnCheckedChangeListener { group,id->
            JPqusetion[1]=tempPoint
            tempPoint=0
            when(id){
                R.id.rb_JP2NN->{
                    tempPoint=0
                    tempPoint-=2
                }
                R.id.rb_JP2N->{
                    tempPoint=0
                    tempPoint-=1
                }
                R.id.rb_JP2M->{
                    tempPoint=0
                }
                R.id.rb_JP2Y->{
                    tempPoint=0
                    tempPoint+=1
                }
                R.id.rb_JP2YY->{
                    tempPoint=0
                    tempPoint+=2
                }
            }
            JPqusetion[1]=tempPoint
        }
        binding.rgJP3.setOnCheckedChangeListener { group,id->
            JPqusetion[2]=tempPoint
            tempPoint=0
            when(id){
                R.id.rb_JP3NN->{
                    tempPoint=0
                    tempPoint-=2
                }
                R.id.rb_JP3N->{
                    tempPoint=0
                    tempPoint-=1
                }
                R.id.rb_JP3M->{
                    tempPoint=0
                }
                R.id.rb_JP3Y->{
                    tempPoint=0
                    tempPoint+=1
                }
                R.id.rb_JP3YY->{
                    tempPoint=0
                    tempPoint+=2
                }
            }
            JPqusetion[2]=tempPoint
        }
        //

        binding.btnGotoResult.setOnClickListener {
            resultType=""
            CalPoint[0]=((IEqusetion[0]+IEqusetion[1]+IEqusetion[2]).toDouble()/3)*50
            Log.d("TAG","\n환산 IE 점수 : ${CalPoint[0]}")

            CalPoint[1]=((SNqusetion[0]+SNqusetion[1]+SNqusetion[2]).toDouble()/3)*50
            Log.d("TAG","환산 SN 점수 : ${CalPoint[1]}")

            CalPoint[2]=((TFqusetion[0]+TFqusetion[1]+TFqusetion[2]).toDouble()/3)*50
            Log.d("TAG","환산 TF 점수 : ${CalPoint[2]}")

            CalPoint[3]=((JPqusetion[0]+JPqusetion[1]+JPqusetion[2]).toDouble()/3)*50
            Log.d("TAG","환산 JP 점수 : ${CalPoint[3]}")





            resultType += if(CalPoint[0]>=0) "I" else "E"
            resultType += if(CalPoint[1]>=0) "S" else "N"
            resultType += if(CalPoint[2]>=0) "T" else "F"
            resultType += if(CalPoint[3]>=0) "J" else "P"
            Log.d("TAG","테스트 결과 : ${resultType}")

            intent = Intent(this,ResultActiviy::class.java)
            intent.putExtra("resultText",resultType)
            intent.putExtra("score1",CalPoint[0].toInt())
            intent.putExtra("score2",CalPoint[1].toInt())
            intent.putExtra("score3",CalPoint[2].toInt())
            intent.putExtra("score4",CalPoint[3].toInt())
            //intent.putExtra("score",CalPoint)
            startActivity(intent)


        }


    }
}