package com.lukemi.kotlin.tips

import com.lukemi.kotlin.tip.tip1.JavaExample1
import com.lukemi.kotlin.tip.tip1.testString
import com.lukemi.kotlin.tip.tip1.testString3
import com.lukemi.kotlin.tip.tip11.alphabet
import com.lukemi.kotlin.tip.tip14.testOperator
import com.lukemi.kotlin.tip.tip16.testStrategy
import com.lukemi.kotlin.tip.tip3.printList
import com.lukemi.kotlin.tip.testAsMembers
import com.lukemi.kotlin.tip.tip5.testLateInit
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test00() {
        testString3()
    }

    @Test
    fun test01() {
        testString()
        val j = JavaExample1()
        j.testString1()
    }

    @Test
    fun test02() {
        printList()
    }

    @Test
    fun test03() {
        println(alphabet())
    }

    @Test
    fun test04() {
        "testRun".run {
            println("this = " + this)
            "ss"
        }.let { println(it) }
    }

    @Test
    fun test05() {
        testOperator()
    }

    @Test
    fun test06() {
        testStrategy()
    }

    @Test
    fun test07(){
        testAsMembers()
    }

    @Test
    fun test08(){
        testLateInit()
    }
}
