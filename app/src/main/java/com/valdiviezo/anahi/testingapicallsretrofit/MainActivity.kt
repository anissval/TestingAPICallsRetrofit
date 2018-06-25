package com.valdiviezo.anahi.testingapicallsretrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.valdiviezo.anahi.testingapicallsretrofit.api.PhotoRetriever
import com.valdiviezo.anahi.testingapicallsretrofit.model.PhotoList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var retriever = PhotoRetriever()
        val callback = object : Callback<PhotoList> {
            override fun onFailure(call: Call<PhotoList>?, t: Throwable?) {
                var response : String = "You did it."
            }

            override fun onResponse(call: Call<PhotoList>?, response: Response<PhotoList>?) {
                var response : String = "It didn't work."
            }

        }

        retriever.getPhotos(callback)
    }
}
