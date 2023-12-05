package net.hakanakkaya.domain.model

sealed class Endpoint(val path: String) {

    data object Root : Endpoint(path = "/")
    data object Unauthorized : Endpoint(path = "/unauthorized")
    data object Authorized : Endpoint(path = "/authorized")

}