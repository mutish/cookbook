package com.example.cookbook

import RecipeCard
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cookbook.model.recipe

@Composable
fun HomeScreen(onDetailsClick: (id:Long) -> Unit, onAboutClick: () -> Unit) {
    Scaffold {
        LazyColumn(contentPadding = it) {
            item {
                HomeAppBar(onAboutClick)
            }
            item {
                Spacer(modifier = Modifier.height(30.dp))
            }
            items(allrecipes) {
                RecipeCard(it, onClick = {
                    onDetailsClick(it.id)
                })


            }
        }

    }

}



@Composable
private fun HomeAppBar(onAboutClick: () -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp)
    ) {
        Text("Latest Articles", style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.weight(1f))
        TextButton(onClick = onAboutClick) {
            Text("About")
        }
    }
}
