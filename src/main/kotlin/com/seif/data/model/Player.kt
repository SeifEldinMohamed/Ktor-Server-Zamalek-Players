package com.seif.data.model

import kotlinx.serialization.Serializable

@Serializable // will allow us to parse the content of the class to json and send it over the network
data class Player(
    val name:String,
    val age:String,
    val position:String,
    val imageUrl:String
)
