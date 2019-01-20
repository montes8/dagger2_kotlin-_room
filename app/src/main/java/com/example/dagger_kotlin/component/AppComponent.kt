package com.example.dagger_kotlin.component

import com.example.dagger_kotlin.module.AppModule
import com.example.dagger_kotlin.ui.MainActivity
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}