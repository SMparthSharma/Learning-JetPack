package com.example.firstjpcproject.`2_CoreConcept`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ButtonFile(){
    val context= LocalContext.current
    val onClick = { text: String ->
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Column{
            // button
            Button(
                onClick = { onClick("Button") }

            ) { Text("Button")}

            //filled button
            FilledTonalButton(onClick= { onClick("filled tonal button") }) {
                Text("filled tonal button")
            }
            //outline Button
            OutlinedButton(onClick= { onClick("Outlined Button") }) {
                Text("Outlined Button ")
            }
            //text button
            TextButton(onClick= { onClick("Text Button") }) {
                Text("Text Button")
            }
            //Elevated Button
            ElevatedButton(onClick= { onClick("Elevated Button") }){
                Text("Elevated Button")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ButtonPreview(){
    ButtonFile()
}