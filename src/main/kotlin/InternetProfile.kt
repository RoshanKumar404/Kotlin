fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
       println("Name:$name")
        println("Age:$age")
        if (hobby!=null){
           print("Likes to play $hobby ")
            if (referrer!=null){
                println(", refered by  ${referrer.name} . ")
            }else{
                println(",has no refferer")
            }
        }
        println()
    }
}
