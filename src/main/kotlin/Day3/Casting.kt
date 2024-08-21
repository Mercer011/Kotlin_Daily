package Day3

fun main() {

    var a = "Helloooo"
    val b :String = a as String
    println("Unsafe casting result : $b")

    val c  :Int = a as? Int
    println(c)
}