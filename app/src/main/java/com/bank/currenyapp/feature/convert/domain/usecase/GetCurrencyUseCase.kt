package com.bank.currenyapp.feature.convert.domain.usecase

import com.bank.currenyapp.core.network.Resource
import com.bank.currenyapp.feature.convert.domain.repo.ConvertRepo
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCurrencyUseCase @Inject constructor(private val convertRepo: ConvertRepo) {

    operator fun invoke() = flow {
        emit(Resource.Loading())
        emit(convertRepo.getSymbols())
    }
}