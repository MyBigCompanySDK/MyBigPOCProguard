package com.mybigcompany.mybigsdk.component

import androidx.annotation.Keep
import com.mybigcompany.mybigsdk_core.viewmodels.MyBigViewModel
import com.mybigcompany.mybigsdk_core.viewmodels.MyBigVisibleViewModel

class MyBigComponent {
    private val myBigViewModel = MyBigViewModel()
    @Keep
    val myBigVisibleViewModel = MyBigVisibleViewModel()
    init {
        myBigViewModel.printAllMyBigData("FunctionCall in Component")
    }
    @Keep
    fun printMyBigData(tag: String){
        myBigViewModel.printAllMyBigData(tag)
    }
}