package com.bank.currenyapp.feature.convert.data.repo

import com.bank.currenyapp.core.network.NetworkRemoteServiceCall
import com.bank.currenyapp.core.network.Resource
import com.bank.currenyapp.feature.convert.data.remote.api.CurrencyApi
import com.bank.currenyapp.feature.convert.domain.model.Symbol
import com.bank.currenyapp.feature.convert.domain.repo.ConvertRepo
import javax.inject.Inject

class ConvertRepoImpl @Inject constructor(private val currencyApi: CurrencyApi) : ConvertRepo,
    NetworkRemoteServiceCall {
    override suspend fun getSymbols(): Resource<List<Symbol>> = safeApiCallGeneric {
        val response = currencyApi.getSymbols()
        return@safeApiCallGeneric response.symbols.map {
            Symbol(
                it.key,
                it.value
            )
        }
    }

    override suspend fun convert(from: String, to: String, amount: Double): Resource<Double> =
        safeApiCallGeneric {
            currencyApi.convert(from, to, amount).result
        }
}