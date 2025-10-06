package com.example.firstjpcproject.`3_LayoutBasics`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun LazyColumnExp(){
    Column (modifier = Modifier.fillMaxSize(),  horizontalAlignment = Alignment.CenterHorizontally){

        LazyColumn(modifier = Modifier.fillMaxSize(0.5f).padding(50.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            items(100){index->
                Text(text = "item $index")
            }
        }
        LazyRow(modifier = Modifier.fillMaxSize().padding(50.dp), horizontalArrangement = Arrangement.Center) { items(30){
            Text(text = "item $it")
        } }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LazyColumnExpPreview(){
    LazyColumnExp()
}