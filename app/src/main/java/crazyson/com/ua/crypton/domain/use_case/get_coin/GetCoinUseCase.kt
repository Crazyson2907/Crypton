package crazyson.com.ua.crypton.domain.use_case.get_coin

import crazyson.com.ua.crypton.common.Resource
import crazyson.com.ua.crypton.data.remote.dto.toCoin
import crazyson.com.ua.crypton.data.remote.dto.toCoinDetail
import crazyson.com.ua.crypton.domain.model.Coin
import crazyson.com.ua.crypton.domain.model.CoinDetail
import crazyson.com.ua.crypton.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }
}