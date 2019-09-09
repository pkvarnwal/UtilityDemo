package com.example.utilitydemo

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.util.Patterns

object Utility {

    fun isValidEmail(email: String) = Patterns.EMAIL_ADDRESS.matcher(email).matches() // return true if email is valid

    fun isValidMobile(email: String) = Patterns.PHONE.matcher(email).matches() // return true if mobile is valid

    fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo

        return activeNetwork?.isConnectedOrConnecting ?: false

    }




}