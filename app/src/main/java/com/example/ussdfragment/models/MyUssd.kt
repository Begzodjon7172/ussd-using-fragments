package com.example.ussdfragment.models

import java.io.Serializable

data class MyUssd(
    var title: String,
    var code: String,
    var desc: String
):Serializable
