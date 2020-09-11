package aquarium

fun main (args: Array<String>){
    buildAquarium()
}

fun buildAquarium(){
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length}cm " +
            "Width: ${myAquarium.width}cm " +
            "Height: ${myAquarium.height}cm ")

    myAquarium.height = 80

    println("Height: ${myAquarium.height}cm")
    println("Volume: ${myAquarium.volume}Liters")

    val smallAquarium = Aquarium(20,15,30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium 2: ${myAquarium2.volume} liters with " +
            "length: ${myAquarium2.length} "+
            "width: ${myAquarium2.width} "+
            "Height: ${myAquarium2.height} ")
}