package com.shreyaskv.bluetoothdataexchangeapp.di

import android.content.Context
import com.shreyaskv.bluetoothdataexchangeapp.data.chat.AndroidBluetoothController
import com.shreyaskv.bluetoothdataexchangeapp.domain.chat.BluetoothController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideBluetoothController(@ApplicationContext context: Context):BluetoothController{
        return AndroidBluetoothController(context)
    }
}