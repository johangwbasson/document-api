package net.johanbasson.document

import net.johanbasson.document.infrastructure.Server
import net.johanbasson.document.infrastructure.config.ServerConfig

fun main() {
    Server(ServerConfig(8080)).start()
}
