package com.akirachix.myblogs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlogsAdapter(var blogsList: List<Blogs>): RecyclerView.Adapter<BlogsViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.blags_list_items,parent, false)
        return BlogsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BlogsViewHolder, position: Int) {
        val blog =  blogsList[position]
        holder.tvName.text = blog.name
        holder.tvPublish.text = blog.publishDate
        holder.tvTitle.text = blog.title
        holder.tvParagraph.text = blog.paragraph


    }

    override fun getItemCount(): Int {
        return blogsList.size

    }
}
class BlogsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPublish = itemView.findViewById<TextView>(R.id.tvPublish)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvParagraph = itemView.findViewById<TextView>(R.id.tvParagraph)
    var ivAuthor = itemView.findViewById<TextView>(R.id.tvParagraph)


}