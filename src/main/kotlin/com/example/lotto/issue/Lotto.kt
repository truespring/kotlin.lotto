package com.example.lotto.issue

import com.example.lotto.common.LottoConstants.DEFAULT_ID
import com.example.lotto.common.LottoConstants.DEFAULT_ROUND
import com.example.lotto.common.LottoConstants.LOTTO_SIZE
import com.example.lotto.common.LottoConstants.MAX_NUMBER
import com.example.lotto.common.LottoConstants.MIN_NUMBER

data class Lotto(
    val id: Int,
    val round: Int,
    val numbers: List<Int>
) {
    companion object {
        fun empty(): Lotto {
            return Lotto(
                DEFAULT_ID,
                DEFAULT_ROUND,
                emptyList()
            )
        }
    }

    fun issueLotto(id: Int, round: Int): Lotto {
        return Lotto(
            id,
            round,
            (MIN_NUMBER..MAX_NUMBER).shuffled().take(LOTTO_SIZE).sorted()
        )
    }
}
