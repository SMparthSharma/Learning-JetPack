package com.example.firstjpcproject.`7_CheckBox`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyCheckBox(){
    val childCheckedState= remember {
        mutableStateListOf(false,false,false)
    }
    val parentState=when {
        childCheckedState.all { it } -> ToggleableState.On
        childCheckedState.none { it } -> ToggleableState.Off
        else -> ToggleableState.Indeterminate
    }
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Row (horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
                Text("Select all")
                TriStateCheckbox(
                    state=parentState,
                    onClick = {
                      val  newState=parentState!=ToggleableState.On
                        childCheckedState.forEachIndexed { index, _ ->
                            childCheckedState[index]=newState
                         }

                    }
                )
        }
            childCheckedState.forEachIndexed { index,it->
                Row (horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
                    Text("Select $index")
                    Checkbox(
                        checked = it,
                        onCheckedChange = {
                            childCheckedState[index]=it
                        }
                    )
                }
            }
    }
}


@Preview(showSystemUi = true)
@Composable
fun MyCheckBoxPreview(){
    MyCheckBox()
}