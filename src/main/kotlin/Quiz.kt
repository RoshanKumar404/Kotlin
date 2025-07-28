import java.util.Scanner

class Quiz<Generictype>(
    val question: String,
    val answer: Generictype,
    val dificulty: String
) {
    //    override fun toString(): String {
//        return "Question: $question\nAnswer: $answer\nDifficulty: $dificulty"
//    }
    companion object StudentProgress {
        var total: Int = 0
        var Asnwered: Int = 0
        val progressText: String
            get() = "$Asnwered/$total Answered correctly ."
    }


    fun queAndAnswer(scanner: Scanner) {
        println("Question : $question")
        print("Answer plzz : ")
        val userInput = scanner.nextLine()
        val isCorrect = when (answer) {
            is String -> userInput.trim().equals(answer as String, ignoreCase = true)
            is Boolean -> userInput.trim().toBooleanStrictOrNull() == answer
            is Int -> userInput.trim().toIntOrNull() == answer
            else -> false
        }
        if (isCorrect) {
            println(" correct ")
            Asnwered++

        } else {
            println(" Incorrect, The Answer is $answer \n")
        }
        gPrintProgressBar()

    }
}

fun Quiz.StudentProgress.gPrintProgressBar() {
    repeat(Asnwered) { print("▓") }
    repeat(total - Asnwered) { print("▒") }
    println()
    println(Quiz.progressText)
}

fun main() {
    val scanner = Scanner(System.`in`)
    val Questions=listOf(
        Quiz<Boolean>("Roshan is the very inconsistent Boy (Boolean type)", true, "Easy"),
                Quiz<Int>("what is the age of roshan", 23, "Hard"),
                Quiz<String>("Jai Sri ___", "ram", "Medium"),
        Quiz<Int>("what is the salary of roshan", 0, "Hard")

    )
    Quiz.total=Questions.size

//    val instance1 =
//    val instance2 =
//    val instance3 =

//    println(instance3)
//    println(instance1)
//    println(instance2)
    //val quizes = listOf(instance3, instance2, instance1)
    for (quiz in Questions) {
        quiz.queAndAnswer(scanner)
    }
    println(" All Done ...")

}