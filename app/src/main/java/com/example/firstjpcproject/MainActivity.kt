package com.example.firstjpcproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.firstjpcproject.`2_CoreConcept`.AnnotationText
import com.example.firstjpcproject.`2_CoreConcept`.ButtonFile
import com.example.firstjpcproject.ui.theme.FirstJPCProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstJPCProjectTheme {
                ButtonFile()
            }
        }
    }
}

