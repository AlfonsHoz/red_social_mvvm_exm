package com.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.viewmodel.PostsViewModel
import com.xwray.groupie.Group
import com.xwray.groupie.GroupieAdapter

class MainActivity2 : AppCompatActivity() {

    private val viewModel: PostsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initObservers()
        initViews()
    }

    private fun initObservers() {
        viewModel.post.observe(this) {posts -> // entra aca cada que se actualizan los valores del live data del viewmodel
            adapter.clear()
            posts.map {
                adapter.add(PostItem()) // agrega cada uno de los posts a un adapter que maneja el listado de los posts que se muestran
            }
        }
    }

    private val adapter by lazy { GroupieAdapter() }
    private lateinit var recyclerView : RecyclerView

    private fun initViews() {
        recyclerView = findViewById(R.id.recycler)
        recyclerView.adapter = adapter
    }
}