package com.example.newjetpackcomposecourse.`12_Scaffold`

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample(){
    Scaffold(
        topBar ={
            TopAppBar(title = {Text("Top App Bar")}, colors = TopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
                scrolledContainerColor = MaterialTheme.colorScheme.surfaceContainer,
                navigationIconContentColor = MaterialTheme.colorScheme.primaryContainer,
                actionIconContentColor = MaterialTheme.colorScheme.surface,
            ))
        },
        bottomBar = {
            BottomAppBar (modifier = Modifier
                .fillMaxWidth()
                .height(80.dp), ){ Text("hi")
            Text("by")}
        }



    ) {innerPadding->
        Column(modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()) {  }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ExamplePreview() {
ScaffoldExample()
}

