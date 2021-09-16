package com.dongdong999.tk_mbti

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.dongdong999.tk_mbti.databinding.ActivityResultActiviyBinding

class ResultActiviy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityResultActiviyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/GuanYu-ZhouCang.jpg/200px-GuanYu-ZhouCang.jpg")
            .into(binding.ivResultImage)

        val cunstomView = CustomView("",this)
        binding.llChar.addView(cunstomView)




    }
    class CustomView(text:String , context:Context, ): View(context){
        override fun onDraw(canvas: Canvas?) {

            //중앙 시작 x 좌표 220
            //다음 그래프로 이동하려면 y110 더해줄것

            //그래프 두깨 y2= y1+80
            //x길이 맥시멈은 좌로는 0 우로는 420

            //ISTJ값은 각 값이 들어오면 X2=(100-해당값)*2

            //ENFP 값은 각 값이 들어오면 x2= 220+(절대값 *2)

            val yello = Paint()
            yello.style=Paint.Style.FILL
            yello.strokeWidth=10f
            yello.color= Color.YELLOW
            var IErect = Rect(220,20,180, 100)
            canvas?.drawRect(IErect,yello)

            val green = Paint()
            green.style=Paint.Style.FILL
            green.strokeWidth=10f
            green.color= Color.GREEN
            var SNrect = Rect(220,130,240, 210)
            canvas?.drawRect(SNrect,green)

            val yello2 = Paint()
            yello2.style=Paint.Style.FILL
            yello2.strokeWidth=10f
            yello2.color= Color.YELLOW
            var TFrect = Rect(220,240,10, 320)
            canvas?.drawRect(TFrect,yello2)

            val green2 = Paint()
            green2.style=Paint.Style.FILL
            green2.strokeWidth=10f
            green2.color= Color.GREEN
            var JPrect = Rect(220,350,300, 430)
            canvas?.drawRect(JPrect,green2)

            val black = Paint()
            black.style=Paint.Style.STROKE
            black.strokeWidth=10f
            black.color= Color.GRAY
            var rect = Rect(220,20,220, 430)
            canvas?.drawRect(rect,black)


        }
    }
}