package com.example.firstjpcproject.`17_SegmentedButton`


import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview




    @Composable
    fun SingleChoiceSegmentedButton(modifier: Modifier = Modifier) {
        var selectedIndex: Int by remember { mutableStateOf(0) }
        val options = listOf("Day", "Month", "Week")

        SingleChoiceSegmentedButtonRow {
            options.forEachIndexed { index, label ->
                SegmentedButton(
                    shape = SegmentedButtonDefaults.itemShape(
                        index = index,
                        count = options.size
                    ),
                    onClick = { selectedIndex = index },
                    selected = index == selectedIndex,
                    label = { Text(label) }
                )
            }
        }
    }



@Preview(showSystemUi = true)
@Composable
fun ExamplePreview() {
    SingleChoiceSegmentedButton()
}

