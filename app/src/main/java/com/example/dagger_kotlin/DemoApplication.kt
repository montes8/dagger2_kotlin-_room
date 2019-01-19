package com.example.dagger_kotlin

import android.app.Application
import com.example.dagger_kotlin.database.DataBase

class DemoApplication : Application() {

    companion object {
        var database : DataBase? = null
        var appComponent : AppComponent? = null
    }


}