package spices

fun main(args: Array<String>){
    buildSpice()
}

fun buildSpice(){
    val mySpice = SimpleSpice()

    println("Name: ${mySpice.name} \n" +
            "Heat: ${mySpice.heat}")

    val spices1 = listOf(
            Spice("curry", "mild"),
            Spice("pepper", "medium"),
            Spice("cayenne", "spicy"),
            Spice("ginger", "mild"),
            Spice("red curry", "medium"),
            Spice("green curry", "mild"),
            Spice("hot pepper", "extremely spicy")
    )

    val spiceList = spices1.filter { it.heat < 5 }

    for( i in spiceList) print("${i.name} / ${i.spiciness} / ${i.heat} / ")
}