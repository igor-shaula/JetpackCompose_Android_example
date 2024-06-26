package com.igor_shaula.complex_api_client_sample.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val shapes = Shapes(
    extraSmall = RoundedCornerShape(SMALL_RADIUS), // 4.dp
    small = RoundedCornerShape(DEFAULT_RADIUS), // 8.dp
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(24.dp),
    extraLarge = RoundedCornerShape(32.dp)
)
