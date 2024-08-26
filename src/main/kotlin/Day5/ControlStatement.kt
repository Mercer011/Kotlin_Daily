package Day5

fun main() {
    //if(condition){
// }//
//    val a = 100
//    val c = 69
//    val b = 21
//    if(a> b) print("Dhakkan")
//
//    var temp = 68
//
//    if(temp > 50)
//        println("Garam hai Garam hai")
//    else(println("Chale Chai pine"))
//
//
    val age = 11
    if (age < 13) {
        println("you are an Child")
    } else if (age <= 19 && age >= 13) {
        println("Teenager")
    } else {
        println("Aou are an Adult")
    }
    val score = 80
    if (score >= 90) {
        println("A")
    } else if (score >= 85) {
        //we can use ... to as score in (13...19){}

        println("B")
    } else if (score >= 70) {
        println("C")
    } else {
        println("D")

    }
    var x = "*"
    val q = 5
    val e = 4

    if (x == "+") {
        println("Result: ${q + e}")
    } else if (x == "-") {
        println("Result: ${q - e}")

    } else if (x == "/") {
        println("Result: ${q / e}")
    } else if (x == "*") {
        println("Result: ${q * e}")
    } else {
        println("Chal")
    }

}
