package gg.rsmod.game.message.handler

import gg.rsmod.game.message.MessageHandler
import gg.rsmod.game.message.impl.MessagePrivateMessage
import gg.rsmod.game.model.World
import gg.rsmod.game.model.entity.Client
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.service.log.LoggerService
import gg.rsmod.util.Misc

/**
 * @author Tom <rspsmods@gmail.com>
 */
class MessagePrivateHandler : MessageHandler<MessagePrivateMessage> {
    override fun handle(
        client: Client,
        world: World,
        message: MessagePrivateMessage,
    ) {
        val decompressed = ByteArray(256)
        val huffman = world.huffman
        huffman.decompress(message.message, decompressed, message.length)

        val unpacked = String(decompressed, 0, message.length)
        val fromPlayer = client as Player
        val toPlayer = world.getPlayerForName(message.username)!!

        val formattedMessage = Misc.formatSentence(unpacked)
        val icon =
            when (fromPlayer.privilege.id) {
                1 -> "<img=0>"
                2, 3 -> "<img=1>"
                else -> ""
            }

        fromPlayer.writePrivateOutMessage(formattedMessage, Misc.formatForDisplay(toPlayer.username))
        toPlayer.writePrivateInMessage(formattedMessage, "$icon${Misc.formatForDisplay(fromPlayer.username)}")

        world.getService(LoggerService::class.java, searchSubclasses = true)?.logPrivateChat(
            client,
            world.getPlayerForName(message.username)!!,
            unpacked,
        )
    }
}
