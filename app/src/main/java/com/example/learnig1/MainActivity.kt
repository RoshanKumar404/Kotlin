package com.example.learnig1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
import com.example.learnig1.Src.learnigs.Greet
import com.example.learnig1.ui.theme.Learnig1Theme
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge(false)
        setContent {

            Learnig1Theme {
               // Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                  Greet(
                    name="Rahul",age=23, color=Color.Gray
                  )
                //}
            }
        }
    }
}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello ${name}! welcome to the new world",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Learnig1Theme {
//        Greeting("rohan")
//    }
//}