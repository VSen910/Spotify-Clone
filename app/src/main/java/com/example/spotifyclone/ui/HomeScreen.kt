package com.example.spotifyclone.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.spotifyclone.R
import com.example.spotifyclone.data.Album
import com.example.spotifyclone.data.AlbumList.AlbumlistItems.albums
import com.example.spotifyclone.data.Artist
import com.example.spotifyclone.data.IndiasBestItems.IndiasBestItems.indiasBest
import com.example.spotifyclone.data.MadeForYouItems.MadeForYouItems.madeForYou
import com.example.spotifyclone.data.Playlist
import com.example.spotifyclone.data.Podcast
import com.example.spotifyclone.data.PodcastList.PodcastlistItems.podcasts
import com.example.spotifyclone.data.RecentPlaylistItems.RecentPlaylistItems.playlists
import com.example.spotifyclone.data.RecentlyPlayedItems.RecentlyPlayedItems.recentlyPlayed
import com.example.spotifyclone.data.SuggestedArtistsItems.SuggestedArtistsItems.suggestedArtists
import com.example.spotifyclone.navigation.Screens
import com.example.spotifyclone.ui.theme.SpotifyCloneTheme


@Composable
fun Home(
    navController: NavController
){
    Scaffold(
        topBar = {
            HomeScreenTopAppBar()
        },
        bottomBar = {
            HomeScreenBottomAppBar(navController)
        }
    ) {
        HomeScreen(navController)
    }
}

@Composable
fun HomeScreenBottomAppBar(
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
                            0.01f to Color.Black.copy(alpha = 0.8F),
                            1F to Color.Black
                        )
                    )
                    drawContent()
                }
            }
    ) {
        HomeBottomAppBarIcons(
            tabText = R.string.home,
            color = Color.White,
            imageVector = Icons.Filled.Home,
            onClick = {
                navController.navigate(route = Screens.Home.route)
            }
        )
        HomeBottomAppBarIcons(
            tabText = R.string.search,
            color = Color.Gray,
            imageVector = Icons.Outlined.Search,
            onClick = {
                navController.navigate(route = Screens.Search.route)
            }
        )
        HomeBottomAppBarIcons(
            tabText = R.string.your_library,
            color = Color.Gray,
            imageVector = Icons.Outlined.LibraryBooks,
            onClick = {
                navController.navigate(route = Screens.Library.route)
            }
        )
        HomeBottomAppBarIcons(
            tabText = R.string.premium,
            color = Color.Gray,
            imageVector = Icons.Outlined.CompassCalibration,
            onClick = {
                navController.navigate(route = Screens.Premium.route)
            }
        )
    }
}

@Composable
fun HomeBottomAppBarIcons(
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
            fontSize = 12.sp
        )
    }
}

@Composable
fun HomeScreenTopAppBar(
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
            Text(
                text = stringResource(R.string.good_evening),
                style = MaterialTheme.typography.h2,
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                imageVector = Icons.Outlined.Notifications,
                contentDescription = stringResource(R.string.notifications),
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .size(30.dp)
            )
            Icon(
                imageVector = Icons.Outlined.History,
                contentDescription = stringResource(R.string.notifications),
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .size(30.dp)
            )
            Icon(
                imageVector = Icons.Outlined.Settings,
                contentDescription = stringResource(R.string.notifications),
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .size(30.dp)
            )
        }
        HomeScreenChips()
    }
}

@Composable
fun HomeScreenChips(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.width(18.dp))
        Chip(option = R.string.music)

        Spacer(modifier = Modifier.width(18.dp))
        Chip(option = R.string.podcast_and_shows)
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
fun RecentPlaylistMiniCardGrid(
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        for(i in 0..2) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                RecentPlaylistMiniCard(playlistName = playlists[2*i],navController)
                RecentPlaylistMiniCard(playlistName = playlists[2*i+1],navController)
            }
        }
    }
}

@Composable
fun RecentPlaylistMiniCard(
    playlistName: Playlist,
    navController: NavController
) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp

    Card(
        modifier = Modifier
            .width(((screenWidth / 2) - 16).dp)
            .height(55.dp)
            .padding(0.dp)
            .clickable {
                navController.navigate(Screens.LikedSongs.route)
            }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = playlistName.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(55.dp)
            )
            Text(
                text = playlistName.title,
                style = MaterialTheme.typography.body1,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .padding(8.dp)
            )
        }
    }
}


@Composable
fun PlaylistList(
    @StringRes title: Int,
    itemData: List<Playlist>,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(id = title),
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .padding(18.dp)
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .padding(horizontal = 12.dp)
        ) {
            items(itemData) {
                PlaylistCard(itemData = it)
            }
        }
    }
}

@Composable
fun PlaylistCard(
    itemData: Playlist,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
            .width(150.dp)
    ) {
//        Card {
//            Box(
//                modifier = Modifier
//                    .size(150.dp)
//                    .background(Color.White)
//            ) {
//
//            }
//        }
        Image(
            painter = painterResource(id = itemData.image),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
        )
        Text(
            text = itemData.title,
            style = MaterialTheme.typography.body2,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        
    }
}

@Composable
fun AlbumList(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    itemDataList: List<Album> = albums
) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(id = title),
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .padding(18.dp)
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .padding(horizontal = 12.dp)
        ) {
            items(albums) {
                AlbumCard(it)
            }
        }
    }
}

@Composable
fun AlbumCard(
    itemData: Album,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
            .width(150.dp)
    ) {
        Card(
            modifier = Modifier.size(150.dp)
        ) {
           Image(
               painter = painterResource(id = itemData.image) ,
               contentDescription =null )
        }
        Text(
            text = itemData.title,
            style = MaterialTheme.typography.body1,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = itemData.artists,
            style = MaterialTheme.typography.body2,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun RecentlyPlayedList(
    itemDataList: List<Playlist> = recentlyPlayed,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = stringResource(R.string.recently_played),
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .padding(18.dp)
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = modifier
                .padding(12.dp)
        ) {
            items(recentlyPlayed) {
                RecentlyPlayedCard(itemData = it)
            }
        }
    }
}

@Composable
fun RecentlyPlayedCard(
    itemData: Playlist,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier
            .width(120.dp)
    ) {

        Image(
            painter = painterResource(id = itemData.image),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
        )
        Text(
            text = itemData.title,
            style = MaterialTheme.typography.body1,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun SpotifyOriginalList(
    itemDataList: List<Podcast> = podcasts,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = stringResource(id = R.string.spotify_original_and_exclusive_shows),
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .padding(18.dp)
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .padding(12.dp)
        ) {
            items(podcasts) {
                SpotifyOriginalCard(it)
            }
        }
    }
}

@Composable
fun SpotifyOriginalCard(
    itemData: Podcast,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Card(
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .size(150.dp)
        ) {
           Image(
               painter = painterResource(id = itemData.image),
               contentDescription =null
           )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = itemData.genre,
            style = MaterialTheme.typography.body2,
            color = MaterialTheme.colors.primary,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .padding(start = 4.dp, bottom = 4.dp)
        )
        Text(
            text = itemData.title,
            style = MaterialTheme.typography.body1,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .padding(start = 4.dp, bottom = 4.dp)
        )
        Text(
            text = itemData.creator,
            style = MaterialTheme.typography.body2,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .padding(start = 4.dp)
        )
    }
}

@Composable
fun ArtistList(
    itemDataList: List<Artist>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = stringResource(id = R.string.suggested_artists),
            style = MaterialTheme.typography.h2,
            modifier = Modifier
                .padding(18.dp)
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .padding(12.dp)
        ) {
            items(itemDataList) {
                ArtistCard(it)
            }
        }
    }
}

@Composable
fun ArtistCard(
    itemData: Artist,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Card(
            shape = CircleShape,
            backgroundColor = Color.White,
            modifier = Modifier
                .size(170.dp)
        ) {
            Image(
                painter = painterResource(id = itemData.image),
                contentDescription = null
            )
        }
        Text(
            text = itemData.name,
            style = MaterialTheme.typography.body1,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun HomeScreen(
    navController: NavController
) {
    LazyColumn(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize()
    ) {
        item {
            Spacer(modifier = Modifier.height(10.dp))
            RecentPlaylistMiniCardGrid(navController)
        }

        item {
            Spacer(modifier = Modifier.height(20.dp))
            PlaylistList(
                title = R.string.made_for_you,
                itemData = madeForYou
            )
        }

        item {
            Spacer(modifier = Modifier.height(10.dp))
            RecentlyPlayedList()
        }

        item {
            Spacer(modifier = Modifier.height(10.dp))
            SpotifyOriginalList()
        }

        item {
            Spacer(modifier = Modifier.height(10.dp))
            AlbumList(title = R.string.recomended_for_today)
        }

        item {
            Spacer(modifier = Modifier.height(10.dp))
            PlaylistList(
                title = R.string.indias_best,
                itemData = indiasBest
            )
        }

        item {
            Spacer(modifier = Modifier.height(10.dp))
            ArtistList(itemDataList = suggestedArtists)
        }
        item {
            Spacer(modifier = Modifier.height(80.dp))

        }
    }
}

