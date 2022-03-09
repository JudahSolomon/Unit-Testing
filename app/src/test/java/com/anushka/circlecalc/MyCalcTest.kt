package com.anushka.circlecalc


import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class MyCalcTest {
    private lateinit var myCalc: MyCalc

    @Before
    fun setUp() {
        myCalc = MyCalc()

    }

    // creating an instance of the MyCalc Class

    @Test
    fun calculateCircumference_radiusGiven_returnCorrectResult() {

        //creating an isEqualTo assertion to check
        // whether the result will be equal to 13.188
        val result = myCalc.calculateCircumference(2.1)
        assertThat(result).isEqualTo(13.188)
    }

    @Test

    // writting another test fun to check if the value of the
    // circumference is zero if the radius is zero
    fun calculateCircumference_ZeroRadius_returnCorrectResult() {

        val retultOfZeroRadius = myCalc.calculateCircumference(0.0)
        assertThat(retultOfZeroRadius).isEqualTo(0.0)
    }

    // writing a test case for calculateArea of the circle if the radius is 24
    @Test
    fun calculateArea_areaGiven_returnCorrectResult() {
        val resultOfGivenArea = myCalc.calculateArea(24.0)
        assertThat(resultOfGivenArea).isEqualTo(1808.6399999999999)
    }

    //// writing a test case for calculateArea of the circle if the radius is 0

    @Test
    fun calculateArea_ZeroResult_returnCorrectResult(){
        val resultOfZeroRaduis = myCalc.calculateArea(0.0)
        assertThat(resultOfZeroRaduis).isEqualTo(0.0)

    }

}