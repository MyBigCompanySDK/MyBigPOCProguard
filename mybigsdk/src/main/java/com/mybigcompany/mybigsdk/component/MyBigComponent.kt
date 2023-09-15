package com.mybigcompany.mybigsdk.component

import com.mybigcompany.mybigsdk_core.viewmodels.MyBigViewModel

class MyBigComponent {
    private val myBigViewModel = MyBigViewModel()
    init {
        myBigViewModel.printAllMyBigData("FunctionCall in Component")
    }

    fun printMyBigData(tag: String){
        myBigViewModel.printAllMyBigData(tag)
    }
}