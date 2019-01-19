package com.example.dagger_kotlin.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.dagger_kotlin.database.dao.UserDao
import com.example.dagger_kotlin.database.entity.User

@Database(entities = [User::class],version = 1)
abstract class DataBase : RoomDatabase(){

    abstract fun userDao() : UserDao
}