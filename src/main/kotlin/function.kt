//val trick ={
//    println("Roshan is learnig")
//}
//val treat:()->Unit={
//    println(" Roshan will have treat")
//}
fun main(){
//    val trickFunction=trick
//    trick()
//    trickFunction()
//    treat()
    val treatFunction=trickOrtreat(false)
    val trickFunction=trickOrtreat(true)
    trickFunction()
    repeat(5){
        treatFunction()
    }


}
fun trickOrtreat(istrick: Boolean):()->Unit{
 if(istrick){
     return  trick
 }else{
     return treat
 }
}

val trick ={
    println("Roshan is learnig")
}
val treat:()->Unit={
    println(" Roshan will have treat")
}