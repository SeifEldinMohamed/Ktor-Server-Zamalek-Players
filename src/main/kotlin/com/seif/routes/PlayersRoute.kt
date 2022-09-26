package com.seif.routes

import com.seif.data.model.Player
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.137.1:8080"
// private const val BASE_URL = "http://10.0.2.2:8080" // if we run on emulator
private val players = listOf(
    Player("Shikabala", "36", "WR", "$BASE_URL/players/shika.png"),
    Player("Wensh", "26", "CB", "$BASE_URL/players/wensh.png"),
    Player("Roqa", "28", "CM", "$BASE_URL/players/roqa.png"),
    Player("Zizo", "26", "WR", "$BASE_URL/players/zizo.png"),
    Player("Awad", "30", "GK", "$BASE_URL/players/awad.png"),
    Player("Neday", "27", "LW", "$BASE_URL/players/neday.png"),
)

fun Route.randomPlayer(){
    // will be called when client access this route
    get("/randomplayer"){
        call.respond(
            HttpStatusCode.OK,
            players.random()
        )
    }
}