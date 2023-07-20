package com.joseph.foodcomposeapp.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.joseph.foodapp.domain.models.FoodCategory

@Composable
fun FoodCategoryList(
    modifier: Modifier = Modifier,
    categories: List<FoodCategory>
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(
            items = categories,
            key = { data -> data.id }
        ) { category ->
            FoodCategoryItem(category = category)
        }
    }
}

@Composable
fun FoodCategoryItem(
    modifier: Modifier = Modifier,
    category: FoodCategory
) {
    Column(
        modifier = modifier,
    ) {
        AsyncImage(
            modifier = modifier
                .size(58.dp)
                .clip(CircleShape),
            model = category.imageUrl,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = modifier.height(9.dp))
        Text(
            modifier = modifier.width(61.dp),
            text = category.title,
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center
        )

    }

}