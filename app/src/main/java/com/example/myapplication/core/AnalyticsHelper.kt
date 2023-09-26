package com.example.myapplication.core

import com.example.myapplication.models.Post

object AnalyticsHelper { // la palabra reservaja object, permite generar un objeto singleton con una unica instancia
    private val firebaseAnalytics = Firebase.analytics

    fun sendNewPostEvent(post: Post) {
        firebaseAnalytics.logEvent("new_post") {
            param("user_name", post.name)
            param("content", post.content)
            param("likes", post.likes)
            param("comments", post.comments.joinToString(";"))
        }
    }
}