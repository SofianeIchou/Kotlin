package com.example.frd.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Converter(
        val base: String = "",
        val amount: Double = 0.0,
        val result: Result = Result(1.0),
        val updated: String = "",
        val ms: Int = 0,
) : Parcelable


