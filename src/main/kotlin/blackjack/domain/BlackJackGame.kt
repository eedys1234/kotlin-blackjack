package blackjack.domain

class BlackJackGame {

    private val players = mutableListOf<Player>()

    fun join(name: String) {
        players.add(Player(name))
    }

    fun players(): List<Player> {
        return players.toList()
    }
}