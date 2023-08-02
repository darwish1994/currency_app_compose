package com.bank.currenyapp.core.di

import com.bank.currenyapp.feature.convert.data.remote.api.CurrencyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
class ApisModule {

    @Provides
    @ViewModelScoped
    fun provideCurrencyApiCalls(retrofit: Retrofit): CurrencyApi = retrofit.create(CurrencyApi::class.java)



}