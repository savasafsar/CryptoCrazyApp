package com.example.cryptocrazyapp.repository

import com.example.cryptocrazyapp.model.Crypto
import com.example.cryptocrazyapp.model.CryptoList
import com.example.cryptocrazyapp.service.CryptoAPI
import com.example.cryptocrazyapp.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

@ActivityScoped
class CryptoRepository @Inject constructor(
    private val api : CryptoAPI
)  {
    suspend fun getCryptoList() : Resource<CryptoList> {
        val response = try {
        api.getCryptoList()
        } catch (e:Exception) {
        return Resource.Error("Error.")
        }
        return Resource.Success(response)
    }
    suspend fun getCrypto(id: String): Resource<Crypto> {
        val response = try {
            api.getCrypto()
        } catch(e: Exception) {
            return Resource.Error("Error")
        }
        return Resource.Success(response)
    }
}
