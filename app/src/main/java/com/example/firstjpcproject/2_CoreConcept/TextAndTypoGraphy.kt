package com.example.firstjpcproject.`2_CoreConcept`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firstjpcproject.R

@Composable
fun SimpleText(){
    Text(text = stringResource(R.string.person) , color = colorResource(R.color.white), fontSize = 20.sp)
}
val rainbowColors = listOf(
    Color.Red,
    Color.Yellow,
    Color.Green,
    Color.Cyan,
    Color.Blue,
    Color.Magenta,
);
@Composable
fun RainbowText(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = buildAnnotatedString {
            append("hello \n")
            withStyle(style = SpanStyle(brush= Brush.linearGradient(colors = rainbowColors))) {
    append("how are you? \n")
}
            append("I'm fine, thank you! \n")
        })
    }
}

@Preview(showSystemUi = true)
@Composable
fun SimpleTextPreview(){
    RainbowText()
}