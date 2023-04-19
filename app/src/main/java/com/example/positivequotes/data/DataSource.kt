package com.example.positivequotes.data

import com.example.positivequotes.R
import com.example.positivequotes.model.PositiveQuotes

class DataSource {

    fun loadQuotes(): List<PositiveQuotes> {
        return listOf<PositiveQuotes>(
            PositiveQuotes(R.string.quote1),
            PositiveQuotes(R.string.quote2),
            PositiveQuotes(R.string.quote3),
            PositiveQuotes(R.string.quote4),
            PositiveQuotes(R.string.quote5),
            PositiveQuotes(R.string.quote6),
            PositiveQuotes(R.string.quote7),
            PositiveQuotes(R.string.quote8),
            PositiveQuotes(R.string.quote9),
            PositiveQuotes(R.string.quote10),
        )
    }
}