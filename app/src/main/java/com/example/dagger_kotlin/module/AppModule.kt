package com.example.dagger_kotlin.module

import android.arch.persistence.room.Room
import android.content.Context
import com.example.dagger_kotlin.database.DataBase
import com.example.dagger_kotlin.database.dao.UserDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val context : Context) {

    @Singleton
    @Provides
    fun provideContext(): Context { return context }

    @Singleton
    @Provides
    fun provideDataBase(contexto: Context) : DataBase{
        return Room.databaseBuilder(context,DataBase::class.java,"db_demo").build()
    }

    @Singleton
    @Provides
    fun provideUserDao(database : DataBase): UserDao{
        return database.userDao()
    }

}