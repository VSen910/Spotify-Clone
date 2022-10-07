package com.example.spotifyclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LibraryBooks
import androidx.compose.material.icons.outlined.CompassCalibration
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.LibraryBooks
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyclone.ui.HomeScreen
import com.example.spotifyclone.ui.HomeScreenTopAppBar
import com.example.spotifyclone.ui.theme.Lib
import com.example.spotifyclone.ui.theme.SpotifyCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpotifyCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Lib()
                }
            }
        }
    }
}

@Composable
fun Home(){
    Scaffold(
        topBar = {
            HomeScreenTopAppBar()
        },
        bottomBar = {
            BottomAppBar()
        }
    ) {
        HomeScreen()
    }
}

@Composable
fun BottomAppBar(
    modifier: Modifier = Modifier
) {
//    Card(
//        modifier = modifier
//            .background(Color(0x00FFFFFF))
//            .fillMaxWidth()
//    ) {
//    }
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .drawWithCache {
                onDrawWithContent {

                    drawRect(
                        Brush.verticalGradient(
                            0.01f to Color.Black.copy(0.9f),
                            1F to Color.Black
                        )
                    )
                    drawContent()
                }
            }
    ) {
        com.example.spotifyclone.ui.theme.BottomAppBarIcons(
            tabText = R.string.home,
            imageVector = Icons.Outlined.Home,
            color = Color.Gray
        )
        com.example.spotifyclone.ui.theme.BottomAppBarIcons(
            tabText = R.string.search,
            imageVector = Icons.Outlined.Search,
            color = Color.Gray

        )
        com.example.spotifyclone.ui.theme.BottomAppBarIcons(
            tabText = R.string.your_library,
            imageVector = Icons.Filled.LibraryBooks,
            color = Color.White

        )
        com.example.spotifyclone.ui.theme.BottomAppBarIcons(
            tabText = R.string.premium,
            imageVector = Icons.Outlined.CompassCalibration,
            color = Color.Gray

        )
    }
}

@Composable
fun BottomAppBarIcons(
    @StringRes tabText: Int,
    imageVector: ImageVector,
    color: Color,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(8.dp)
    ) {
        Icon(
            imageVector = imageVector,
            contentDescription = null,
            modifier = Modifier
                .size(25.dp)
                .padding(0.dp),
            tint = color
        )
        Text(
            text = stringResource(id = tabText),
            style = MaterialTheme.typography.body1,
            color = color,
            fontSize = 12.sp
        )
    }
}
