package com.example.lotto.aggregation

import com.example.lotto.enums.PrizeTypes
import com.example.lotto.extract.Extractor
import com.example.lotto.issue.Lotto

class LottoChecker {

    fun checkLotto(lotto: Lotto, extractor: Extractor): String {
        val matchedNumbers = lotto.numbers.intersect(extractor.numbers.toSet()).toList()
        val isBonusMatched = lotto.numbers.contains(extractor.bonus)

        return lottoPrize(matchedNumbers, isBonusMatched)
    }

    private fun lottoPrize(matchedNumbers: List<Int>, isBonusMatched: Boolean): String {
        for (prizeType in PrizeTypes.values()) {
            if (prizeType.matchCount == matchedNumbers.size &&
                prizeType.bonusMatch == isBonusMatched
            ) {
                return prizeType.prizeName
            }
        }
        return PrizeTypes.LOSING_PRIZE.prizeName
    }
}