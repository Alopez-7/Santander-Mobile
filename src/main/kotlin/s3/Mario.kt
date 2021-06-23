package s3

class Mario(var vidas: Int =3){ //vamos a dejar setear el número de vidas al iniciar el objeto Mario

    init {
        println("It's a me! Mario!") //vamos a hacer que Mario se presente al construirlo!
    }

    private var state = "small" //mario es pequeño al iniciar el juego
    private var lives = 3 //uno empieza el juego con tres vidas
        set(value){
            when (field) {
                1 -> { //si teníamos una vida, se termina el juego
                    field = 0
                    gameOver()
                }
                0 -> { //si ya teníamos 0 vidas, no haz reiniciado el juego
                    println("Necesitas volver a jugar")
                }
                else -> {
                    field=value //podemos asignar el valor correctamente
                }
            }
        }
    private fun gameOver(){
        println("JUEGO TERMINADO")
    }

    //resta una vida al jugador
    private fun die(){
        //lives--
        println("Has perdido una vida!")
    }

    //el modificador public es redundante
    //en función del objeto colisionante, se ejecuta un evento
    public fun collision(collisionObj: String){
        when(collisionObj){
            "Goomba" -> lives--
            "Super Mushroom" -> state = "Super mario"
            "Fire flower" -> state = "Fire mario"
            else -> println("Objeto desconocido ¡no pasa nada!")

        }
    }
    fun getCurrentLives(): Int{
        return(lives)
    }
}
