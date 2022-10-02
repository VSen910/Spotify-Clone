package com.example.spotifyclone.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.spotifyclone.R

val FigTree = FontFamily(
    Font(R.font.figtree_bold, FontWeight.Bold),
    Font(R.font.figtree_extra_bold, FontWeight.ExtraBold),
    Font(R.font.figtree_regular, FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = FigTree,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 30.sp
    ),
    h2 = TextStyle(
        fontFamily = FigTree,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp
    ),
    h3 = TextStyle(
        fontFamily = FigTree,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontFamily = FigTree,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = FigTree,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = Color.Gray
    ),

)