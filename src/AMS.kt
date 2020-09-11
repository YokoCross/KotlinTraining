import kotlin.random.Random

fun main (args: Array<String>){
    println(whatShouldIDOToday(readLine()!!, temperature = 40))
}

fun whatShouldIDOToday(mood: String, weather: String = "sunny", temperature:Int = 24): String{

    return when{
        mood=="happy" && weather=="sunny"-> "Go for a walk!"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read"
    }
}

fun canAddFish(tankSize: Double,
               currentFish: List<Int>,
               fishSize: Int = 2,
               hasDecoration: Boolean = true): Boolean {

    var totalFish: Int = 0

    for (fish in currentFish) totalFish += fish

    return if (hasDecoration) {
        tankSize - (totalFish.toDouble() + tankSize * 0.2) >= fishSize
    }
    else {
        tankSize - totalFish.toDouble() >= fishSize
    }

    //return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

/*
fun main (args: Array<String>){
    var fortune: String

    for (i in 1..10){
        fortune = getFortune(getBirthday())
        println("You fortune is $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getFortune(birthday: Int): String{
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends, because they are your greatest fortune.")

    return when(birthday){
        in 1..9 -> fortunes[0]
        in 10..15 -> fortunes[1]
        in 16..19 -> fortunes[2]
        in 21..23 -> fortunes[3]
        in 24..26 -> fortunes[4]
        in 27..29 -> fortunes[5]
        in 30..31 -> fortunes[6]
        else -> fortunes[birthday.rem(fortunes.size)]
    }

}

fun getBirthday(): Int {
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}
*/