package com.example.firstjpcproject.`6_Card`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ElevatedCard() {
  Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
    ElevatedCard(
        modifier = Modifier.size(height = 150.dp, width = 300.dp),
        elevation = CardDefaults.cardElevation(20.dp),
    ) {
      Box(
          modifier = Modifier.padding(20.dp).fillMaxSize().background(color = Color.Magenta),
          contentAlignment = Alignment.Center,
      ) {
        Text("hello")
      }
    }
  }
}

@Preview(showSystemUi = true)
@Composable
fun CardExamplePreview() {
  ElevatedCard()
}
