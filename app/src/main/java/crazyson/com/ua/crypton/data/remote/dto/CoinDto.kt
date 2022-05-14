package crazyson.com.ua.crypton.data.remote.dto

import com.google.gson.annotations.SerializedName
import crazyson.com.ua.crypton.domain.model.Coin

data class CoinDTO(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDTO.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}