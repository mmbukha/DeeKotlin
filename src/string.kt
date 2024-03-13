fun main() {
    var greeting = "Hello world"
    var firstname = "Prous"
    var lastname = "Dee"

    println(firstname + " " + lastname) //String concatenation
    println(firstname.plus(lastname))

    println(greeting[6]) //Accesing an element in a string
    println(greeting.indexOf("world"))

    println(firstname.toUpperCase())

    println("Hello there.My name is $firstname") //String interpolation

}