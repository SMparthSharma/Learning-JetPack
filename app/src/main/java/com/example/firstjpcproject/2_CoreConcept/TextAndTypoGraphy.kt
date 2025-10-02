package com.example.firstjpcproject.`2_CoreConcept`

import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
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
import androidx.compose.ui.text.style.TextOverflow
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
    // how to use rainbow text in jetpack compose
    Box(modifier = Modifier.fillMaxSize().background(color = Color.Magenta),
        contentAlignment = Alignment.Center
    ) {
       Text(text = buildAnnotatedString {
           append(text = "hello")
          withStyle(
              SpanStyle(
                  brush = Brush.linearGradient(colors = rainbowColors)
              )
          ){
              append(text = " how are you ")
          }
           append(text = "parth")
       })
    }
}

@Composable
fun OverFlowText(){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(
            text = "hey there I am trying to learn jetpack compose and I am enjoying it".repeat(50),//in this line .repeat() method is  use to repeat this text n times
 maxLines = 2, fontSize = 40.sp,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun MarqueeText(){
    //how to scroll a text automatically
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = "hey there I am trying to learn jetpack compose and I am enjoying it ", modifier = Modifier.basicMarquee())
    }
}

@Preview(showSystemUi = true)
@Composable
fun MyPreview(){
    OverFlowText()
}