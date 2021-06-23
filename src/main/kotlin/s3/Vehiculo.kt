package s3

class Vehiculo(
    var color:String,
    val marca:String,
    val modelo:String,
    var placas: String

){
    init {
        println("""Los datos del coche son:
        marca: $marca
        modelo: $modelo
        color: $color""")
    }

    var encendido = false
    var gasolina = 0

    fun encender(){
        if (encendido == false){
            encendido = true
        }
    }
    fun apagar() {
        if (encendido == true) {
            encendido = false
        }
    }

    fun recargar(){
        println("Ingrese Litros a recargar: ")
        gasolina = readLine()!!.toInt();
    }
    fun getGasStatus(){
        println("El tanque tiene $gasolina Litros")

    }
    fun getStatus() {

        if (encendido) {
            println("El vehiculo está encendido, el tanque tiene $gasolina litros")
        }
        else{
            println("El vehiculo está apagado")
        }
    }

}