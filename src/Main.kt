import com.sun.deploy.uitoolkit.ui.ConsoleWindow
import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary
import sun.invoke.empty.Empty
import java.io.Console

fun main(args: Array<String>) {
    var listIngredients:MutableList<String?> = mutableListOf<String?>()
    var book:MutableList<MutableList<String>> = mutableListOf()
    var recipe:MutableList<String> = mutableListOf()
    val vegetals = "1.Agua 2.Leche 3.Carne 4.Verduras 5.Frutas 6.Cereal 7.Huevos 8.Aceite"
    val menu = """:: Bienvenido a Recipe Maker ::

Selecciona la opción deseada
1. Hacer una receta
2. Ver mis recetas
3. Salir"""
    do {
        println(menu)
        var resposeKeyboard:String? = readLine()
        when(resposeKeyboard){
            "1"->{
                println("Seleccionar el nombre de la receta")
                do {
                    resposeKeyboard = readLine()
                    if(resposeKeyboard!!.isNotBlank()){
                        listIngredients.add(resposeKeyboard.capitalize())
                    }
                    while(resposeKeyboard!=null && resposeKeyboard.isNotBlank()){
                        println("Seleccione los ingredientes de la receta \"${listIngredients[listIngredients.lastIndex]}\"")
                        println(vegetals)
                        resposeKeyboard= readLine()!!.toLowerCase()
                        when(resposeKeyboard){
                            "agua",
                            "leche" ,
                            "carne" ,
                            "verduras",
                            "frutas",
                            "cereal",
                            "huevos",
                            "aceite"-> recipe.add(resposeKeyboard.capitalize())
                            ""-> resposeKeyboard=null
                            else -> {
                                println("Ingrese un ingrediente de la lista")
                            }
                        }
                    }
                    book.add(recipe)
                    recipe = mutableListOf()
                }while (resposeKeyboard!=null)


            }
            "2"->{
                for (i in listIngredients){
                    print("$i: ")

                        println(book[listIngredients.indexOf(i)])

                }
            }
        }

    }while(resposeKeyboard!="3")
}