package com.rns.cupcakeapplication

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.rns.cupcakeapplication.viewModel.OrderViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

class ExampleUnitTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun quantity_six_cupcakes() {
        val viewModel = OrderViewModel()
        viewModel.quantity.observeForever {}
        viewModel.setQuantity(6)
        assertEquals(6, viewModel.quantity.value)
    }

    @Test
    fun price_six_cupcakes() {
        val viewModel = OrderViewModel()
        viewModel.price.observeForever {}
        viewModel.setQuantity(6)
        assertEquals("₪15.00", viewModel.price.value)
    }
}