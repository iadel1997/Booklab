package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.recyclerview.widget.RecyclerView
import com.example.book.adapter.BookAdapter
import com.example.book.dara.Datarse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datset = Datarse().loudbook()

        val recyclerView = findViewById<RecyclerView>(R.id.rv_book)

        val adapter = BookAdapter(this, datset)

        recyclerView.adapter = adapter

        recyclerView.setHasFixedSize(true)
    }
}