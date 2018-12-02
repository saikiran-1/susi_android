package org.fossasia.susi.ai.skills.skilldetails.adapters.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

import org.fossasia.susi.ai.R

import kotterknife.bindView

class SkillExampleViewHolder(itemView: View, private val listener: SkillExampleViewHolder.ClickListener?) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    val example: TextView by bindView(R.id.text)

    init {
        itemView.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        listener?.onItemClicked(adapterPosition)
    }

    interface ClickListener {
        fun onItemClicked(position: Int)
    }
}