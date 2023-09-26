package com.example.myapplication.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.data.EmptyGroup.name
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.models.Post
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.viewmodel.PostsViewModel

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Posts("Android")
                }
            }
        }

        //initObservers()
    }
}



@Composable
fun Posts(post: Post) {
    Column(content = {})
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        //Greeting("Android")
    }
}