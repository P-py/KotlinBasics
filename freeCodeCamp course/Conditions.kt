var name: String? = "Pedro"

fun main(){
    //name = null
    if (name!=null){
        println(name)
    }
    when(name){
        null -> println("Name does not exist.")
        else -> println("Hi $name!")
    }
}