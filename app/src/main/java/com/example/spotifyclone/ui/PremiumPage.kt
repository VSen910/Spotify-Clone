package com.example.spotifyclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
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
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyclone.ui.HomeScreen
import com.example.spotifyclone.ui.HomeScreenTopAppBar
import com.example.spotifyclone.ui.theme.SpotifyCloneTheme


@Composable
fun PremiumPage() {
    Column(
        Modifier
            .background(MaterialTheme.colors.background)
            .verticalScroll(state = ScrollState(1))
            .padding(start = 10.dp, end = 10.dp)
    ) {
        Row() {
            Icon(
                imageVector = Icons.Outlined.CompassCalibration,
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Premium")
        }
        Spacer(modifier = Modifier.height(200.dp))
        Text(
            text = "FREE TRIAL",
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.primaryVariant
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Try Premium free for 1 month",
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.primaryVariant
        )
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(corner = CornerSize(20.dp)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, top = 10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
        ) {
            Text(
                text = "GET PREMIUM",
                style = MaterialTheme.typography.h3,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Card(
            modifier = Modifier.padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(corner = CornerSize(7.dp))
        ) {
            Column(modifier = Modifier.padding(start = 10.dp)) {
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Why join Premium?",
                    style = MaterialTheme.typography.body1
                )
                Spacer(modifier = Modifier.height(20.dp))
                Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Download to listen offline without wifi",
                    style = MaterialTheme.typography.body1
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Music without ad interruptions",
                    style = MaterialTheme.typography.body1
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "2x higher sound quality than our free plan",
                    style = MaterialTheme.typography.body1
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Play songs in any order, with unlimited skips",
                    style = MaterialTheme.typography.body1
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Cancel monthly plans online anytime",
                    style = MaterialTheme.typography.body1
                )
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Card(
            modifier = Modifier.padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(corner = CornerSize(7.dp))
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 25.dp, bottom = 25.dp)
            ) {
                Text(
                    text = "Spotify Free",
                    style = MaterialTheme.typography.h3,
                    modifier = Modifier.padding(
                        start = 35.dp
                    ),
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "CURRENT PLAN", modifier = Modifier.padding(
                        end = 35.dp
                    ),
                    style = MaterialTheme.typography.body2
                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Pick your Premium",
            style = MaterialTheme.typography.h3,
            fontSize = 20.sp,
            color = MaterialTheme.colors.primaryVariant,
            modifier = Modifier
                .padding(start = 10.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        PremiumPlans()
    }
}

@Composable
fun PremiumPlans() {
    Column() {
        Card(
            backgroundColor = Color(red = 51, green = 153, blue = 255),
            shape = RoundedCornerShape(10.dp)
        ) {
            Column() {
                Spacer(modifier = Modifier.height(35.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Mini",
                        style = MaterialTheme.typography.h3,
                        color =  MaterialTheme.colors.onSurface,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(start = 35.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Column(
                        modifier = Modifier
                            .width(IntrinsicSize.Max)
                            .padding(end = 20.dp)
                    ) {
                        Text(
                            text = "From 7",
                            style = MaterialTheme.typography.h3,
                            color =  MaterialTheme.colors.onSurface,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Right,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        Text(
                            text = "FOR 1 DAY",
                            style = MaterialTheme.typography.body1,
                            color =  MaterialTheme.colors.onSurface,
                            fontSize = 12.sp,
                            textAlign = TextAlign.Right,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                }
                Spacer(modifier = Modifier.height(35.dp))
                Text(
                    text = "1 day and 1 week plans * Ad-free music on mobile * Download 30 songs on 1 mobile device * Mobile only plan",
                    style = MaterialTheme.typography.body1,
                    color =  MaterialTheme.colors.onSurface,
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(start = 32.dp, end = 32.dp),
                )
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    shape = RoundedCornerShape(corner = CornerSize(20.dp))
                ) {
                    Text(
                        text = "VIEW PLANS",
                        style = MaterialTheme.typography.h3,
                        fontSize = 14.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 10.dp, end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Prices vary according to duration of plan.",
                    style = MaterialTheme.typography.body2,
                    color =  MaterialTheme.colors.onSurface,
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            backgroundColor = Color(red = 0, green = 204, blue = 102),
            shape = RoundedCornerShape(10.dp)
        ) {
            Column() {
                Spacer(modifier = Modifier.height(35.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Premium Individual",
                        style = MaterialTheme.typography.h3,
                        color =  MaterialTheme.colors.onSurface,
                        modifier = Modifier.padding(start = 35.dp),
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Column(
                        modifier = Modifier
                            .width(IntrinsicSize.Max)
                            .padding(end = 20.dp)
                    ) {
                        Text(
                            text = "Free",
                            style = MaterialTheme.typography.h3,
                            color =  MaterialTheme.colors.onSurface,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Right,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        Text(
                            text = "FOR 1 MONTH",
                            style = MaterialTheme.typography.body1,
                            color =  MaterialTheme.colors.onSurface,
                            fontSize = 12.sp,
                            textAlign = TextAlign.Right,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                }
                Spacer(modifier = Modifier.height(35.dp))
                Text(
                    text = "Ad-free music listening * Download to listen offline * Debit and credit cards accepted",
                    style = MaterialTheme.typography.body1,
                    color =  MaterialTheme.colors.onSurface,
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(start = 32.dp, end = 32.dp),
                )
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    shape = RoundedCornerShape(corner = CornerSize(20.dp))
                ) {
                    Text(
                        text = "VIEW PLANS",
                        style = MaterialTheme.typography.h3,
                        fontSize = 14.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 10.dp, end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Offer only for users who are new to Premium.",
                    style = MaterialTheme.typography.body2,
                    color =  MaterialTheme.colors.onSurface,
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            backgroundColor = Color(red = 153, green = 153, blue = 255),
            shape = RoundedCornerShape(10.dp)
        ) {
            Column() {
                Spacer(modifier = Modifier.height(35.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Premium Duo",
                        style = MaterialTheme.typography.h3,
                        color =  MaterialTheme.colors.onSurface,
                        modifier = Modifier.padding(start = 35.dp),
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Column(
                        modifier = Modifier
                            .width(IntrinsicSize.Max)
                            .padding(end = 20.dp)
                    ) {
                        Text(
                            text = "Free",
                            style = MaterialTheme.typography.h3,
                            color =  MaterialTheme.colors.onSurface,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Right,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        Text(
                            text = "FOR 1 MONTH",
                            style = MaterialTheme.typography.body1,
                            color =  MaterialTheme.colors.onSurface,
                            fontSize = 12.sp,
                            textAlign = TextAlign.Right,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                }
                Spacer(modifier = Modifier.height(35.dp))
                Text(
                    text = "2 Premium accounts * For couples who live together * Ad-free music listening * Download 10,000 songs/device, on up to 5 devices per account * Choose 1,3,6 or 12 months of Premium * Debit and credit cards accepted",
                    style = MaterialTheme.typography.body1,
                    color =  MaterialTheme.colors.onSurface,
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(start = 30.dp, end = 30.dp),
                )
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    shape = RoundedCornerShape(corner = CornerSize(20.dp))
                ) {
                    Text(
                        text = "VIEW PLANS",
                        style = MaterialTheme.typography.h3,
                        fontSize = 14.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 10.dp, end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Offer only for users who are new to Premium.",
                    style = MaterialTheme.typography.body2,
                    color =  MaterialTheme.colors.onSurface,
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            backgroundColor = Color(red = 178, green = 102, blue = 255),
            shape = RoundedCornerShape(10.dp)
        ) {
            Column() {
                Spacer(modifier = Modifier.height(35.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Premium Family",
                        style = MaterialTheme.typography.h3,
                        color =  MaterialTheme.colors.onSurface,
                        modifier = Modifier.padding(start = 35.dp),
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Column(
                        modifier = Modifier
                            .width(IntrinsicSize.Max)
                            .padding(end = 20.dp)
                    ) {
                        Text(
                            text = "Free",
                            style = MaterialTheme.typography.h3,
                            color =  MaterialTheme.colors.onSurface,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Right,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        Text(
                            text = "FOR 1 MONTH",
                            style = MaterialTheme.typography.body1,
                            color =  MaterialTheme.colors.onSurface,
                            fontSize = 12.sp,
                            textAlign = TextAlign.Right,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                }
                Spacer(modifier = Modifier.height(35.dp))
                Text(
                    text = "Ad-free music listening * Choose 1,3,6 or 12 months of Premium * Debit and credit cards accepted",
                    style = MaterialTheme.typography.body1,
                    color =  MaterialTheme.colors.onSurface,
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(start = 30.dp, end = 30.dp),
                )
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    shape = RoundedCornerShape(corner = CornerSize(20.dp))
                ) {
                    Text(
                        text = "VIEW PLANS",
                        style = MaterialTheme.typography.h3,
                        fontSize = 14.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 10.dp, end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Offer only for users who are new to Premium.",
                    style = MaterialTheme.typography.body2,
                    color =  MaterialTheme.colors.onSurface,
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            backgroundColor = Color(red = 255, green = 178, blue = 102),
            shape = RoundedCornerShape(10.dp)
        ) {
            Column() {
                Spacer(modifier = Modifier.height(35.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Premium Student",
                        style = MaterialTheme.typography.h3,
                        color =  MaterialTheme.colors.onSurface,
                        modifier = Modifier.padding(start = 35.dp),
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Column(
                        modifier = Modifier
                            .width(IntrinsicSize.Max)
                            .padding(end = 20.dp)
                    ) {
                        Text(
                            text = "Free",
                            style = MaterialTheme.typography.h3,
                            color =  MaterialTheme.colors.onSurface,
                            fontSize = 25.sp,
                            textAlign = TextAlign.Right,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        Text(
                            text = "FOR 1 MONTH",
                            style = MaterialTheme.typography.body1,
                            color =  MaterialTheme.colors.onSurface,
                            fontSize = 12.sp,
                            textAlign = TextAlign.Right,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                }
                Spacer(modifier = Modifier.height(35.dp))
                Text(
                    text = "Ad-free music listening * Download to listen offline",
                    style = MaterialTheme.typography.body2,
                    color =  MaterialTheme.colors.onSurface,
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(start = 30.dp, end = 30.dp),
                )
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    shape = RoundedCornerShape(corner = CornerSize(20.dp))
                ) {
                    Text(
                        text = "VIEW PLANS",
                        style = MaterialTheme.typography.h3,
                        fontSize = 14.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 10.dp, end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Offer available only to students at an accredited higher education institute.",
                    style = MaterialTheme.typography.body2,
                    color =  MaterialTheme.colors.onSurface,
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(start = 30.dp),
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun PremiumPagePreview() {
    SpotifyCloneTheme {
        PremiumPage()
    }
}