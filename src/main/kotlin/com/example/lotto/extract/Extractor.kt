package com.example.lotto.extract

import com.example.lotto.common.LottoConstants.DEFAULT_BONUS
import com.example.lotto.common.LottoConstants.DEFAULT_ROUND
import com.example.lotto.common.LottoConstants.LOTTO_SIZE
import com.example.lotto.common.LottoConstants.MAX_NUMBER
import com.example.lotto.common.LottoConstants.MIN_NUMBER

data class Extractor(
    val round: Int,
    val numbers: List<Int>,
    val bonus: Int
) {

    companion object {
        fun extractLotto(round: Int): Extractor {
            val extractedNumbers = (MIN_NUMBER..MAX_NUMBER).shuffled().take(LOTTO_SIZE).sorted()
            return Extractor(
                round,
                extractedNumbers,
                (MIN_NUMBER..MAX_NUMBER).shuffled().filterNot {
                    extractedNumbers.contains(it)
                }.firstOrNull() ?: DEFAULT_BONUS
            )
        }

        fun extractLotto2(round: Int): Extractor {
            val extractedNumbers = (MIN_NUMBER..MAX_NUMBER).shuffled().take(LOTTO_SIZE).sorted()
            val bonus = (MIN_NUMBER..MAX_NUMBER).shuffled().filterNot { extractedNumbers.contains(it) }.firstOrNull() ?: DEFAULT_BONUS
            return Extractor(round, extractedNumbers, bonus)
        }

        fun fromNumbersAndBonus(round: Int, numbers: List<Int>, bonus: Int): Extractor {
            return Extractor(round, numbers.sorted(), bonus)
        }
    }
}
