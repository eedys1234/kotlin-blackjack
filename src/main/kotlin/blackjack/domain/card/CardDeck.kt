package blackjack.domain.card

class CardDeck() {

    private val cards: List<Card> = CardPattern.values()
        .flatMap {
                p -> CardValue.values().map { v -> Card(p, v) }
        }

    private fun shuffle() {
        cards.shuffled()
    }

    fun poll(): Card {
        shuffle()
        return cards[0]
    }

}