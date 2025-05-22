//fun main() {
//    print("Enter the Total number")
//    val TotalNumber: Int = readln().toInt()
//    if (TotalNumber >= 80)
//        print("Good Student")
//    else if (TotalNumber >= 70)
//        print("Can do better")
//    else if (TotalNumber >= 60)
//        print("needs to do hard work")
//}



// we can use range based too

//fun main (){
//    print("enter the number plz")
//    val nu:Int= readln().toInt()
//
//    if(nu in 90..100){
//        println("has bright future")
//    }
//    else if( nu in 80..90){print("good future")
//     }
//    else if(nu in 70..80){
//    print("can do something better but will need very hard work")
//    }
//    else{
//        print("chhod de tu padhai")
//    }
//     }


// doning when  base same as case based

fun main()
{
    print("chal bhai number dalll")
    val marks =readln().toInt()
//    val grade: String = when (marks) {
//        in 89..99 -> "rw"   // ✅ This is a String
//        else -> "d"         // ✅ This is also a String
//    }
    val grade :String= when (marks){
       in 78..89->"hd"
        else->"fs"
    }
}