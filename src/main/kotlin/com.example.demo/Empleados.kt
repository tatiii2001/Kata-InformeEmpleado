package com.example.demo

class Empleados {

    val employee1 = Empleado("Juan", 15)
    val employee2 = Empleado("Sepp", 18)
    val employee3 = Empleado("Nina", 17)
    val employee4 = Empleado("Mike", 51)

    private val instancias = mutableListOf<Empleado>(employee1, employee2, employee3, employee4)
    fun listEmployee() : List<Empleado>{
        return instancias.toList()
    }
//    fun addEmpleados(empleados : List<Empleado>){
//        for (empleado in empleados){
//            instancias.add(empleado)
//        }
//    }

    fun listAdultEmployee(): List<Empleado> {
        val adultEmployee = instancias.filter { it.age >= 18}
        return adultEmployee
    }

    fun orderListByName(): List<Empleado> {
        val orderName = listAdultEmployee().sortedBy { it.name }
        return orderName
    }

    fun upperCaseName(): List<Empleado> {
        val upperCase = listAdultEmployee().map { Empleado(it.name.uppercase(), it.age)}
        return upperCase
    }

    fun orderListByNameDes(): List<Empleado> {
        val orderDes = listAdultEmployee().sortedByDescending { it.name }
        return orderDes
    }
}