
fun main(){

    val carro = Carro()
    carro.cor = "Azul"
    carro.abrirPorta()
    carro.marchas()
    println(carro.cor)

}

class Carro{

    var cor: String = "" //Atributo

    // Metodos
    // acao
    
    fun abrirPorta(){
        println("Abrir a porta do carro")
    }

    fun primeiraMarcha(){
        println("Passando a primeira marcha")
    }

    fun segundaMarcha(){
        println("Passando a segunda marcha")
    }

    fun marchas(){
        this.primeiraMarcha()
        this.segundaMarcha()
    }

}