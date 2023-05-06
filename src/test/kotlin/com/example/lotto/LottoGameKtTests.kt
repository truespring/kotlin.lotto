package com.example.lotto

import com.example.lotto.aggregation.LottoChecker
import com.example.lotto.enums.PrizeTypes
import com.example.lotto.extract.Extractor
import com.example.lotto.issue.Lotto
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LottoGameKtTests {
    private val round = 1609
    private val lottoChecker = LottoChecker()
    private val extractLotto = Extractor.extractLotto(round)

    private var prize: String = ""

//    @Test
//    @DisplayName("1등이 발생할 때까지 로또를 발행한다")
//    fun `issueLottoUntilFirstPrize should return lotto until first prize`() {
//        for (i in 1..Int.MAX_VALUE) {
//            prize = lottoChecker.checkLotto(Lotto.issueLotto(i, round), extractLotto)
//            if (prize == FIRST_PRIZE) {
//                println("1등을 위해 발행 로또의 갯수는 $i 개 입니다.")
//                break
//            }
//        }
//    }

    @Test
    @DisplayName("2등이 발생할 때까지 로또를 발행한다")
    fun `issueLottoUntilSecondPrize should return lotto until second prize`() {
        for (i in 1..Int.MAX_VALUE) {
            prize = lottoChecker.checkLotto(Lotto.issueLotto(i, round), extractLotto)
            if (prize == PrizeTypes.SECOND_PRIZE.prizeName) {
                println("2등을 위해 발행 로또의 갯수는 $i 개 입니다.")
                break
            }
        }
    }

    @Test
    @DisplayName("3등이 발생할 때까지 로또를 발행한다")
    fun `issueLottoUntilThirdPrize should return lotto until third prize`() {
        for (i in 1..Int.MAX_VALUE) {
            prize = lottoChecker.checkLotto(Lotto.issueLotto(i, round), extractLotto)
            if (prize == PrizeTypes.THIRD_PRIZE.prizeName) {
                println("3등을 위해 발행 로또의 갯수는 $i 개 입니다.")
                break
            }
        }
    }

    @Test
    @DisplayName("4등이 발생할 때까지 로또를 발행한다")
    fun `issueLottoUntilFourthPrize should return lotto until fourth prize`() {
        for (i in 1..Int.MAX_VALUE) {
            prize = lottoChecker.checkLotto(Lotto.issueLotto(i, round), extractLotto)
            if (prize == PrizeTypes.FOURTH_PRIZE.prizeName) {
                println("4등을 위해 발행 로또의 갯수는 $i 개 입니다.")
                break
            }
        }
    }

    @Test
    @DisplayName("5등이 발생할 때까지 로또를 발행한다")
    fun `issueLottoUntilFifthPrize should return lotto until fifth prize`() {
        for (i in 1..Int.MAX_VALUE) {
            prize = lottoChecker.checkLotto(Lotto.issueLotto(i, round), extractLotto)
            if (prize == PrizeTypes.FIFTH_PRIZE.prizeName) {
                println("5등을 위해 발행 로또의 갯수는 $i 개 입니다.")
                break
            }
        }
    }

    @Test
    @DisplayName("낙첨이 발생할 때까지 로또를 발행한다.")
    fun `issueLottoUntilLosingPrize should return lotto until losing prize`() {
        for (i in 1..Int.MAX_VALUE) {
            prize = lottoChecker.checkLotto(Lotto.issueLotto(i, round), extractLotto)
            if (prize == PrizeTypes.LOSING_PRIZE.prizeName) {
                println("낙첨을 위해 발행 로또의 갯수는 $i 개 입니다.")
                break
            }
        }
    }
}