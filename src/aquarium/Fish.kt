package aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int){

    init{
        println("first init block")
    }

    val size: Int = if(friendly){
        volumeNeeded
    }else{
        volumeNeeded * 2
    }
    init {
        println("constructed fish of siza $volumeNeeded final size is ${this.size}")
    }

    init {
        println("last init block")
    }
}

fun makeDefaultFish() = Fish(true,50)


fun fishExample(){
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}