fun main() {

    var languages = arrayOf("Kotlin","Java","Python")

    println(languages[1])

    // reassigning a value
    languages[1] = "PHP"
    println(languages[1])

    //Looping through an array
    for (lang in languages){
        println(lang)
    }
    if ("Kotlin" in languages){
        println("it exists")

        }
    else{
        println("Does not exist")
    }

}