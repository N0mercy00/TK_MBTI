package com.dongdong999.tk_mbti

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dongdong999.tk_mbti.databinding.ItemRecyclerBinding

class CustomAdapter :RecyclerView.Adapter<Holder>() {
    var questionData = mutableListOf<Question>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemRecyclerBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val qu = questionData.get(position)
        holder.setQuest(qu)
    }

    override fun getItemCount(): Int {
        return questionData.size
    }

    fun additem(question: Question){
        questionData.add(question)
        notifyDataSetChanged()

    }
}

class Holder(val binding : ItemRecyclerBinding):RecyclerView.ViewHolder(binding.root){
    init{

    }

    fun setQuest(qu:Question){
        binding.recyclerItemTitle.text = qu.ques
    }
}