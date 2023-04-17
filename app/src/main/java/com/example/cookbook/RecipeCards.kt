import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cookbook.model.recipe


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RecipeCard(recipe: recipe, onClick : () -> Unit) {
    Card(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 10.dp)
            .fillMaxWidth(),
        onClick = onClick
    ) {
        Column {
            Image(
                painterResource(id = recipe.imageResource),
                contentDescription = "Thumbnail",
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(16f / 9f),
                contentScale = ContentScale.Crop
            )

            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Text(recipe.title)
            }
        }

    }
}