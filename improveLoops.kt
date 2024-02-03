
val fruits = listOf("Apple", "Banana", "Cherry", "Durian")

fun main() {
    // for (index in 0 until fruits.size) {
    //     val fruit = fruits[index]
    //     println("$index: $fruit")
    // }
    
    // outra forma, melhor que a primeira
    // for (index in fruits.indices) {
    //     val fruit = fruits[index]
    //     println("$index: $fruit")
    // }

    // outra forma, melhor que todas em cima
    for ((index, fruit) in fruits.withIndex()){
        println("$index: $fruit")
    }

    // === forEach 
    fruits.forEachIndexed { index, fruit -> 
        println("$index: $fruit")
    }
  

}
