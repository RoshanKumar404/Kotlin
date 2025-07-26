import java.util.Scanner

class Quiz<Generictype> (
    val question: String,
    val answer: Generictype,
    val dificulty: String
){
//    override fun toString(): String {
//        return "Question: $question\nAnswer: $answer\nDifficulty: $dificulty"
//    }

    fun queAndAnswer(scanner: Scanner){
        println("Question : $question")
        print("Answer plzz : ")
        val userInput= scanner.nextLine()
        val isCorrect= when(answer){
            is String->userInput.trim().equals(answer as String, ignoreCase = true)
            is Boolean->userInput.trim().toBooleanStrictOrNull()==answer
            is Int-> userInput.trim().toIntOrNull()==answer
            else -> false
        }
        if (isCorrect) {
            println(" correct ")

        }else{
            println(" Incorrect, The Answer is $answer \n")
        }
    }
}
fun main(){
    val scanner = Scanner(System.`in`)
    val instance1=Quiz<String>("Jai sri ________","Ram","Easy")
    val instance2=Quiz<Boolean>("Roshan is the very inconsistent Boy (Boolean type)",true,"Easy")
    val instance3=Quiz<Int>("what is the age of roshan",23,"Hard")

//    println(instance3)
//    println(instance1)
//    println(instance2)
    val  quizes= listOf(instance3,instance2,instance1)
    for (quiz in quizes){
        quiz.queAndAnswer(scanner)
    }
    println(" All Done ...")

}