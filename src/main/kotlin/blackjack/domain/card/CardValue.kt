package blackjack.domain.card

enum class CardValue(val id: String) {
    KING("K"),
    JACK("J"),
    QUEEN("Q"),
    ACE("A"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10");

    companion object {
        fun matchCardValue(name: String) {
            CardValue.values()
                .firstOrNull() { it.equals(name) } ?: throw IllegalArgumentException("식별값이 적절하지 않습니다. name = $name")
        }
    }
}
