package net.hakanakkaya.plugins

import io.ktor.server.application.*
import net.hakanakkaya.di.koinModule
import org.koin.ktor.plugin.Koin

fun Application.configureKoin() {
    install(Koin) {
        modules(koinModule)
    }
}