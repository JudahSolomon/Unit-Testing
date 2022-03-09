package com.anushka.circlecalc


import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito

class CalcViewModelTest{

    private lateinit var calcViewModel: CalcViewModel
    private lateinit var calculations: Calculations
    // adding instance task Rule to run all architecture
    // component related background jobs on the same thread
    
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()


    @Before
    fun setUp() {
        //setting up the result of the test case for the calculationArea
        // fun to return 13.8474 as the result when the the radius is 2.1
        calculations = Mockito.mock(calculations::class.java)
        Mockito. `when`(calculations.calculateArea(2.1)).thenReturn(13.8474)
        // constructing the calcViewModel instance
        calcViewModel = CalcViewModel(calculations)
    }

    @Test
    fun calculateArea_raduisSent_updateLiveData(){
        calcViewModel.calculateArea(2.1)

        val restul = calcViewModel.areaValue.value
        assertThat(restul).isEqualTo(13.8474)

    }
}