package Day7

class Person(var name : String, var age:Int){

    constructor(x:String):this()
    {
        this.name = x
        this.age = 0
    }
    constructor():this("rahul",20)

    fun intro(){
        println("My name is ${name} and my age is ${age}.")
    }
}

fun main() {

    var a = Person("Abhishek",21)
    var b = Person()

    var c = Person("Dumbbbb")
    c.intro()
    println()
}