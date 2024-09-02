package Day7

fun main() {
val myRec = Rectangle(4.0,5.8)
    myRec.display()
val sqr = square(9.0)
sqr.display()

}
open class Rectangle(val a:Double,val b :Double){
    fun area():Double{
        return a*b
    }
    open fun display(){
        println("area of rectangle is : ${area()}")
    }
}
class square(side:Double):Rectangle(side,side){
    override fun display() {
        println("area of the square is : ${area()}")
    }
}