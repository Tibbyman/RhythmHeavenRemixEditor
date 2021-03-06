package io.github.chrislo27.rhre3.track

import io.github.chrislo27.rhre3.registry.Game
import io.github.chrislo27.rhre3.registry.GameGroup


class GameSection(val startBeat: Float, val endBeat: Float, val game: Game) {

    val gameGroup: GameGroup
        get() = game.gameGroup

}