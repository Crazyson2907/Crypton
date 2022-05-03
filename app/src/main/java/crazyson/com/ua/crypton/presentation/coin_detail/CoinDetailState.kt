package crazyson.com.ua.crypton.presentation.coin_detail

import crazyson.com.ua.crypton.domain.model.Coin
import crazyson.com.ua.crypton.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading:Boolean = false,
    val coin: CoinDetail ? = null,
    val error: String = ""
)