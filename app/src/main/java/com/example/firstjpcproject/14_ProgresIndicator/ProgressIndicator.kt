package com.example.newjetpackcomposecourse.`14_ProgresIndicator`

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CircularIndicatorEx() {
  var loading by remember { mutableStateOf(false) }
  Column(
      modifier = Modifier.fillMaxSize(),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center,
  ) {
    Button(onClick = { loading = !loading }) { Text("start loading") }
    if (loading)
        return Column {
            LinearProgressIndicator(
                modifier = Modifier.width(120.dp),
                color = MaterialTheme.colorScheme.primary,
                trackColor = MaterialTheme.colorScheme.surfaceVariant,

                )
            Spacer(modifier = Modifier.height(20.dp))
            CircularProgressIndicator(
                modifier = Modifier.width(120.dp),
                color = MaterialTheme.colorScheme.primary,
                trackColor = MaterialTheme.colorScheme.surfaceVariant,

                )
        }
  }
}

@Preview(showSystemUi = true)
@Composable
fun ExamplePreview() {
  CircularIndicatorEx()
}
