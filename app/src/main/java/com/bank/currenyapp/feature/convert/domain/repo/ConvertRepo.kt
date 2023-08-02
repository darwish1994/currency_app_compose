package com.bank.currenyapp.feature.convert.domain.repo

import com.bank.currenyapp.core.network.Resource
import com.bank.currenyapp.feature.convert.domain.model.Symbol

interface ConvertRepo {

    suspend fun getSymbols(): Resource<List<Symbol>>

    suspend fun convert(from: String, to: String, amount: Double) :Resource<Double>


}