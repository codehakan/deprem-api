package net.hakanakkaya.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import net.hakanakkaya.domain.model.DefaultResponseModel
import net.hakanakkaya.domain.model.Endpoint

fun Route.authorizedRoute() {
    authenticate("auth-session") {
        get(Endpoint.Authorized.path) {
            call.respond(
                message = DefaultResponseModel(
                    success = true,
                    message = "Authorized."
                ),
                status = HttpStatusCode.OK
            )
        }
    }
}