package com.paulchibamba.portfolioapp.fragments.cv.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.paulchibamba.portfolioapp.R
import com.paulchibamba.portfolioapp.fragments.cv.CVItem

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    //Hardcoded lists just to fill the recyclerView. Will Be Replaced Later
    //Creating Qualification
    val computingDegree = CVItem("2021", "BSc Hons in Computing - The University of Greenwich")
    val computingDiploma = CVItem("2019", "NCC Education Level 5 Advanced Diploma in Computing - Zambia Centre for Accountancy Studies")
    val computingDiploma2 = CVItem("2017", "NCC Education Level 4 Diploma in Computing - Zambia Centre for Accountancy Studies")
    val computingDiploma3 = CVItem("2015", "NCC Education Level 3 Diploma in Computing - Zambia Centre for Accountancy Studies")

    val cvItems = listOf<CVItem>(computingDegree, computingDiploma, computingDiploma2, computingDiploma3)

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var title : TextView
        var description : TextView

        init {
            title = itemView.findViewById(R.id.titleTextView)
            description = itemView.findViewById(R.id.descriptionTextView)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cv_row_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.title.text = cvItems[position].title
        holder.description.text = cvItems[position].description
    }

    override fun getItemCount(): Int {
        return cvItems.size
    }


}