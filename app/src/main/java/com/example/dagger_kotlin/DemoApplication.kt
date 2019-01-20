package com.example.dagger_kotlin

import android.app.Application
import com.example.dagger_kotlin.component.AppComponent
import com.example.dagger_kotlin.component.DaggerAppComponent
import com.example.dagger_kotlin.database.DataBase
import com.example.dagger_kotlin.module.AppModule

class DemoApplication : Application() {

    companion object {
        var database : DataBase? = null
        var appComponent : AppComponent? = null
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(applicationContext)).build()
    }


}