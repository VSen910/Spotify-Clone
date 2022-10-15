package com.example.spotifyclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.spotifyclone.R
import com.example.spotifyclone.navigation.Screens
import com.example.spotifyclone.ui.HomeScreen
import com.example.spotifyclone.ui.HomeScreenTopAppBar
import com.example.spotifyclone.ui.theme.SpotifyCloneTheme


@Composable
fun Lib(
    navController: NavController
){
    Scaffold(
        topBar = {
            LibraryScreenTopAppBar()
        },
        bottomBar = {
            LibBottomAppBar(navController)
        }
    ) {
        LibraryScreen()
    }
}

@Composable
fun LibraryScreen(){
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row() {
                Icon(imageVector = Icons.Filled.CompareArrows, contentDescription = null,Modifier.size(25.dp))
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Most Recent",
                     fontSize = 20.sp)
            }
            Icon(imageVector = Icons.Outlined.AllInbox, contentDescription = null, Modifier.size(25.dp))

        }
        List(text = "Like songs", image = R.drawable.likedsongs)
        List(text = "Sad Beats", R.drawable.sadbeats)
        List(text = "Relaxing & Chill House..", R.drawable.relaxhits)
        List(text = "On Repeat", R.drawable.onrepeat)
        List(text = "Horror Story 12 am", R.drawable.haunted)
        List(text = "EDM Sampling", R.drawable.edmsampling)
        List(text = "Bollywood Butter", R.drawable.bollywoodbutter)
        Spacer(modifier = Modifier.height(70.dp))
    }
}

@Composable
fun List(
    text : String,
    @DrawableRes image: Int
){

    Row(
        modifier = Modifier.padding(start = 5.dp,)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp),
            backgroundColor = MaterialTheme.colors.background,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
//                Box(
//                    modifier = Modifier
//                        .background(Color.White)
//                        .height(height = 80.dp)
//                        .width(width = 80.dp)
//                        .aspectRatio(1f)
//                )
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    modifier = Modifier
                        .height(height = 80.dp)
                        .width(width = 80.dp)
                        .aspectRatio(1f)
                )
                Column() {

                    Text(
                        text = text,
                        style = MaterialTheme.typography.h2,
                        fontSize = 20.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .padding(8.dp)
                    )
                    Text(
                        text = "\uD83D\uDCCC Playlist • ",
                        style = MaterialTheme.typography.body1,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .padding(8.dp)
                    )


                }

            }
        }
    }
}

@Composable
fun LibraryScreenTopAppBar(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(bottom = 12.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(start = 18.dp, end = 18.dp, top = 35.dp, bottom = 20.dp)
                .background(MaterialTheme.colors.background)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(30.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape)
            )
            Text(
                text = " Your Library",
                style = MaterialTheme.typography.h2,
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                imageVector = Icons.Outlined.Search,
                contentDescription = stringResource(R.string.notifications),
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .size(30.dp)
            )
            Icon(
                imageVector = Icons.Outlined.Add,
                contentDescription = stringResource(R.string.notifications),
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .size(30.dp)
            )

        }
        LibraryScreenChips()
    }
}

@Composable
fun LibraryScreenChips(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.width(18.dp))
        Chip(option = R.string.byyou)

        Spacer(modifier = Modifier.width(18.dp))
        Chip(option = R.string.byspot)
    }
}

@Composable
fun Chip(
    modifier: Modifier = Modifier,
    @StringRes option: Int
) {
    Card(
        shape = RoundedCornerShape(percent = 50),
        modifier = modifier
    ) {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = option),
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .padding(
                        vertical = 8.dp,
                        horizontal = 16.dp
                    )
            )
        }
    }
}


@Composable
fun LibBottomAppBar(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .drawWithCache {
                onDrawWithContent {

                    drawRect(
                        Brush.verticalGradient(
                            0.01f to Color.Black.copy(0.8f),
                            1F to Color.Black
                        )
                    )
                    drawContent()
                }
            }
    ) {
        BottomAppBarIcons(
            tabText = R.string.home,
            imageVector = Icons.Outlined.Home,
            color = Color.Gray,
            onClick = {
                navController.navigate(route = Screens.Home.route)
            }
        )
        BottomAppBarIcons(
            tabText = R.string.search,
            imageVector = Icons.Outlined.Search,
            color = Color.Gray,
            onClick = {
                navController.navigate(route = Screens.Search.route)
            }
        )
        BottomAppBarIcons(
            tabText = R.string.your_library,
            imageVector = Icons.Filled.LibraryBooks,
            color = Color.White,
            onClick = {
                navController.navigate(route = Screens.Library.route)
            }
        )
        BottomAppBarIcons(
            tabText = R.string.premium,
            imageVector = Icons.Outlined.CompassCalibration,
            color = Color.Gray,
            onClick = {
                navController.navigate(route = Screens.Premium.route)
            }
        )
    }
}

@Composable
fun BottomAppBarIcons(
    @StringRes tabText: Int,
    imageVector: ImageVector,
    color: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(8.dp)
    ) {
        IconButton(
            onClick = onClick,
            modifier = Modifier
                .size(50.dp)
        ) {
            Icon(
                imageVector = imageVector,
                contentDescription = null,
                tint = color,
                modifier = Modifier
                    .size(25.dp)
                    .padding(0.dp)
            )
        }
        Text(
            text = stringResource(id = tabText),
            style = MaterialTheme.typography.body1,
            color = color,
            fontSize = 12.sp
        )
    }
}