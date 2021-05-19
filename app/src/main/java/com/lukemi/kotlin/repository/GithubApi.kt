package com.lukemi.kotlin.repository

import com.lukemi.kotlin.repository.bean.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubApi {
    @GET("users/{username}/repos")
    fun getUserRepo(@Path("username") username:String):List<Repo>
}