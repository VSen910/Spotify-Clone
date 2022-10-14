package com.example.spotifyclone.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyclone.LibBottomAppBar
import com.example.spotifyclone.LibraryScreen
import androidx.navigation.NavController
import com.example.spotifyclone.R
import com.example.spotifyclone.navigation.Screens
import com.example.spotifyclone.ui.HomeScreen
import com.example.spotifyclone.ui.HomeScreenTopAppBar
import com.example.spotifyclone.ui.theme.SpotifyCloneTheme

@Composable
fun SongListPage(
    navController: NavController,
    modifier: Modifier = Modifier
) { Scaffold(

    bottomBar = {
     HomeScreenBottomAppBar(navController)
    }
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize()
    ) {
        item {
            TopInformation()
        }

        items(count = 10) {
            SongListItem()
        }
    }
}

}

@Composable
fun TopInformation(
    modifier: Modifier = Modifier
) {
    val gradient = Brush.verticalGradient(
        0f to Color.Blue,
        1000f to MaterialTheme.colors.background
    )
    Column(
        modifier = modifier
            .background(gradient)
            .height(200.dp)
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Icon(
            imageVector = Icons.Outlined.ArrowBack,
            contentDescription = stringResource(R.string.go_back),
            tint = MaterialTheme.colors.onSurface
        )
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Liked Songs",
            style = MaterialTheme.typography.h2,
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier
                .padding(vertical = 4.dp)
        )
        Text(
            text = "10 songs",
            style = MaterialTheme.typography.body2
        )
        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier
                .padding(horizontal = 12.dp)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(MaterialTheme.colors.primary),
                contentPadding = PaddingValues(0.dp),
                modifier = Modifier
                    .size(40.dp)
            ) {
                Icon(imageVector = Icons.Filled.PlayArrow, contentDescription = null)
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
    }
}

@Composable
fun SongListItem(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .padding(horizontal = 12.dp)
    ) {
        Box(
            modifier = Modifier
                .size(60.dp)
                .background(Color.White)
        )
        SongListItemText()
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            imageVector = Icons.Filled.Favorite,
            contentDescription = null,
            tint = MaterialTheme.colors.primary,
            modifier = Modifier
                .padding(horizontal = 12.dp)
        )
        Icon(
            imageVector = Icons.Filled.MoreVert,
            contentDescription = null,
            tint = MaterialTheme.colors.secondary
        )
    }
}

@Composable
fun SongListItemText(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(8.dp)
    ) {
        Text(
            text = "Lorem Ipsum",
            style = MaterialTheme.typography.h3,
            color = MaterialTheme.colors.onSurface
        )
        Spacer(modifier = Modifier.height(4.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "LYRICS",
                style = MaterialTheme.typography.body2,
                fontSize = 12.sp,
                color = Color.Black,
                modifier = Modifier
                    .background(MaterialTheme.colors.secondary)
                    .padding(horizontal = 4.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "Lorem Ipsum",
                style = MaterialTheme.typography.body2
            )
        }
    }
}

