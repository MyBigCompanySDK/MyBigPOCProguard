package com.mybigcompany.mybigsdk_core.viewmodels

import android.util.Log
import androidx.annotation.Keep
import com.mybigcompany.mybigsdk_core.data.MyBigBigData
import com.mybigcompany.mybigsdk_core.data.MyBigData

@Keep
class MyBigVisibleViewModel {
    private val myBigBigData = MyBigBigData(
        MyBigData(
            "my big string 1",
            "my big string 2",
            "my big string 3",
            "my big string 4"
        )
    )

    init {
        printAllMyBigData("FunctionCall in MyBigViewModel")
    }

    fun printAllMyBigData(tag: String) {
        Log.d(
            tag,
            "${myBigBigData.myBigData.myBigVal1}, ${myBigBigData.myBigData.myBigVal4}, ${myBigBigData.myBigData.myBigVal3}, ${myBigBigData.myBigData.myBigVal2}"
        )
    }
}