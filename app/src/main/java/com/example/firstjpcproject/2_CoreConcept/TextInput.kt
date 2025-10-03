package com.example.firstjpcproject.`2_CoreConcept`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextInput(){    //how to use text input in jetpack compose

    var text by remember {
        mutableStateOf("")
    }
val rainbowColors = listOf(
    Color.Red,
    Color.Yellow,
    Color.Green,
    Color.Cyan,
    Color.Blue,
);
    val brush = remember {
       Brush.linearGradient(colors = rainbowColors)
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){


        Column(){
            OutlinedTextField(value = text, onValueChange = {text=it}, label = { Text("input field") })

            TextField(value = text, onValueChange = {text=it},
                textStyle = TextStyle(brush=brush),
                label = {Text("input field")},
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType= KeyboardType.Password)

            )
        }

    }
}


@Preview(showSystemUi = true)
@Composable
fun TextInputPreview(){
    TextInput()

}