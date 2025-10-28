package com.example.firstjpcproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.firstjpcproject.`11_Menus`.SideMenu
import com.example.firstjpcproject.`22_DatePicker`.DatePickerFieldToModal
import com.example.firstjpcproject.`23_TimePicker`.TimePickerEx
import com.example.firstjpcproject.`6_Card`.ElevatedCard
import com.example.firstjpcproject.`7_CheckBox`.MyCheckBox
import com.example.firstjpcproject.`8_Chip`.AllChip
import com.example.firstjpcproject.ui.theme.FirstJPCProjectTheme
import com.example.newjetpackcomposecourse.`16_SearchBar`.SearchScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstJPCProjectTheme {
                TimePickerEx()
            }
        }
    }
}

