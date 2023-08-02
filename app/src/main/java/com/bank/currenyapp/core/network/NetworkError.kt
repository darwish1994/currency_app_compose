package com.bank.currenyapp.core.network

sealed class NetworkError {
    object NoInternetError : NetworkError()
    object ParseJsonError : NetworkError()
    data class ResponseError(val msg: String) : NetworkError()
    data class HTTPError(val code:Int,val msg: String) : NetworkError()

}
