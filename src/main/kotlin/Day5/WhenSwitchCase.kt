package Day5

fun main() {
    var monthNo = 5
    var month = when (monthNo) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Not a month"
    }
    println("Month of the Year is : ${month}")


    val num = 8
    when {
        num % 2 == 0 -> println("$num is an Even Number")

        num % 2 != 0 -> println("$num is Odd")

    }
}