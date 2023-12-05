package net.hakanakkaya.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import net.hakanakkaya.domain.model.Endpoint

fun Route.rootRoute() {
    get(Endpoint.Root.path) {
        call.respondText("Welcome to Deprem API.")
    }
}