package com.bank.currenyapp.feature.convert.data.model

import com.bank.currenyapp.core.network.BaseResponse
import com.google.gson.annotations.SerializedName

data class SymbolResponse(

    @SerializedName("symbols")
    val symbols: Map<String, String>,


    ) : BaseResponse()
