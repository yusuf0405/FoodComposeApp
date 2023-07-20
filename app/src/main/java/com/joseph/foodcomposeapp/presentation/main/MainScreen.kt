package com.joseph.foodcomposeapp.presentation.main

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.joseph.foodapp.data.fake_data.FakeData
import com.joseph.foodapp.domain.models.RecommendationsEvent
import com.joseph.foodcomposeapp.R
import com.joseph.foodcomposeapp.presentation.components.FoodCategoryList
import com.joseph.foodcomposeapp.presentation.components.RecipeList
import com.joseph.foodcomposeapp.presentation.components.RecommendationEventItem
import com.joseph.foodcomposeapp.presentation.components.RecommendationEventList
import com.joseph.foodcomposeapp.presentation.theme.FoodComposeAppTheme

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.padding(horizontal = 16.dp)
    ) {
        item(key = "main_header") {
            MainHeader()
        }

        item(key = "recommendation_event_list_header") {
            ListHeaderText(textId = R.string.just_for_you)
        }

        item(key = "recommendation_event_list") {
            RecommendationEventList()
        }

        item(key = "recipe_list_header") {
            ListHeaderText(textId = R.string.recipes)
        }

        item(key = "recipe_list") {
            RecipeList(recipes = FakeData.fakeRecipes())
        }
        item(key = "category_header") {
            ListHeaderText(textId = R.string.food_category)
        }

        item(key = "food_category_list") {
            FoodCategoryList(categories = FakeData.fakeFoodCategory())
        }
    }

}

@Composable
fun MainHeader(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .statusBarsPadding()
            .systemBarsPadding()
            .padding(horizontal = 20.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(
            text = stringResource(id = R.string.greeting_text),
            fontSize = 28.sp,
            color = colorResource(id = R.color.green),
            fontWeight = FontWeight.Bold
        )

        AsyncImage(
            model = "https://avatars.mds.yandex.net/i?id=f67373e87c6c3b88e11535449334c386c50ec8d2-9264009-images-thumbs&n=13",
            contentDescription = null,
            modifier = modifier
                .size(54.dp)
                .clip(RoundedCornerShape(15.dp))
        )
    }
}

@Composable
fun ListHeaderText(
    modifier: Modifier = Modifier,
    @StringRes textId: Int
) {
    Text(
        text = stringResource(id = textId),
        modifier = modifier,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold
    )
}