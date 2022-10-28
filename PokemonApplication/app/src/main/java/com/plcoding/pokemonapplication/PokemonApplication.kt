package com.plcoding.pokemonapplication

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import io.realm.Realm
import timber.log.Timber

@HiltAndroidApp
class PokemonApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        Timber.plant(Timber.DebugTree())
    }
}