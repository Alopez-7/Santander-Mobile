package s2

import kotlin.math.pow



const val PI = 3.146f
const val PHI = 1.618f
fun printAge(age:Int){
    println("tengo $age años")
}

fun printName(name:String){
    println("Me llamo $name")
}

fun circleArea(radius: Float):Float{
    return PI*radius.pow(2)
}

fun login(user:String,password:String):Boolean {
    fun validate(input: String): Boolean {
        if (input.isEmpty()) {
            return false

        }
        return true
    }

    val userValidated = validate(user)
    val passValidate = validate(password)
    return passValidate && userValidated
}

fun rectangleArea(height:Float,width:Float):Float{

    return height*width
}
fun rectangularPrismVolume(length:Float,height:Float,width:Float):Float {
    fun rectangleArea2(heightRec: Float, widthRec: Float): Float {
        var area = heightRec * widthRec
        return area
    }
    return rectangleArea2(length,height)*width
}

fun avgOfThree(num1:Float = 8F,num2:Float = 8F,num3:Float):Float{
    return ((num1+num2+num3)/3)
}
fun verifyAge(aged: Int){
    println("ingresa la edad: ")
    val aged = readLine()?.toInt()
    if (aged!! >= 18){
        println("Ya eres")
    }
    else{
        println("No eres")
    }
}

fun triangleName(l1:Int,l2:Int,l3:Int){
    if (l1 == l2 && l1==l3){
        println("Triangulo Equilatero")
    }
    else if((l1 == l2 && l3 !=l2)|| (l3 == l2 && l1 !=l2)||(l1 == l3 && l1 !=l2)){
        println("Triangulo Isoceles")
    }
    else{
        println("Triangulo Escalaeno")
    }

}
fun dataType(inData:Any){
    when(inData){
        is String -> println("Es string")
        is Int -> println("Es Int")
        is Double -> println("es Duoble")
        else -> println("no es ninguno")
    }
}

fun main() {
    var rad = 4f
    val area = circleArea(rad)
    println(area)
    printAge(23)
    printName("Alejandro")
    println(rectangleArea(2F,4F))
    println(rectangularPrismVolume(2F,4F,2F))
    println(avgOfThree(num3 = 5F))
    var age = 4
    //verifyAge(18)
    when(age) {
        0 -> println("A penas eres recién nacido!")
        1 -> println("Sólo tienes un año de edad")
        in 2..5-> println("Estás en preescolar")
        in 6..11 -> println("Estás en la primaria")
        in 12..14 -> println("Estás en secundaria")
        in 15..17 -> println("Estás en bachillerato")
        in 18..25 -> println("Estás en la universidad")
    }
    triangleName(2,3,1)
    dataType("pero")
        //var i = 0


    val nombres = listOf(
        "Kirby",
        "Ness",
        "Fox",
        "Luigi",
        "Mario",
        "Link",
        "Captain Falcon",
        "Samus",
        "Pikachu",
        "Jigglypuff",
        "Donkey Kong",
        "Yoshi"
    )

    //for (nombre in nombres){
      //  println(nombre)
    //}
    //nombres.forEach(){ println(it)}

   /* for(nombre in nombres){
        println(nombre)
        if(nombre=="Link"){
            println("Personaje encontrado")
            break
        }
    }*/
val names = listOf(
    "Pedro Luis",
    "Juan Manuel",
    "Juan Luis",
    "María Inés",
    "Romeo",
    "Ernesto",
    "Juan Pedro",
    "Ariadna",
    "Mireya María",
    "Ana Sofía",
    "José Juan",

)
    var x = 0

   // for(i to names.size()){

    //}
    println(x)
    fun countName(name: String): Int{
        var count = 0
        for(currentName in names){
            if(name in currentName){
                count++
            }
        }
        return count
    }
    println(countName("Juan"))

}




