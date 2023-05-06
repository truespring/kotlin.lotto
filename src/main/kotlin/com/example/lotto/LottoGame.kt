package com.example.lotto

import com.example.lotto.aggregation.LottoChecker
import com.example.lotto.extract.Extractor
import com.example.lotto.issue.Lotto
import java.util.*

class LottoGame

fun main() {

    val sc = Scanner(System.`in`)
    println("Enter the number of lotto games to play: ")
    val ea = sc.nextInt()
    val round = sc.nextInt()

    val extractedLotto = Extractor.extractLotto(round)

    println("The extracted lotto numbers are ${extractedLotto.numbers}")

    val lottoChecker = LottoChecker()

    for (i in 1..ea) {
        val lotto = Lotto.issueLotto(ea, round)

        val prize = lottoChecker.checkLotto(lotto, extractedLotto)
        println("Your lotto numbers are ${lotto.numbers}")
        println("Your prize is $prize")
    }
}