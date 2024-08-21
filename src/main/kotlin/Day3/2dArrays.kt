package Day3


fun main() {
//    Array of Intergers
    val numbers1 = arrayOf(1,2,3,4,5)

    val numbers2 = arrayOf(6,7,8,9,10)

    val numbers3 = arrayOf(numbers2,numbers1)

//    print(numbers3[1][4])

    val matrix: Array<Array<Int>> = arrayOf(numbers1,numbers2)
    println("element of row 0 col 1 : ${matrix[0][1]}")

}