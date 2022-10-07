package com.example.spotifyclone.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyclone.R
import com.example.spotifyclone.data.SearchCards
import com.example.spotifyclone.data.SearchGenres.SearchGenres.genres
import com.example.spotifyclone.ui.theme.SpotifyCloneTheme

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
        Scaffold(
            topBar = {
                SearchScreenTopAppBar()
            }
        ) {
            SearchScreen()
        }
    }
}