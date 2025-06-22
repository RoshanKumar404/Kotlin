package com.example.learnig1.Src

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.HistoricalChange

@Composable
fun StateHosting(text:String,onTextChange:(String)->Unit) {
    TextField(
        value = text,
        onValueChange = onTextChange,
        label = { Text("enter your things buddy") }
    )
}

@Composable
fun ParentCompose(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf(value = " ") }
    StateHosting(text) {
        text=it
    }
}