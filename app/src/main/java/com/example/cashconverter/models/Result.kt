package com.example.frd.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Result(
    val USD: Double = 0.0 ,
    val rate: Double = 0.0 ,
) : Parcelable
