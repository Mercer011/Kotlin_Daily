package Day7


class Constructors{
    var name: String
    var age: Int
    constructor(x: String, y:Int){
        this.name=x
        this.age=y
    }
    constructor(x:String){
        this.name=x
        this.age=21
    }
    constructor(){
        this.name="Abhishek"
        this.age=21
    }
    fun intro(){
        println("My name is $name and age is $age")
    }
}
fun main(){
    var a=Constructors("Chudail",22)
    a.intro()
    var b=Constructors()
    b.intro()
    var c=Constructors("Dumbbb")
    c.intro()
//    Constructors("Mujju",20)
}