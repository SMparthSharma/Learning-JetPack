package com.example.newjetpackcomposecourse.`15_PulltoRefresh`

import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults
import androidx.compose.material3.pulltorefresh.PullToRefreshState
import androidx.compose.material3.pulltorefresh.pullToRefreshIndicator
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PulltoRefreshScreen() {

    val scope = rememberCoroutineScope()
    var isRefreshing by remember { mutableStateOf(false) }
    var items by remember { mutableStateOf(List(20) { "item $it" }) }

    fun refreshItems() {
        scope.launch {
            isRefreshing = true
            delay(2000)
            items = List(20) { "item #${(0..100).random()}" } // simulate data change
            isRefreshing = false
        }
    }

    PullToRefreshBasicSample(
        items = items,
        isRefreshing = isRefreshing,
        onRefresh = { refreshItems()

        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PullToRefreshBasicSample(
    items: List<String>,
    isRefreshing: Boolean,
    onRefresh: () -> Unit,
    modifier: Modifier = Modifier
) {
    PullToRefreshBox(
        isRefreshing = isRefreshing,
        onRefresh = onRefresh,
        modifier = modifier
    ) {
        LazyColumn(Modifier.fillMaxSize()) {
            items(items) {
                ListItem({ Text(text = it) })
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ExamplePreview() {
    PulltoRefreshScreen()
}
