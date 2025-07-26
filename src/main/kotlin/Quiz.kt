class Quiz<Generictype> (
    val question: String,
    val answer: Generictype,
    val dificulty: String
){
    override fun toString(): String {
        return "Question: $question\nAnswer: $answer\nDifficulty: $dificulty"
    }
}
fun main(){
    val instance1=Quiz<String>("Jai sri ________","Ram","Easy")
    val instance2=Quiz<Boolean>("Roshan is the very inconsistent Boy",true,"Easy")
    val instance3=Quiz<Int>("what is the age of roshan",23,"Hard")

    println(instance3)
    println(instance1)
    println(instance2)

}