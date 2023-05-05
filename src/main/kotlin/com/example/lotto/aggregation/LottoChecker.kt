package com.example.lotto.aggregation

import com.example.lotto.common.LottoConstants.FIFTH_PRIZE
import com.example.lotto.common.LottoConstants.FIRST_PRIZE
import com.example.lotto.common.LottoConstants.FOURTH_PRIZE
import com.example.lotto.common.LottoConstants.LOSING_PRIZE
import com.example.lotto.common.LottoConstants.SECOND_PRIZE
import com.example.lotto.common.LottoConstants.THIRD_PRIZE
import com.example.lotto.extract.Extractor
import com.example.lotto.issue.Lotto

class LottoChecker {

    fun checkLotto(lotto: Lotto, extractor: Extractor): String {
        val matchedNumbers = lotto.numbers.intersect(extractor.numbers.toSet()).toList()
        val isBonusMatched = lotto.numbers.contains(extractor.bonus)
        return when (matchedNumbers.size) {
            6 -> FIRST_PRIZE
            5 -> if (isBonusMatched) SECOND_PRIZE else THIRD_PRIZE
            4 -> FOURTH_PRIZE
            3 -> FIFTH_PRIZE
            else -> LOSING_PRIZE
        }
    }
}