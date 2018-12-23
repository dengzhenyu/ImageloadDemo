package com.example.demo.imageloaddemo

/**
 * Created by dengzhenyu on 2018/12/20
 * description :
 */
class Person(){
    constructor(name: String,age:Int):this()

    @JvmField val name: String="name"

    var age:Int = 0
        get() {
            return 1
        }

}