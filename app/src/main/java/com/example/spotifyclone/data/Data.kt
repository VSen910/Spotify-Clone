package com.example.spotifyclone.data

import com.example.spotifyclone.R

val recentPlaylist = listOf<String>(
    "The Mythpat Podcast",
    "Man of the Moon",
    "Liked Songs",
    "Punjabi 101",
    "Daily Mix 1",
    "F1 22 (Original Game Soundtrack)"
)

class SearchGenres {
    object SearchGenres {
        val genres = listOf(
            SearchCards("Podcasts", R.drawable.podcasts),
            SearchCards("Made for You", R.drawable.madeforu),
            SearchCards("New Releases", R.drawable.newrelease),
            SearchCards("Marathi", R.drawable.marathi),
            SearchCards("Punjabi", R.drawable.punjabi),
            SearchCards("Tamil", R.drawable.punjabi),
            SearchCards("Telugu", R.drawable.telugu),
            SearchCards("Charts", R.drawable.charts),
            SearchCards("Live Events", R.drawable.liveevents),
            SearchCards("Pop", R.drawable.pop),
            SearchCards("Indie", R.drawable.indie),
            SearchCards("Indian Classical", R.drawable.indianclassical),
            SearchCards("Romance", R.drawable.romance),
            SearchCards("Bollywood", R.drawable.bollywood),
            SearchCards("Happy Holidays", R.drawable.happyholidays),
            SearchCards("Fresh finds", R.drawable.freshfinds),
            SearchCards("Devotional", R.drawable.devotional),
            SearchCards("Decades", R.drawable.decades),
            SearchCards("Hip-Hop", R.drawable.hiphop),
            SearchCards("Equal", R.drawable.equal),
            SearchCards("Pop", R.drawable.pop1),
            SearchCards("Radar", R.drawable.radar),
            SearchCards("Gaming", R.drawable.gaming),
            SearchCards("Wellness", R.drawable.wellness)
        )
    }
}

class Songs {
    object songs{
        val songList = listOf<SongsCard>(

        )
    }
}