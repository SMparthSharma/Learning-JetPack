package com.example.firstjpcproject.`11_Menus`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SideMenu() {
  var expanded by remember { mutableStateOf(false) }

  Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.TopEnd
  ) {
    Box(modifier = Modifier.padding(26.dp)) {
      IconButton(onClick = { expanded = !expanded }) {
        Icon(Icons.Default.MoreVert, contentDescription = "More options")
      }

      DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false }
      ) {
        DropdownMenuItem(
          text = { Text("Profile") },
          onClick = {
            println("Profile clicked")

          },
          trailingIcon = {
            Icon(Icons.Outlined.AccountCircle, contentDescription = "Profile icon")
          }
        )

        DropdownMenuItem(
          text = { Text("Cart") },
          onClick = {
            println("Cart clicked")

          },
          trailingIcon = {
            Icon(Icons.Outlined.ShoppingCart, contentDescription = "Cart icon")
          }
        )

        HorizontalDivider()

        DropdownMenuItem(
          text = { Text("Favorites") },
          onClick = {
            println("Favorites clicked")

          },
          trailingIcon = {
            Icon(Icons.Outlined.Favorite, contentDescription = "Favorite icon")
          }
        )
      }
    }
  }
}

@Preview(showSystemUi = true)
@Composable
fun SideMenuPreview() {
  SideMenu()
}
