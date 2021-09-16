package com.dongdong999.tk_mbti

import android.content.Context
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.app.NotificationCompat.getColor
import com.bumptech.glide.Glide
import com.dongdong999.tk_mbti.databinding.ActivityResultActiviyBinding

class ResultActiviy : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityResultActiviyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var resultText= intent.getStringExtra("resultText")
        var score:Array<Int> = arrayOf(0,0,0,0)
        score[0]=intent.getIntExtra("score1",0)
        score[1]=intent.getIntExtra("score2",0)
        score[2]=intent.getIntExtra("score3",0)
        score[3]=intent.getIntExtra("score4",0)





        Log.d("TAG","전달완료 결과값 ${resultText}, 점수 각 ${score[0]} ${score[1]} ${score[2]} ${score[3]}")


        if(resultText.equals("ISTJ")){
            Glide.with(this)
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/GuanYu-ZhouCang.jpg/200px-GuanYu-ZhouCang.jpg")
                .into(binding.ivResultImage)



        }else if(resultText.equals("ENFP")){
            Glide.with(this)
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Cao_Cao_Portrait_ROTK.jpg/209px-Cao_Cao_Portrait_ROTK.jpg")
                .into(binding.ivResultImage)
            binding.tvResultName.text="당신은 '조조형' 인물입니다."
            binding.tvResultcontent.text ="'차라리 내가 천하를 등질지언정, 천하가 나를 등지게 하지는 않겠다.'\n'그 아이가 죽은건 내게 불행이지만 너희들에겐 오히려 행운이렸다'\n-아들 조충이 죽었을때 다른 아들들에게 말하며-"
        }



        val cunstomView = CustomView("",this)
        binding.llChar.addView(cunstomView)




    }
    class CustomView(text:String , context:Context, ): View(context){
        override fun onDraw(canvas: Canvas?) {

            //중앙 시작 x 좌표 180
            //다음 그래프로 이동하려면 y60더해줄것

            //그래프 두깨 y2= y1+30
            //x길이 맥시멈은 좌로는 0 우로는 360

            //ISTJ값은 각 값이 들어오면 X2=(100-해당값)*2

            //ENFP 값은 각 값이 들어오면 x2= 220+(절대값 *2)



            val yello = Paint()
            yello.style=Paint.Style.FILL
            yello.strokeWidth=10f
            yello.color= resources.getColor(R.color.color1)
            var IErect = Rect(180,20,120, 50)
            canvas?.drawRect(IErect,yello)

            val green = Paint()
            green.style=Paint.Style.FILL
            green.strokeWidth=10f
            green.color= resources.getColor(R.color.color2)
            var SNrect = Rect(180,80,50, 110)
            canvas?.drawRect(SNrect,green)

            val yello2 = Paint()
            yello2.style=Paint.Style.FILL
            yello2.strokeWidth=10f
            yello2.color= resources.getColor(R.color.color3)
            var TFrect = Rect(180,140,80, 170)
            canvas?.drawRect(TFrect,yello2)

            val green2 = Paint()
            green2.style=Paint.Style.FILL
            green2.strokeWidth=10f
            green2.color= resources.getColor(R.color.color4)
            var JPrect = Rect(180,200,150, 230)
            canvas?.drawRect(JPrect,green2)

            val black = Paint()
            black.style=Paint.Style.STROKE
            black.strokeWidth=10f
            black.color= Color.GRAY
            var rect = Rect(180,20,180, 240)
            canvas?.drawRect(rect,black)


        }
    }
}