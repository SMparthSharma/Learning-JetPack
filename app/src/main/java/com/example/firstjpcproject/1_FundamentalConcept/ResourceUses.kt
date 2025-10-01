package com.example.firstjpcproject.`1_FundamentalConcept`

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firstjpcproject.R


//in this file or module we learn about fundamental concept of jetpack :-
//1. how to use Image from res folder
//2. how to use text from res folder
//3. how to use color from res folder
@Composable
fun AccessRes(){
    Box(modifier = Modifier.fillMaxSize().background(color = colorResource(R.color.purple_200)), contentAlignment = Alignment.Center, ){
        Column(){
            Text(text = stringResource(R.string.person) , color = colorResource(R.color.white), fontSize = 20.sp)
            Image(painter = painterResource(R.drawable.pic), contentDescription = "for learning purpose")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AccessResPreview(){
   AccessRes()
}