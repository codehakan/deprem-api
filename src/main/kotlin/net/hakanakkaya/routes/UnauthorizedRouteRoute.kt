package net.hakanakkaya.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import net.hakanakkaya.domain.model.DefaultResponseModel
import net.hakanakkaya.domain.model.Endpoint

fun Route.unauthorizedRoute() {
    get(Endpoint.Unauthorized.path) {
        call.respond(
            message = DefaultResponseModel(
                success = false,
                message = "Unauthorized."
            ),
            status = HttpStatusCode.Unauthorized
        )
    }
}