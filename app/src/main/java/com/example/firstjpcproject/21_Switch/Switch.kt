package com.example.firstjpcproject.`21_Switch`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun SwitchEx() {

    var checked by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize(),

        contentAlignment = Alignment.Center
        ){
        Switch(
            checked = checked,
            onCheckedChange = {

                checked = it
            },
            thumbContent = if (checked) {
                {
                    Icon(
                        imageVector = Icons.Filled.Call, contentDescription = null,
                        modifier = Modifier.size(SwitchDefaults.IconSize)
                    )
                }
            } else {

                {
                    Icon(
                        imageVector = Icons.Filled.Call, contentDescription = null,
                        modifier = Modifier.size(SwitchDefaults.IconSize)
                    )
                }
            }
        )

    }


}

@Preview(showSystemUi = true)
@Composable
fun ExamplePreview() {
    SwitchEx()
}




