package com.joseph.foodcomposeapp.presentation.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joseph.foodcomposeapp.R

@Composable
fun OnboardingScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.onboarding_background_image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        ) {
            Text(
                modifier = modifier.padding(horizontal = 60.dp),
                text = stringResource(id = R.string.cook_like_a_chef),
                color = Color.White,
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                modifier = modifier
                    .padding(top = 17.dp)
                    .padding(horizontal = 68.dp),
                text = stringResource(id = R.string.onboarding_screen_description),
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                color = Color.White
            )

            Button(
                modifier = modifier
                    .padding(horizontal = 40.dp)
                    .padding(top = 69.dp)
                    .padding(bottom = 66.dp)
                    .fillMaxWidth()
                    .height(60.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.green)
                )
            ) {
                Text(
                    text = stringResource(id = R.string.get_started),
                    fontSize = 20.sp
                )
            }

        }

    }
}