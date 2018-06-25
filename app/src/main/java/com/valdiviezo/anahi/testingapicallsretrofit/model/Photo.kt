package com.valdiviezo.anahi.testingapicallsretrofit.model

import java.io.Serializable

data class Photo (val id : String, val like : Int, val favorites: Int, val tags : String, val previewURL: String, val webformatURL : String) : Serializable {
}