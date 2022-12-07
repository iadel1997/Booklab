package com.example.book.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.book.R
import com.example.book.model.Book
import org.w3c.dom.Text

class BookAdapter(private val context : Context,
                  private val dataset : List<Book>) : RecyclerView.Adapter<BookAdapter.ViewHolder>() { //End of BookAdapter

    // TODO 2 Implement ViewHolder
    class ViewHolder(private val view: View ) : RecyclerView.ViewHolder(view){
        // views in loyout fils
        val bookTitle : TextView = view.findViewById(R.id.item_book_title)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false)


        return ViewHolder(itemLayout)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = dataset[position]
        holder.bookTitle.text = context.resources.getString(item.name)
    }
    override fun getItemCount() = dataset.size// End ViewHolder

} // End

