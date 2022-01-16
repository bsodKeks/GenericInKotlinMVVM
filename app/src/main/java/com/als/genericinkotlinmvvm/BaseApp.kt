package com.als.genericinkotlinmvvm

import android.app.Application

class BaseApp : Application() {
    companion object {
        lateinit var instance: BaseApp
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        initializeDagger()
        instance = this
    }

    private fun initializeDagger() {
        appComponent = DaggerAppComponent.builder()
            .mainModule(MainModule)
            .build()
    }
}
