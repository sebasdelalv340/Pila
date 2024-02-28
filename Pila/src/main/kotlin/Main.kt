fun main() {
    //Prueba con String
    val numbers = listOf("one", "two", "three", "four")
    val numbersRev: List<String> = reverse(numbers)

    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)


    //Prueba con Int
    val numeros = listOf(1, 2, 3, 4)
    val numerosRev: List<Any> = reverse(numeros)

    if (!listOf(4, 3, 2, 1).equals(numerosRev))
        println("Error")
    else
        println("Correcto")
    println(numerosRev)


    //Prueba con diferentes valores numéricos
    val numericos = listOf(1, 2f, 3.5, -4)
    val numericosRev: List<Any> = reverse(numeros)

    if (!listOf(-4, 3.5, 2f, 1).equals(numericosRev))
        println("Error")
    else
        println("Correcto")
    println(numericosRev)

    //Prueba con data class
    data class Persona(val nombre: String, val edad: Int)
    val persona1 = Persona("Juan", 30)
    val persona2 = Persona("María", 25)
    val persona3 = Persona("Pepa", 18)
    val persona4 = Persona("Rocío", 42)

    val personas = listOf(persona1, persona2, persona3, persona4)
    val personasRev: List<Any> = reverse(personas)

    if (!listOf(persona4, persona3, persona2, persona1).equals(personasRev))
        println("Error")
    else
        println("Correcto")
    println(personasRev)

    //Prueba con tipos de datos distintos
    val datos = listOf("uno", 3, 5.2, persona4, true)
    val datosRev: List<Any> = reverse(datos)

    if (!listOf(true, persona4, 5.2, 3, "uno").equals(datosRev))
        println("Error")
    else
        println("Correcto")
    println(datosRev)
}