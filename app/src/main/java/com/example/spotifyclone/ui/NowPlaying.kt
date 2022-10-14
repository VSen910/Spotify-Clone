package com.example.spotifyclone.ui

import com.example.spotifyclone.PremiumPage


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
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
fun Now(
    navController: NavController,
){
    Scaffold(

    ) {
       NowPlaying(navController)
    }
}




@Composable
fun NowPlaying(

    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier
            .width(150.dp)
            .padding(all = 10.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth()
        ) {
           IconButton(onClick = {
               navController.popBackStack() },
           Modifier.size(20.dp)) {
               Icon(imageVector = Icons.Filled.KeyboardArrowDown, contentDescription = null,
               Modifier.size(30.dp))
           }
            Text(text = "Liked Songs",
                 style = MaterialTheme.typography.h2,
            )
            Icon(imageVector = Icons.Filled.MoreVert, contentDescription =null )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Card(
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        ) {
            Box(
                modifier = Modifier
                    .size(300.dp)
                    .background(Color.White)


            ) {

            }

        }
       Row(
           horizontalArrangement = Arrangement.SpaceBetween,
           modifier = Modifier.fillMaxWidth()
       ) {
           Text(
               text = stringResource(R.string.indias_best),
               style = MaterialTheme.typography.h1,
               modifier = Modifier
                   .padding(start = 18.dp, top = 18.dp),
               textAlign = TextAlign.Justify
           )
           Icon(
               imageVector = Icons.Filled.Favorite,
               contentDescription = null,
               tint = MaterialTheme.colors.primary,
               modifier = Modifier
                   .padding(top = 25.dp, end = 20.dp)
                   .size(30.dp)
           )
       }
        Row(
            verticalAlignment = Alignment.Top,
            modifier = Modifier
            
        ) {
            Spacer(modifier = Modifier.width(10.dp))
            Icon(imageVector = Icons.Filled.Book, contentDescription = null,)
            Text(
                text = stringResource(R.string.indias_best),
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .padding(start = 8.dp),
                textAlign = TextAlign.Justify
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Box() {
            Icon(imageVector = Icons.Filled.Circle, contentDescription =null )
            Divider(color = Color.White, modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 20.dp, end = 15.dp))

        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "0:00",
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .padding(start = 0.dp),
                color = Color.White.copy(0.6f)

            )
            Text(
                text = "2:34",
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .padding(end = 8.dp),
                color = Color.White.copy(0.6f)
            )
        }
        Spacer(modifier = Modifier.height(2.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Filled.Shuffle,
                 contentDescription =null,
                 Modifier.size(30.dp)
                )
            Icon(imageVector = Icons.Filled.SkipPrevious,
                 contentDescription = null,
                 Modifier.size(50.dp)
            )
            Icon(imageVector = Icons.Filled.PauseCircle,
                 contentDescription =null,
                 Modifier.size(80.dp)
            )
            Icon(imageVector = Icons.Filled.SkipNext,
                 contentDescription =null,
                 Modifier.size(50.dp)
            )
            Icon(imageVector = Icons.Filled.Repeat,
                 contentDescription =null,
                 Modifier.size(30.dp)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Icon(imageVector = Icons.Filled.DesktopMac,
                 contentDescription =null,
                 Modifier
                     .size(35.dp)
                     .padding(start = 10.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Icon(imageVector = Icons.Filled.Share,
                     contentDescription =null,
                     Modifier
                         .size(35.dp)
                         .padding(end = 10.dp)
                )
                Icon(imageVector = Icons.Filled.List,
                     contentDescription =null,
                     Modifier
                         .size(35.dp)
                         .padding(end = 5.dp)
                )
            }

        }

    }
}