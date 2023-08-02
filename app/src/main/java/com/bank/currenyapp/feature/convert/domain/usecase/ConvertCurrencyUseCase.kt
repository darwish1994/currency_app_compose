package com.bank.currenyapp.feature.convert.domain.usecase

import com.bank.currenyapp.core.network.Resource
import com.bank.currenyapp.feature.convert.domain.repo.ConvertRepo
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ConvertCurrencyUseCase @Inject constructor(private val convertRepo: ConvertRepo) {

    operator fun invoke(from: String, to: String, amount: Double) = flow {
        emit(Resource.Loading())
        emit(convertRepo.convert(from, to, amount))
    }
}