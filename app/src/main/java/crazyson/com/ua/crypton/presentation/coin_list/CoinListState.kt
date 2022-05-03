package crazyson.com.ua.crypton.presentation.coin_list

import crazyson.com.ua.crypton.domain.model.Coin

data class CoinListState(
    val isLoading:Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
