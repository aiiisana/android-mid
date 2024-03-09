package com.example.aviatickets.model.service

import com.example.aviatickets.model.entity.Offer
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface APIService {
    @GET("offers")
    fun getOffers(): Call<List<Offer>>
}