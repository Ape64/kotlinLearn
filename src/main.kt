import jdk.nashorn.internal.objects.NativeArray.forEach

class Book(val bookname:String, val year:Int)

fun main(args:Array<String>)
{
    fun foo(x:Int): ()-> Unit = {
        println(x)
    }
    listOf(1,2,3).forEach{
        foo(it)()}


    val fo= {
        x:Int
        ->
        println(x)
    }
    listOf(1,2,3).forEach{
        fo(it)}

}