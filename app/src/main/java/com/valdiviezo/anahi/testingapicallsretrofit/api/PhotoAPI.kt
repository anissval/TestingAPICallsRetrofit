package com.valdiviezo.anahi.testingapicallsretrofit.api

import com.valdiviezo.anahi.testingapicallsretrofit.model.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoAPI {

    @GET("?key=9378494-b896fdb1ee82173194c69d3fd&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}