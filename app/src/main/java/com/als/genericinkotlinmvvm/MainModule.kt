package com.als.genericinkotlinmvvm

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object MainModule {
    @Provides
    @Singleton
    fun provideHelper(): TextHelper = TextHelper()
}
