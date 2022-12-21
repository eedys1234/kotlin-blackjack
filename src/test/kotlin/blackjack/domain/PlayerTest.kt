package blackjack.domain

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test

class PlayerTest {

    @Test
    fun `플레이어가 게임에 참여한다`() {
        val playerName = "leejh"
        val game = BlackJackGame()
        game.join(playerName)
        val player = Player(playerName)
        assertThat(game.players()).contains(player)
    }
}