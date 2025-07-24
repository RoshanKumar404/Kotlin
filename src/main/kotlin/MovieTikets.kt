fun main() {
    val childage = 5
    val adultAge = 28
    val seniorAge = 87

    val isMonday = true

    println("The movie ticket price for a person aged $childage is \$${ticketPrice(childage, isMonday)}.")
    println("The movie ticket price for a person aged $adultAge is \$${ticketPrice(adultAge, isMonday)}.")
    println("The movie ticket price for a person aged $seniorAge is \$${ticketPrice(seniorAge, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    val basePrice= when(age){
       in 13..60 ->25
        in 1..12 ->15
        in 61..98 ->35
        else -> 0
    }

    return  if (!isMonday)basePrice -1 else basePrice
}
