package s3

fun main(){
    val myPhone = Phone()

    myPhone.getTurn()
    myPhone.turnOn()
    myPhone.getTurn()

    val myPhone2 = Phone()

    myPhone2.getTurn()
    myPhone2.turnOn()
    myPhone2.getTurn()

    val myCar = Vehiculo("Rojo","Ford","Mustang","ABCDE123")
    myCar.encender()
    myCar.getStatus()
   // myCar.recargar()
    myCar.getGasStatus()
    println(myCar.marca)

    var person = Person("Alejandro","Lopez","Hombre",1.80f)
    var mario = Mario()
    for(i in 1..10){
        println("Tienes ${mario.getCurrentLives()} vidas")
        mario.collision("Goomba")
    }


}
