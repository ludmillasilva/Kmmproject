package com.ludmilla.kmmproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform