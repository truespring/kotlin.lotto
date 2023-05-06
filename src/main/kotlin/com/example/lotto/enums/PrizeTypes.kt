package com.example.lotto.enums

enum class PrizeTypes(val prizeName: String, val matchCount: Int, val bonusMatch: Boolean) {
    FIRST_PRIZE("1등", 6, false),
    SECOND_PRIZE("2등", 5, true),
    THIRD_PRIZE("3등", 5, false),
    FOURTH_PRIZE("4등", 4, false),
    FIFTH_PRIZE("5등", 3, false),
    LOSING_PRIZE("낙첨", 0, false);
}