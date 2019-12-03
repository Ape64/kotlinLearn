fun main() {
    val a:String="I am Kotlin"
    val string = "I am Kotlin"
    val int=1234
    val long=1314L
    val float=13.14f
    val double =13.14
    println(int.javaClass.name)
    val book=Book("I am java") //line 32
    book.name="Diving into Kotlin"
    book.printName()
    count(1) //line38
}

//Code block function body
fun sum(x:Int,y:Int):Int{return x+y}

//Expression function body
fun sum1(x:Int,y:Int)=x+y

fun foo(x:Int):Int=if(x==0) 1 else x * foo(x-1)

/*You can't change the reference with val declaration.
For example
val x=intArrayof(1,2,3)
x=intArrayof(2,3,4)
But you can change the value
For example
x[0]=2
println(x[0])
 */

class Book(var name:String){
    fun printName(){
        println(this.name)
    }
}

fun count(x:Int){
    val a:Int
    a = 1
    println(x + a)
}

fun cal(list:list<Int>):Int{
    var res=0
    for(el in list){
        res*=el
        res+=el
    }
    return res
}

fun function(x:Int){
    fun double(y: Int):Int{
        return y*2
    }
    println(double(x))
}

data class Country(
    val name:String,
    val continient:String,
    val population:Int
    )
    class  ContryApp{
        fun filterCountries(countries:List<Country>,continient: String,population: Int):List<Country>{
            val res= mutableListOf<Country>()
            for (c in countries){
                if(c.continient==continient&&c.population==population){
                    res.add(c)
                }
            }
            return res
    }
    class CountryTest{
        fun isBigEuropeanCountry(country:Country):Boolean{
            return country.continient=="EU"&&country.population>10000
        }
    }
}