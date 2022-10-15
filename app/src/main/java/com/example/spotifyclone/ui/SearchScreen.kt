package com.example.spotifyclone.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LibraryBooks
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.CompassCalibration
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.LibraryBooks
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.spotifyclone.R
import com.example.spotifyclone.data.SearchCards
import com.example.spotifyclone.data.SearchGenres.SearchGenres.genres
import com.example.spotifyclone.navigation.Screens
import com.example.spotifyclone.ui.theme.SpotifyCloneTheme

@Composable
fun Search(
    navController: NavController
) {
    Scaffold(
        topBar = {
            SearchScreenTopAppBar()
        },
        bottomBar = {
            SearchBottomAppBar(navController)
        }
    ) {
        SearchScreen()
    }
}

@Composable
fun SearchBottomAppBar(
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
        SearchBottomAppBarIcons(
            tabText = R.string.home,
            imageVector = Icons.Outlined.Home,
            color = Color.Gray,
            onClick = {
                navController.navigate(route = Screens.Home.route)
            }
        )
        SearchBottomAppBarIcons(
            tabText = R.string.search,
            imageVector = Icons.Filled.Search,
            color = Color.White,
            onClick = {
                navController.navigate(route = Screens.Search.route)
            }
        )
        SearchBottomAppBarIcons(
            tabText = R.string.your_library,
            imageVector = Icons.Outlined.LibraryBooks,
            color = Color.Gray,
            onClick = {
                navController.navigate(route = Screens.Library.route)
            }
        )
        SearchBottomAppBarIcons(
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
fun SearchBottomAppBarIcons(
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

@Composable
fun SearchScreenTopAppBar(
    modifier: Modifier = Modifier
) {
    var value by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier
            .padding(top = 35.dp)
    ) {
        Text(
            text = stringResource(id = R.string.search),
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .padding(start = 18.dp)
        )
        Spacer(modifier = Modifier.height(40.dp))
        TextField(
            value = value,
            onValueChange = { value = it },
            modifier = Modifier
                .padding(horizontal = 18.dp)
                .fillMaxWidth()
                .height(50.dp),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = MaterialTheme.colors.primaryVariant
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = null,
                    tint = Color.Black
                )
            },
            placeholder = {
                Text(
                    text = stringResource(R.string.search_text),
                    style = MaterialTheme.typography.body2,
                    fontSize = 16.sp
                )
            }
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SearchScreen(
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ) {
        Text(
            text = stringResource(R.string.browse_all),
            style = MaterialTheme.typography.h3,
            color = MaterialTheme.colors.primaryVariant,
            modifier = Modifier
                .padding(top = 30.dp, bottom = 10.dp)
        )
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            content = {
                items(genres) { genre ->
                    GenreCard(genre = genre)
                }

                items(count = 2) {
                    Spacer(modifier = Modifier.height(80.dp))
                }
            },
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(25.dp),
            modifier = Modifier
                .padding(horizontal = 30.dp)
        )
    }
}

@Composable
fun GenreCard(
    genre: SearchCards,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .height(85.dp)
            .width(20.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = genre.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .wrapContentHeight()
            )
            Text(
                text = genre.genre,
                style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .padding(start = 12.dp, top = 18.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SearchScreenPreview() {
    SpotifyCloneTheme {
        SearchScreen()
    }
}