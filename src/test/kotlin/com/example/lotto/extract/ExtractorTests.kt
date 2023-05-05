package com.example.lotto.extract

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName

class ExtractorTests {

    @Test
    @DisplayName("round 가 주어지면 추첨 결과를 발행한다")
    fun `extractLotto should return extractor with correct round`() {
        val extractor = Extractor.empty()
        val extractedLotto = extractor.extractLotto(1)
        assertEquals(1, extractedLotto.round)
    }

    @Test
    @DisplayName("추첨 결과를 발행하면 6개의 숫자가 발행된다")
    fun `extractLotto should return extractor with 6 numbers`() {
        val extractor = Extractor.empty()
        val extractedLotto = extractor.extractLotto(1)
        assertEquals(6, extractedLotto.numbers.size)
    }

    @Test
    @DisplayName("추첨 결과를 발행하면 추첨 번호는 1부터 45 사이의 숫자이다")
    fun `extractLotto should return extractor with numbers between 1 and 45`() {
        val extractor = Extractor.empty()
        val extractedLotto = extractor.extractLotto(1)
        assertTrue(extractedLotto.numbers.all { it in 1..45 })
    }

    @Test
    @DisplayName("추첨 결과를 발행하면 추첨 번호는 중복되지 않는다")
    fun `extractLotto should return extractor with unique numbers`() {
        val extractor = Extractor.empty()
        val extractedLotto = extractor.extractLotto(1)
        assertTrue(extractedLotto.numbers.distinct().size == extractedLotto.numbers.size)
    }

    @Test
    @DisplayName("추첨 결과를 발행하면 추첨 번호는 오름차순으로 정렬된다")
    fun `extractLotto should return extractor with numbers sorted in ascending order`() {
        val extractor = Extractor.empty()
        val extractedLotto = extractor.extractLotto(1)
        assertTrue(extractedLotto.numbers == extractedLotto.numbers.sorted())
    }

    @Test
    @DisplayName("추첨 결과를 발행하면 보너스 번호가 발행되며 1부터 45 사이의 숫자이다")
    fun `extractLotto should return extractor with bonus number`() {
        val extractor = Extractor.empty()
        val extractedLotto = extractor.extractLotto(1)
        assertTrue(extractedLotto.bonus in 1..45)
    }

    @Test
    @DisplayName("추첨 결과를 발행하면 보너스 번호는 추첨 번호와 중복되지 않는다")
    fun `extractLotto should return extractor with unique bonus number`() {
        val extractor = Extractor.empty()
        val extractedLotto = extractor.extractLotto(1)
        assertTrue(extractedLotto.bonus !in extractedLotto.numbers)
    }
}