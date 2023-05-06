package com.example.lotto

import com.example.lotto.aggregation.LottoChecker
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

class LottoGameKtTests {

    @Test
    @DisplayName("1등이 발생할 때까지 로또를 발행한다")
    fun `issueLottoUntilFirstPrize should return lotto until first prize`() {
        val round = 1609
        val lottoChecker = LottoChecker()

        var prize: String
        val extractLotto = Extractor.empty().extractLotto(round)

        for (i in 1..Int.MAX_VALUE) {
            prize = lottoChecker.checkLotto(Lotto.empty().issueLotto(i, round), extractLotto)
            if (prize == FIRST_PRIZE) {
                println("1등을 위해 발행 로또의 갯수는 $i 개 입니다.")
                break
            }
        }
    }

    @Test
    @DisplayName("2등이 발생할 때까지 로또를 발행한다")
    fun `issueLottoUntilSecondPrize should return lotto until second prize`() {
        val round = 1609
        val lottoChecker = LottoChecker()

        var prize: String
        val extractLotto = Extractor.empty().extractLotto(round)

        for (i in 1..Int.MAX_VALUE) {
            prize = lottoChecker.checkLotto(Lotto.empty().issueLotto(i, round), extractLotto)
            if (prize == SECOND_PRIZE) {
                println("2등을 위해 발행 로또의 갯수는 $i 개 입니다.")
                break
            }
        }
    }

    @Test
    @DisplayName("3등이 발생할 때까지 로또를 발행한다")
    fun `issueLottoUntilThirdPrize should return lotto until third prize`() {
        val round = 1609
        val lottoChecker = LottoChecker()

        var prize: String
        val extractLotto = Extractor.empty().extractLotto(round)

        for (i in 1..Int.MAX_VALUE) {
            prize = lottoChecker.checkLotto(Lotto.empty().issueLotto(i, round), extractLotto)
            if (prize == THIRD_PRIZE) {
                println("3등을 위해 발행 로또의 갯수는 $i 개 입니다.")
                break
            }
        }
    }

    @Test
    @DisplayName("4등이 발생할 때까지 로또를 발행한다")
    fun `issueLottoUntilFourthPrize should return lotto until fourth prize`() {
        val round = 1609
        val lottoChecker = LottoChecker()

        var prize: String
        val extractLotto = Extractor.empty().extractLotto(round)

        for (i in 1..Int.MAX_VALUE) {
            prize = lottoChecker.checkLotto(Lotto.empty().issueLotto(i, round), extractLotto)
            if (prize == FOURTH_PRIZE) {
                println("4등을 위해 발행 로또의 갯수는 $i 개 입니다.")
                break
            }
        }
    }

    @Test
    @DisplayName("5등이 발생할 때까지 로또를 발행한다")
    fun `issueLottoUntilFifthPrize should return lotto until fifth prize`() {
        val round = 1609
        val lottoChecker = LottoChecker()

        var prize: String
        val extractLotto = Extractor.empty().extractLotto(round)

        for (i in 1..Int.MAX_VALUE) {
            prize = lottoChecker.checkLotto(Lotto.empty().issueLotto(i, round), extractLotto)
            if (prize == FIFTH_PRIZE) {
                println("5등을 위해 발행 로또의 갯수는 $i 개 입니다.")
                break
            }
        }
    }

    @Test
    @DisplayName("낙첨이 발생할 때까지 로또를 발행한다.")
    fun `issueLottoUntilLosingPrize should return lotto until losing prize`() {
        val round = 1609
        val lottoChecker = LottoChecker()

        var prize: String
        val extractLotto = Extractor.empty().extractLotto(round)

        for (i in 1..Int.MAX_VALUE) {
            prize = lottoChecker.checkLotto(Lotto.empty().issueLotto(i, round), extractLotto)
            if (prize == LOSING_PRIZE) {
                println("낙첨을 위해 발행 로또의 갯수는 $i 개 입니다.")
                break
            }
        }
    }

}