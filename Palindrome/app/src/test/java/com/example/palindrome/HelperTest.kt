package com.example.palindrome

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {
    private lateinit var helper: Helper

    @Before
    fun setup(){
        helper = Helper()
    }

    @Test
    fun isNotPalindrome() {
        val result = helper.isPalindrome("Hello")

        assertEquals(false,result)
    }

    @Test
    fun isPalindrome(){
        val result = helper.isPalindrome("abcba")

        assertEquals(true, result)
    }
}