package com.example.demo

class Empleado(var name : String, var age : Int) {

    override fun toString(): String {
        return "Empleado{name : ${this.name}, age : ${this.age}}"
    }

//    lateinit var name : String
//    var age = 0

//    constructor(name : String, age : Int) : this() {
//        this.name = name
//        this.age = age
//        createInstancia(this)
//    }

//   companion object{
//       private val instancias = mutableListOf<Empleado>()
//       fun listEmployee() : List<Empleado>{
//           return instancias.toList()
//       }
//       fun createInstancia(empleado : Empleado){
//           instancias.add(empleado)
//       }
//
//       fun listAdultEmployee(): List<Empleado> {
//            val adultEmployee = instancias.filter { it.age >= 18}
//           return adultEmployee
//       }
//   }



}