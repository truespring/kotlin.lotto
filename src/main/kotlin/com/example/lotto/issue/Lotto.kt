package com.example.lotto.issue

import com.example.lotto.common.LottoConstants.DEFAULT_ID
import com.example.lotto.common.LottoConstants.DEFAULT_ROUND
import com.example.lotto.common.LottoConstants.LOTTO_SIZE
import com.example.lotto.common.LottoConstants.MAX_NUMBER
import com.example.lotto.common.LottoConstants.MIN_NUMBER

data class Lotto(
    val id: Int = DEFAULT_ID,
    val round: Int = DEFAULT_ROUND,
    val numbers: List<Int> = emptyList()
) {

    companion object {
        fun issueLotto(id: Int = DEFAULT_ID, round: Int = DEFAULT_ROUND): Lotto {
            return Lotto(
                id,
                round,
                (MIN_NUMBER..MAX_NUMBER).shuffled().take(LOTTO_SIZE).sorted()
            )
        }
    }
}
