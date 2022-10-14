package com.example.spotifyclone.data

import com.example.spotifyclone.R

class RecentPlaylistItems {
    object RecentPlaylistItems {
        val playlists = listOf<Playlist>(
            Playlist(R.drawable.likedsongs, "Liked Songs"),
            Playlist(R.drawable.bollywoodbutter, "Bollywood Butter"),
            Playlist(R.drawable.relaxhits, "Relax Hits"),
            Playlist(R.drawable.indiemix, "Indie Mix"),
            Playlist(R.drawable.dailymix1, "Daily Mix 1"),
            Playlist(R.drawable.beastmode, "Beast Mode")
        )
    }
}

class MadeForYouItems {
    object MadeForYouItems {
        val madeForYou = listOf<Playlist>(
            Playlist(R.drawable.dailymix1, "Bad Computer, Conro, Slushii and more"),
            Playlist(R.drawable.chillhits, "Rouge Haven, Leo Lind, Golden Horses, Sun of The People"),
            Playlist(R.drawable.popmix, "Brian Tyler, Christopher Lennertz, Jeremy Soule and more"),
            Playlist(R.drawable.dailymix1, "Bad Computer, Conro, Slushii and more"),
            Playlist(R.drawable.chillhits, "Rouge Haven, Leo Lind, Golden Horses, Sun of The People"),
            Playlist(R.drawable.popmix, "Brian Tyler, Christopher Lennertz, Jeremy Soule and more"),
        )
    }
}

class IndiasBestItems {
    object IndiasBestItems {
        val indiasBest = listOf(
            Playlist(R.drawable.relaxhits, "Guru Randhawa, Arijit Singh, Pritam, A.R. Rahman, Shreya Ghoshal"),
            Playlist(R.drawable.edmsampling, "Dua Lipa, David Guetta, J Balvin, Pritam, Yo Yo Honey Singh, Lil Pump"),
            Playlist(R.drawable.chilledhits, "Guru Randhawa, Anirudh Ravichander, Tanishk Bagchi, B Praak"),
            Playlist(R.drawable.relaxhits, "Guru Randhawa, Arijit Singh, Pritam, A.R. Rahman, Shreya Ghoshal"),
            Playlist(R.drawable.edmsampling, "Dua Lipa, David Guetta, J Balvin, Pritam, Yo Yo Honey Singh, Lil Pump"),
            Playlist(R.drawable.chilledhits, "Guru Randhawa, Anirudh Ravichander, Tanishk Bagchi, B Praak"),
        )
    }
}

class RecentlyPlayedItems {
    object RecentlyPlayedItems {
        val recentlyPlayed = listOf(
            Playlist(R.drawable.likedsongs, "Liked Songs"),
            Playlist(R.drawable.bollywoodbutter, "Bollywood Butter"),
            Playlist(R.drawable.relaxhits, "Relax Hits"),
            Playlist(R.drawable.indiemix, "Indie Mix"),
            Playlist(R.drawable.dailymix1, "Daily Mix 1"),
            Playlist(R.drawable.beastmode, "Beast Mode")
        )
    }
}

class SuggestedArtistsItems {
    object SuggestedArtistsItems {
        val suggestedArtists = listOf(
            Artist(R.drawable.justinbieber, "Justin Bieber"),
            Artist(R.drawable.casper, "Casper"),
            Artist(R.drawable.linda, "Linda"),
            Artist(R.drawable.charlieputh, "Charlie Puth"),
            Artist(R.drawable.shawnmendes, "Shawn Mendes")
        )
    }
}

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