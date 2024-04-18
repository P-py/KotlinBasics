//define functions
//[fun] (keyword) + [NAME():] [TYPE]{
// [BODY]
// }
fun getGreeting(): String{
    return "Hello World"
}
fun getGreetingV2() = "Hello World"
//Unit is used to work with functions where there is no return
//it's not needed
//fun sayGreeting(): Unit{ -> Redundant 'Unit' return type
fun sayGreeting(){
    println("Hello World!")
}
fun sayName(nameToSay: String){
    println("Hello there $nameToSay")
}
fun main(){
    println(getGreeting())
    println(getGreetingV2())
    //works the same way
    sayGreeting()
    sayName("Pedro")
}