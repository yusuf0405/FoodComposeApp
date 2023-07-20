package com.joseph.foodcomposeapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.joseph.foodcomposeapp.R
import com.joseph.foodcomposeapp.domain.models.Recipe

@Composable
fun RecipeList(
    modifier: Modifier = Modifier,
    recipes: List<Recipe>
) {
    LazyRow {
        items(
            items = recipes,
            key = { data -> data.id }
        ) { recipe ->
            RecipeItem(recipe = recipe)
        }
    }
}

@Composable
fun RecipeItem(
    modifier: Modifier = Modifier,
    recipe: Recipe
) {
    Box(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .width(205.dp)
            .height(250.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(Color.White)
    ) {
        AsyncImage(
            modifier = modifier.fillMaxWidth(),
            model = recipe.imageUrl,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = modifier
                .padding(12.dp)
                .width(186.dp)
                .height(69.dp)
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(8.dp))
        ) {
            Image(
                modifier = modifier.fillMaxWidth(),
                painter = painterResource(id = R.drawable.item_blur_image),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = modifier
                    .padding(horizontal = 17.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = recipe.title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Row(
                    modifier = modifier
                        .padding(top = 8.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = modifier.size(12.dp),
                        painter = painterResource(id = R.drawable.star_icon),
                        contentDescription = null,
                        tint = Color.Yellow
                    )
                    Spacer(modifier = modifier.width(4.dp))
                    Text(
                        text = recipe.rating.toString(),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Light,
                        color = Color.White
                    )
                    Spacer(modifier = modifier.weight(1f))
                    AsyncImage(
                        modifier = modifier
                            .size(17.dp)
                            .clip(CircleShape),
                        model = recipe.cook.avatarUrl,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                    )
                }
            }
        }
    }
}