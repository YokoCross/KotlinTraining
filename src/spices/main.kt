package spices

fun main(args: Array<String>){
    buildSpice()
}

fun buildSpice(){
    val mySpice = SimpleSpice()

    println("Name: ${mySpice.name} \n" +
            "Heat: ${mySpice.heat}")
}