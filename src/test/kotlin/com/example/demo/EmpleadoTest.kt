package com.example.demo

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EmpleadoTest {

    val empleados = Empleados()


    @Test
    fun listAllEmployees() {
        val result = empleados.listEmployee()
        assertEquals("[Empleado{name : Juan, age : 15}, Empleado{name : Sepp, age : 18}, Empleado{name : Nina, age : 17}, Empleado{name : Mike, age : 51}]", result.toString())

    }

    @Test
    fun listAdultEmployees() {
        val result = empleados.listAdultEmployee()
        assertEquals("[Empleado{name : Sepp, age : 18}, Empleado{name : Mike, age : 51}]", result.toString())
    }

    @Test
    fun orderListByName() {
        val result = empleados.orderListByName()
        assertEquals("[Empleado{name : Mike, age : 51}, Empleado{name : Sepp, age : 18}]", result.toString())
    }

    @Test
    fun upperCaseName() {
        val result = empleados.upperCaseName()
        assertEquals("[Empleado{name : SEPP, age : 18}, Empleado{name : MIKE, age : 51}]", result.toString())
    }

    @Test
    fun orderListByNameDes() {
        val result = empleados.orderListByNameDes()
        assertEquals("[Empleado{name : Sepp, age : 18}, Empleado{name : Mike, age : 51}]", result.toString())
    }
}