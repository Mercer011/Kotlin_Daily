package Day6

fun main() {

    val myarr1 = arrayOf(1,3,4,32,42,13,41,231,32,42)

    for(i in myarr1){///(i in 1..42) orrr
        print(i)
        println()
    }
    for(i in 42 downTo 1) print("${i} ")
    println()

//    for(i in 42 downTo 1 step 2)

    val myarr2 = arrayOf("superman","batman","deadpool")
    for(i in myarr2.indices) println("Heroes at index $i is : myarr2[$i]")

//    val max2 = myarr2.indices

//    print(max2)
}