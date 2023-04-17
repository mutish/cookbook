package com.example.cookbook

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun DetailsScreen(id: Long,name:String?, onNavigateUp: () -> Unit) {
    //from the list of articles, we use the id to filter & only show the clicked item
    val Recipe = allrecipes.first {
        it.id == id
    }
    Scaffold {
        Column(Modifier.padding(it)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 10.dp)
            ) {
                IconButton(onClick = onNavigateUp) {
                    Icon(Icons.Rounded.ArrowBack, contentDescription = "Go back")
                }
            }


            Image(
                painterResource(Recipe.imageResource), contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(16f / 9f), contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center, style = MaterialTheme.typography.body1,
                    text = Recipe.title
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    modifier = Modifier.fillMaxSize(),
                    style = MaterialTheme.typography.body1, text = Recipe.method
                )

            }
        }

    }

}

