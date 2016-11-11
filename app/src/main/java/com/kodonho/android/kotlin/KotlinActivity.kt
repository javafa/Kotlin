package com.kodonho.android.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        sayHello("Kotlin")

        var btn = findViewById(R.id.button)
        btn.setOnClickListener { event->{} }
    }

    fun sayHello(str: String){
        println("hello "+str)
    }

    fun sum(a:Int, b:Int):Int{
        // val = final
        val a = 1
        val b = "abc"

        // var = 그냥변수
        var c = 3
        var d = "efg"
        c = 4

        // 타입특정
        var e:Int
        // 레퍼런스 자료형
        var f:String? // Null 값을 넣을 수 있다

        // 정수 Long, Int, Short, Byte
        // 실수 Double, Float
        // 문자 Char
        // 논리 Boolean

        return a+c
    }
}

open class MyClass{

}

interface MyInterface {

}