package com.example.learnig1.Src

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
//import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun State() {
//    var count by remember {
//        mutableStateOf(0)
//
//    }

    Row(
        horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(horizontal = 10.dp) ){
        var count by rememberSaveable  {
            mutableIntStateOf(0)

        }
        Button(
            onClick = {
                count++
            }
        ) {
            Text("Increase")
        }
        Text("$count", modifier=Modifier
            .padding(horizontal = 10.dp, vertical = 13.dp), fontSize = 24.sp, fontWeight = FontWeight.Bold)



        Button(onClick = {
            count--
        }) {Text("Decrease") }
    }
}