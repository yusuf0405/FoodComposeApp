package com.joseph.foodcomposeapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.joseph.foodapp.data.fake_data.FakeData
import com.joseph.foodapp.domain.models.RecommendationsEvent
import com.joseph.foodcomposeapp.presentation.theme.FoodComposeAppTheme

@Preview
@Composable
fun RecommendationEventItemPreview() {
    FoodComposeAppTheme {
        RecommendationEventItem(
            recommendationEvent = FakeData
                .fakeRecommendationsEvents()
                .random()
        )
    }
}

@Composable
fun RecommendationEventList(
    modifier: Modifier = Modifier
) {
    LazyRow {
        items(
            items = FakeData.fakeRecommendationsEvents(),
            key = { data -> data.id }
        ) { event ->
            RecommendationEventItem(recommendationEvent = event)
        }
    }
}

@Composable
fun RecommendationEventItem(
    modifier: Modifier = Modifier,
    recommendationEvent: RecommendationsEvent
) {
    Box(
        modifier = modifier
            .height(153.dp)
            .background(Color.White)
            .clip(RoundedCornerShape(15.dp))
    ) {
        AsyncImage(
            model = recommendationEvent.imageUrl,
            contentDescription = null,
            modifier = modifier.width(300.dp),
            contentScale = ContentScale.Crop
        )

        Text(
            text = recommendationEvent.title,
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(start = 16.dp, bottom = 16.dp)
                .align(Alignment.BottomStart)
        )
    }
}