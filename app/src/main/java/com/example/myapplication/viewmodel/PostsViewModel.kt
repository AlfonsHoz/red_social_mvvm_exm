package com.example.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.models.Post
import kotlinx.coroutines.launch

class PostsViewModel: ViewModel() {
    private val _posts : MutableLiveData<List<Post>> by lazy { MutableLiveData<List<Post>>() }
    val post : LiveData<List<Post>> = _posts

    fun fetchPosts(){
        viewModelScope.launch {// permite ejecutar codigo dentro del viewmodel de manera asincrona para noa fectar el proceso principal
            _posts.postValue(postsRepository.fetchDocuments()) // este postValue actualiza el valor del live data notificando al observer.
        }
    }
}