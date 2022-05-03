package crazyson.com.ua.crypton.domain.repository

import crazyson.com.ua.crypton.data.remote.dto.CoinDTO
import crazyson.com.ua.crypton.data.remote.dto.CoinDetailDTO

interface CoinRepository {

    suspend fun getCoins():List<CoinDTO>

    suspend fun getCoinById(coinId: String): CoinDetailDTO
}