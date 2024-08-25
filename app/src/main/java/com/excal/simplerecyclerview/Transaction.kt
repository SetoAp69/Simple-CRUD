package com.excal.simplerecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Transaction(

    var targetName:String,
    var amount:Int,
    var date:String,
    var idGambar:Int

): Parcelable
