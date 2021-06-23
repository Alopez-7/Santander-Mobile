package s3

class Person {
    var nombre = ""
    var apellidos = ""
    var sexo = ""
    var altura = 0f
    constructor(nombre:String,apellidos:String,sexo:String,altura:Float){
        this.nombre = nombre
        this.apellidos = apellidos
        this.sexo = sexo
        this.altura = altura
        println("Nombre: $nombre $apellidos, Sexo: $sexo, Altura: $altura")
    }
    /*init {
        println("Nombre: $nombre $apellidos, Sexo: $sexo, Altura: $altura")
    }*/

}