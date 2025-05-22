fun main() {
    print("Enter the Total number")
    val TotalNumber: Int = readln().toInt()
    if (TotalNumber >= 80)
        print("Good Student")
    else if (TotalNumber >= 70)
        print("Can do better")
    else if (TotalNumber >= 60)
        print("needs to do hard work")
}