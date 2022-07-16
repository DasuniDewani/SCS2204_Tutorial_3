object Temperature extends App{
    def celsiusToFahrenheit(n:Double):Double = n * 1.8000 + 32

    print("Enter Tempreture in celsius degree: ")
    val C:Double  = scala.io.StdIn.readDouble()

    print(C+" celsius degree = " + celsiusToFahrenheit(C)+" Feranhite degree")
}