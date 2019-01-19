package com.example.dagger_kotlin.database.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class User (
    @PrimaryKey(autoGenerate = true)
    var id : Long? = null,

    var name : String,

    var lasName : String,

    var password : String,

    var age : Int
)