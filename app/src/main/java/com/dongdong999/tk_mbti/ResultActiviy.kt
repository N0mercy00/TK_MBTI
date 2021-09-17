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



        if(resultText.equals("ENFP")){
            Glide.with(this)
                .load(getString(R.string.ENFP_url))
                .into(binding.ivResultImage)

            binding.tvResultName.text=getString(R.string.ENFP_title)
            binding.tvResultsay.text = getString(R.string.ENFP_say)
            binding.tvResultsummary.text=getText(R.string.ENFP_content)


        }else if(resultText.equals("ENTJ")){
            Glide.with(this)
                .load(getString(R.string.ENTJ_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.ENTJ_title)
            binding.tvResultsay.text = getString(R.string.ENTJ_say)
            binding.tvResultsummary.text=getText(R.string.ENTJ_content)
        }else if(resultText.equals("ESTJ")){
            Glide.with(this)
                .load(getString(R.string.ESTJ_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.ESTJ_title)
            binding.tvResultsay.text = getString(R.string.ESTJ_say)
            binding.tvResultsummary.text=getText(R.string.ESTJ_content)

        }else if(resultText.equals("INFP")){
            Glide.with(this)
                .load(getString(R.string.INFP_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.INFP_title)
            binding.tvResultsay.text = getString(R.string.INFP_say)
            binding.tvResultsummary.text=getText(R.string.INFP_content)
        }else if(resultText.equals("ESTP")){
            Glide.with(this)
                .load(getString(R.string.ESTP_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.ESTP_title)
            binding.tvResultsay.text = getString(R.string.ESTP_say)
            binding.tvResultsummary.text=getText(R.string.ESTP_content)
        }else if(resultText.equals("ENTP")){
            Glide.with(this)
                .load(getString(R.string.ENTP_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.ENTP_title)
            binding.tvResultsay.text = getString(R.string.ENTP_say)
            binding.tvResultsummary.text=getText(R.string.ENTP_content)
        }else if(resultText.equals("ISTJ")){
            Glide.with(this)
                .load(getString(R.string.ISTJ_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.ISTJ_title)
            binding.tvResultsay.text = getString(R.string.ISTJ_say)
            binding.tvResultsummary.text=getText(R.string.ISTJ_content)
        }else if(resultText.equals("ISTP")){
            Glide.with(this)
                .load(getString(R.string.ISTP_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.ISTP_title)
            binding.tvResultsay.text = getString(R.string.ISTP_say)
            binding.tvResultsummary.text=getText(R.string.ISTP_content)
        }else if(resultText.equals("INFJ")){
            Glide.with(this)
                .load(getString(R.string.INFJ_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.INFJ_title)
            binding.tvResultsay.text = getString(R.string.INFJ_say)
            binding.tvResultsummary.text=getText(R.string.INFJ_content)
        }else if(resultText.equals("INTP")){
            Glide.with(this)
                .load(getString(R.string.INTP_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.INTP_title)
            binding.tvResultsay.text = getString(R.string.INTP_say)
            binding.tvResultsummary.text=getText(R.string.INTP_content)
        }else if(resultText.equals("ENFJ")){
            Glide.with(this)
                .load(getString(R.string.ENFJ_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.ENFJ_title)
            binding.tvResultsay.text = getString(R.string.ENFJ_say)
            binding.tvResultsummary.text=getText(R.string.ENFJ_content)
        }else if(resultText.equals("ESFJ")){
            Glide.with(this)
                .load(getString(R.string.ESFJ_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.ESFJ_title)
            binding.tvResultsay.text = getString(R.string.ESFJ_say)
            binding.tvResultsummary.text=getText(R.string.ESFJ_content)
        }else if(resultText.equals("ISFJ")){
            Glide.with(this)
                .load(getString(R.string.ISFJ_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.ISFJ_title)
            binding.tvResultsay.text = getString(R.string.ISFJ_say)
            binding.tvResultsummary.text=getText(R.string.ISFJ_content)
        }else if(resultText.equals("INTJ")){
            Glide.with(this)
                .load(getString(R.string.INTJ_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.INTJ_title)
            binding.tvResultsay.text = getString(R.string.INTJ_say)
            binding.tvResultsummary.text=getText(R.string.INTJ_content)
        }else if(resultText.equals("ISFP")){
            Glide.with(this)
                .load(getString(R.string.ISFP_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.ISFP_title)
            binding.tvResultsay.text = getString(R.string.ISFP_say)
            binding.tvResultsummary.text=getText(R.string.ISFP_content)
        }else if(resultText.equals("ESFP")){
            Glide.with(this)
                .load(getString(R.string.ESFP_url))
                .into(binding.ivResultImage)
            binding.tvResultName.text=getString(R.string.ESFP_title)
            binding.tvResultsay.text = getString(R.string.ESFP_say)
            binding.tvResultsummary.text=getText(R.string.ESFP_content)
        }







    }

}