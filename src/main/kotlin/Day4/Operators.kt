package Day4

fun main() {
    val a = 10
    val b = 9
    val c = a.plus(b)
    val d = a.minus(b)
    val e = a.rem(b)
    val f = a.div(b)
    val g = a.times(b)
    println("Sum is : $c")
    println("Subtraction is $d")
    println("Reminder is : $e")
    println("Division is : $f")
    println("Multiplication is : $g")
//    println(g)



    //comparison operators

    val isEqual = a ==b
    println("$a == $b: $isEqual")
    println("$a >$b:${a>b}")

    println(a.compareTo(b)>0)
    println(a.compareTo(b)<0)
    println(a.compareTo(b)>=0)
    println(a.compareTo(b)<=0)
    println(a?.equals(b)?:(b===null))


    //Assingment operators
//    println(a.plusAssign(b)>0)
    var n1 = 12
    val n2 = 5
//    println(n1+=n2)
    val x = true

    println(a.unaryPlus())
    println(a.unaryMinus())
    println(a.inc())
    println(a.dec())
    println(x.not())






    //Logical operators
//    val andRes = isTrue && isFalse
}