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
            binding.tvResultName.text=getString(R.string.ENFP_title)
            binding.tvResultsay.text = getString(R.string.ENFP_say)
            binding.tvResultsummary.text=getText(R.string.ENFP_content)
        }





    }

}