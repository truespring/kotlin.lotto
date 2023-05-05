package com.example.lotto.issue

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LottoTests {

    @Test
    @DisplayName("id 와 round 가 주어지면 로또를 발행한다")
    fun `issueLotto should return lotto with correct id and round`() {
        val lotto = Lotto.empty()
        val issuedLotto = lotto.issueLotto(1, 2)
        assertEquals(1, issuedLotto.id)
        assertEquals(2, issuedLotto.round)
    }

    @Test
    @DisplayName("로또를 발행하면 6개의 숫자가 발행된다")
    fun `issueLotto should return lotto with 6 numbers`() {
        val lotto = Lotto.empty()
        val issuedLotto = lotto.issueLotto(1, 2)
        assertEquals(6, issuedLotto.numbers.size)
    }

    @Test
    @DisplayName("로또를 발행하면 로또의 숫자는 1부터 45 사이의 숫자이다")
    fun `issueLotto should return lotto with numbers between 1 and 45`() {
        val lotto = Lotto.empty()
        val issuedLotto = lotto.issueLotto(1, 2)
        assertTrue(issuedLotto.numbers.all { it in 1..45 })
    }

    @Test
    @DisplayName("로또를 발행하면 로또의 숫자는 중복되지 않는다")
    fun `issueLotto should return lotto with unique numbers`() {
        val lotto = Lotto.empty()
        val issuedLotto = lotto.issueLotto(1, 2)
        assertTrue(issuedLotto.numbers.distinct().size == issuedLotto.numbers.size)
    }

    @Test
    @DisplayName("로또를 발행하면 로또의 숫자는 오름차순으로 정렬된다")
    fun `issueLotto should return lotto with numbers sorted in ascending order`() {
        val lotto = Lotto.empty()
        val issuedLotto = lotto.issueLotto(1, 2)
        assertTrue(issuedLotto.numbers == issuedLotto.numbers.sorted())
    }
}