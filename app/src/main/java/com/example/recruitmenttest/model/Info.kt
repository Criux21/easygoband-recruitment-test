package com.example.recruitmenttest.model

import com.google.gson.JsonArray
import java.util.*

data class Info (
    var access_group_name:String,
    var access_group_id:Int,
    var total_uses:Int,
    var sessions: JsonArray,
    var event_id:Int,
    var structure_decode:Boolean,
    var name: String,
    var modified: Date,
    var id:Int,
    var basic_product_id:Int,
)