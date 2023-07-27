package com.example.palindrome

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedHelperTest(val input : String, val expectedValue : Boolean ) {

    @Test
    fun parameterizedTest(){
        val helper = Helper()
        val result = helper.isPalindrome(input)

        assertEquals(expectedValue, result)
    }

    companion object{

        @JvmStatic
        @Parameterized.Parameters(name ="{index}: {0} is Palindrome - {1}")
        fun data(): List<Array<Any>>{
            return listOf(
                arrayOf("hello", false),
                arrayOf("abcba",true),
                arrayOf("level",true),
                arrayOf("a",true),
                arrayOf("",true)
            )
        }
    }
}