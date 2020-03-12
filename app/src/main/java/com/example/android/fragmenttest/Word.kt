package com.example.android.fragmenttest

import android.net.Uri
import android.provider.BaseColumns

object Word{
    val AUTHORITY = "org.carzyit.providers.dictporvider"
    class Word : BaseColumns{
        companion object {
            val _ID = "id"
            val WORD = "word"
            val DETAIL = "detail"
            val DICT_CONTENT_URI = Uri.parse("content://$AUTHORITY/words")
            val WORD_CONTENT_URI = Uri.parse("content://$AUTHORITY/word")
        }
    }
}