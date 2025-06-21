package com.example.learnig1.Src

import androidx.compose.foundation.background
import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
//import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.Shape
//import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
//@Preview()
fun Dynamic() {
    //Lazy column
    LazyRow {
        items(count = 15){index->
            Text("jai sri ram roshan $index", modifier = Modifier
                .padding(10.dp)
                .height(25.dp)
                .background(color = Color.White)
                .border(
                    width = 4.dp,
                    brush =Brush.linearGradient(colors = listOf(Color.Cyan,Color.Magenta,Color.Red),
                    ),
                    shape=RoundedCornerShape(4.dp)

                ))
        }
    }
    LazyColumn {
        items(count = 100){index->
            Text("Roshan is very good boy $index", modifier = Modifier
                .padding(5.dp)

                .height(25.dp)
                .background(color = Color.White)
                .border(
                    width = 4.dp,
                    brush =Brush.linearGradient(colors = listOf(Color.Cyan,Color.Magenta,Color.Red),
                    ),
                    shape=RoundedCornerShape(4.dp)

                )
//                .border(
//                    width = 4.dp,
//                    brush = Brush.linearGradient(colors = listOf(Color.Cyan,Color.Red,Color.Magenta),
////                        start = Offset(0.0f, 50.0f),
////                        end = Offset(0.0f, 100.0f)
//
//                ),
//                    shape = RoundedCornerShape(4.dp),

                )
        }
    }
}

//@Composable
//fun prev(modifier: Modifier){
//    Dynamic()
//}