//top-level variable
//global
val NAME: String = "Gabriel"
var GREETING: String = "Hello "

fun main(){
    //mutable variables -> var
    //local read-only variables -> val

    val name: String = "Pedro"
    //val (operator) name: VariableType = Value
    //name = "" -> error

    var name2: String = "Pedro"
    println(GREETING)
    println(name2)
    name2 = "Joao"
    GREETING = "Hi "
    println(GREETING)
    println(name2)

    //to assign null to a variable, we need to put the operator ?
    //after the string type in the declaration
    var name3: String? = null
    println(name3)
    name3 = "Luiz"
    println(name3)
}