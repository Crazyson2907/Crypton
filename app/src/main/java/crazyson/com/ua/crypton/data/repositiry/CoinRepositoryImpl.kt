package crazyson.com.ua.crypton.data.repositiry

import crazyson.com.ua.crypton.data.remote.CoinPaprikaApi
import crazyson.com.ua.crypton.data.remote.dto.CoinDTO
import crazyson.com.ua.crypton.data.remote.dto.CoinDetailDTO
import crazyson.com.ua.crypton.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDTO> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDTO {
        return api.getCoinById(coinId)
    }
}