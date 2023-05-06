package com.example.lotto.common

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LottoConstantsTests {

    @Test
    @DisplayName("로또 상수를 테스트한다")
    fun testConstants() {
        assertEquals(1, LottoConstants.MIN_NUMBER)
        assertEquals(45, LottoConstants.MAX_NUMBER)
        assertEquals(6, LottoConstants.LOTTO_SIZE)
        assertEquals(0, LottoConstants.DEFAULT_BONUS)
        assertEquals(0, LottoConstants.DEFAULT_ID)
        assertEquals(0, LottoConstants.DEFAULT_ROUND)
    }
}