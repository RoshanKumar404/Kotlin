package com.example.learnig1.Src

//import android.icu.text.UnicodeSetSpanner.CountMethod
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

//import androidx.compose.ui.Modifier

@Composable
fun StateLearnig() {
    var count by remember { mutableStateOf(1) }
Column {
    Text("${count}")
    Button(onClick = {
        count++
    }) {
        Text("adder")
    }
    Button(onClick = {
       count--;
    }) {
        Text("Subtractor")
    }
}

}