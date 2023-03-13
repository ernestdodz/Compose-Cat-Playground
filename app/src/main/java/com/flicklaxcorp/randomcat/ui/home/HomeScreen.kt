package com.flicklaxcorp.randomcat.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()

    Column {
        Text(text = "Loading image from source:")
        Text(text = state.imageUrl)
        AsyncImage(
            model = state.imageUrl,
            contentDescription = null
        )
    }

}
