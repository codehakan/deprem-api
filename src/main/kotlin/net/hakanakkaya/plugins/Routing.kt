package net.hakanakkaya.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import net.hakanakkaya.routes.authorizedRoute
import net.hakanakkaya.routes.rootRoute
import net.hakanakkaya.routes.unauthorizedRoute

fun Application.configureRouting() {
    routing {
        rootRoute()
        authorizedRoute()
        unauthorizedRoute()
    }
}

