package com.example.myapplication.models

data class Post(
     val name: String,
     val content: String,
     val likes: Int,
     val comments: List<String>
)