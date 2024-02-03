


data class Product(var name: String, var price: Double){
  

}

fun main(){
    var iphone = Product("iPhone", 2000.0)
    var iphone2 = Product("iPhone", 2000.0)
    println(iphone)
    println(iphone == iphone2)  
}
