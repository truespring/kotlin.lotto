package com.example.lotto

import com.example.lotto.aggregation.LottoChecker
import com.example.lotto.extract.Extractor
import com.example.lotto.issue.Lotto
import java.util.*

class LottoGame

fun main(args: Array<String>) {

    val sc: Scanner = Scanner(System.`in`)
    println("Enter the number of lotto games to play: ")
    val ea = sc.nextInt()
    val round = sc.nextInt()

    val extractor = Extractor.empty()
    val extractedLotto = extractor.extractLotto(round)

    println("The extracted lotto numbers are ${extractedLotto.numbers}")

    val initLotto = Lotto.empty()
    val lottoChecker = LottoChecker()

    for (i in 1..ea) {
        val lotto = initLotto.issueLotto(ea, round)

        val prize = lottoChecker.checkLotto(lotto, extractedLotto)
        println("Your lotto numbers are ${lotto.numbers}")
        println("Your prize is $prize")
    }
}