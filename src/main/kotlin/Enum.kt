enum class Difficulty {
    EASY, MEDIUM, HARD
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
//object StudentProgress{
//    var total:Int=10
//    var Asnwered: Int=3
//}
class LearningCompanionClass{
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    companion object StudentProgress{
        var total:Int=10
        var Asnwered: Int=3
    }
}
val LearningCompanionClass.StudentProgress.progressText: String
    get()="$Asnwered of $total answered"
fun LearningCompanionClass.StudentProgress.PrintProgressBar(){
    repeat(LearningCompanionClass.Asnwered){print("▓")}
    repeat(LearningCompanionClass.total-LearningCompanionClass.Asnwered){print("▒")}
    println()
    println(LearningCompanionClass.progressText)
}

fun main() {
LearningCompanionClass.PrintProgressBar()
    //println(question3.toString())
    //println("${LearningCompanionClass.Asnwered} of ${LearningCompanionClass.total} answere.")
   // println(LearningCompanionClass.progressText)
}