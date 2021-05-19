package com.lukemi.kotlin.repository

import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GithubNetProvider private constructor() {

    val HOST_GITHUB :String ="https://api.github.com/"

    companion object {
        private var instance:GithubNetProvider?=null
        get(){
            if (field == null) {
                field= GithubNetProvider()
            }
            return field
        }
    }

    @Synchronized
    fun get():GithubNetProvider{
        return instance!!
    }

    fun getRetrofit():Retrofit{

        return Retrofit.Builder()
                .addCallAdapterFactory(  RxJava3CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(HOST_GITHUB)
                .build()
    }

}