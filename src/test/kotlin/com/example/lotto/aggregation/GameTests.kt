package com.example.lotto.aggregation

import com.example.lotto.common.LottoConstants.FIFTH_PRIZE
import com.example.lotto.common.LottoConstants.FIRST_PRIZE
import com.example.lotto.common.LottoConstants.FOURTH_PRIZE
import com.example.lotto.common.LottoConstants.LOSING_PRIZE
import com.example.lotto.common.LottoConstants.SECOND_PRIZE
import com.example.lotto.common.LottoConstants.THIRD_PRIZE
import com.example.lotto.extract.Extractor
import com.example.lotto.issue.Lotto
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GameTests {

    @Test
    @DisplayName("로또 낙첨을 확인한다.")
    fun `checkLotto should return correct result`() {
        val game = Game()
        val lotto = Lotto.empty()
        val extractor = Extractor.empty()
        val result = game.checkLotto(lotto, extractor)
        assertEquals(LOSING_PRIZE, result)
    }

    @Test
    @DisplayName("로또 1등을 확인한다.")
    fun `checkLotto should return correct result for 1st prize`() {
        val game = Game()
        val lotto = Lotto(0, 0, listOf(1, 2, 3, 4, 5, 6))
        val extractor = Extractor(0, listOf(1, 2, 3, 4, 5, 6), 7)
        val result = game.checkLotto(lotto, extractor)
        assertEquals(FIRST_PRIZE, result)
    }

    @Test
    @DisplayName("로또 2등을 확인한다.")
    fun `checkLotto should return correct result for 2nd prize`() {
        val game = Game()
        val lotto = Lotto(0, 0, listOf(1, 2, 3, 4, 5, 6))
        val extractor = Extractor(0, listOf(1, 2, 3, 4, 5, 7), 6)
        val result = game.checkLotto(lotto, extractor)
        assertEquals(SECOND_PRIZE, result)
    }

    @Test
    @DisplayName("로또 3등을 확인한다.")
    fun `checkLotto should return correct result for 3rd prize`() {
        val game = Game()
        val lotto = Lotto(0, 0, listOf(1, 2, 3, 4, 5, 6))
        val extractor = Extractor(0, listOf(1, 2, 3, 4, 5, 7), 8)
        val result = game.checkLotto(lotto, extractor)
        assertEquals(THIRD_PRIZE, result)
    }

    @Test
    @DisplayName("로또 4등을 확인한다.")
    fun `checkLotto should return correct result for 4th prize`() {
        val game = Game()
        val lotto = Lotto(0, 0, listOf(1, 2, 3, 4, 5, 6))
        val extractor = Extractor(0, listOf(1, 2, 3, 4, 7, 8), 9)
        val result = game.checkLotto(lotto, extractor)
        assertEquals(FOURTH_PRIZE, result)
    }

    @Test
    @DisplayName("로또 5등을 확인한다.")
    fun `checkLotto should return correct result for 5th prize`() {
        val game = Game()
        val lotto = Lotto(0, 0, listOf(1, 2, 3, 4, 5, 6))
        val extractor = Extractor(0, listOf(1, 2, 3, 7, 8, 9), 10)
        val result = game.checkLotto(lotto, extractor)
        assertEquals(FIFTH_PRIZE, result)
    }
}