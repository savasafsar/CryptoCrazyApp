package com.example.cryptocrazyapp.service

import com.example.cryptocrazyapp.model.Crypto
import com.example.cryptocrazyapp.model.CryptoList
import retrofit2.http.GET

interface CryptoAPI {
    @GET("cryptolist.json")
    suspend fun getCryptoList(): CryptoList

    @GET("crypto.json")
    suspend fun getCrypto(): Crypto
}