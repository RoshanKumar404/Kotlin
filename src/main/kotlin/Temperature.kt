fun main() {
  printFinalTemperature(initialMeasurement = 27.00, initialUnit = "celcius", finalUnit ="farenhit", conversionFormula = {celsius->(celsius*9/5)+32})
    printFinalTemperature(initialMeasurement = 100.00, initialUnit = "Fahrenheit", finalUnit = "Kelvin", conversionFormula = { Fahrenheit -> ((5.00/9.00)*(Fahrenheit-32)+273.25) })
    printFinalTemperature(initialMeasurement = 350.00, initialUnit = "Kelvin", finalUnit = "Celsius", conversionFormula = { Kelvin -> (Kelvin - 273.15) })
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {

    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
