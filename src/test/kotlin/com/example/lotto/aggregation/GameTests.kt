package com.example.lotto.aggregation

import com.example.lotto.enums.PrizeTypes
import com.example.lotto.extract.Extractor
import com.example.lotto.issue.Lotto
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GameTests {

    @Test
    @DisplayName("로또 낙첨을 확인한다.")
    fun `checkLotto should return correct result`() {
        val game = LottoChecker()
        val result = game.checkLotto(Lotto(), Extractor())
        assertEquals(PrizeTypes.LOSING_PRIZE.prizeName, result)
    }

    @Test
    @DisplayName("로또 1등을 확인한다.")
    fun `checkLotto should return correct result for 1st prize`() {
        val game = LottoChecker()
        val lotto = Lotto(0, 0, listOf(1, 2, 3, 4, 5, 6))
        val extractor = Extractor(0, listOf(1, 2, 3, 4, 5, 6), 7)
        val result = game.checkLotto(lotto, extractor)
        assertEquals(PrizeTypes.FIRST_PRIZE.prizeName, result)
    }

    @Test
    @DisplayName("로또 2등을 확인한다.")
    fun `checkLotto should return correct result for 2nd prize`() {
        val game = LottoChecker()
        val lotto = Lotto(0, 0, listOf(1, 2, 3, 4, 5, 6))
        val extractor = Extractor(0, listOf(1, 2, 3, 4, 5, 7), 6)
        val result = game.checkLotto(lotto, extractor)
        assertEquals(PrizeTypes.SECOND_PRIZE.prizeName, result)
    }

    @Test
    @DisplayName("로또 3등을 확인한다.")
    fun `checkLotto should return correct result for 3rd prize`() {
        val game = LottoChecker()
        val lotto = Lotto(0, 0, listOf(1, 2, 3, 4, 5, 6))
        val extractor = Extractor(0, listOf(1, 2, 3, 4, 5, 7), 8)
        val result = game.checkLotto(lotto, extractor)
        assertEquals(PrizeTypes.THIRD_PRIZE.prizeName, result)
    }

    @Test
    @DisplayName("로또 4등을 확인한다.")
    fun `checkLotto should return correct result for 4th prize`() {
        val game = LottoChecker()
        val lotto = Lotto(0, 0, listOf(1, 2, 3, 4, 5, 6))
        val extractor = Extractor(0, listOf(1, 2, 3, 4, 7, 8), 9)
        val result = game.checkLotto(lotto, extractor)
        assertEquals(PrizeTypes.FOURTH_PRIZE.prizeName, result)
    }

    @Test
    @DisplayName("로또 5등을 확인한다.")
    fun `checkLotto should return correct result for 5th prize`() {
        val game = LottoChecker()
        val lotto = Lotto(0, 0, listOf(1, 2, 3, 4, 5, 6))
        val extractor = Extractor(0, listOf(1, 2, 3, 7, 8, 9), 10)
        val result = game.checkLotto(lotto, extractor)
        assertEquals(PrizeTypes.FIFTH_PRIZE.prizeName, result)
    }
}