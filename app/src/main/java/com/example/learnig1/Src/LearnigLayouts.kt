package com.example.learnig1.Src

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnig1.R

@Composable
fun LayPut(modifier: Modifier = Modifier) {
 Box(modifier = Modifier.fillMaxSize(),
     contentAlignment = Alignment.Center){
     Column(modifier=Modifier
         .border(
             width = 4.dp,
             brush = Brush.linearGradient(colors = listOf(Color.Red,Color.Yellow)),
             shape = RoundedCornerShape(12.dp))
         .padding(16.dp),
         horizontalAlignment=Alignment.CenterHorizontally
         ) {
         Text("Hey Mr Roshan ji, i have something for you")
         Text("Today is very beautiful day")
         Button(onClick ={} ) {
             Text("bhai kuchh to kr le")
         }
         Spacer(modifier=Modifier.height(18.dp))
     }
 }

    Image(
        painter = painterResource(id = R.drawable.pic), // NO .jpg here
        contentDescription = "A lovely image"
    )

 }
@Composable
@Preview(showSystemUi = true)
fun LayPutPreview(modifier: Modifier=Modifier){
    LayPut()
}
