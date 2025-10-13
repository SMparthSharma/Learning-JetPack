package com.example.firstjpcproject.`10_FloatingButton`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FloatingButton(){
    Box(modifier = Modifier.fillMaxSize()){
        ExtendedFloatingActionButton (onClick = { /*TODO*/ }) {
            Text("hello")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun FloatingButtonPreview(){
    FloatingButton()
}