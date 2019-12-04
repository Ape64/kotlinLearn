fun foo_1(x:Int):Int = x*50+30
fun main(args:Array<String>)
{
    var sum=5
    foo_1(11)
    listOf<Int>(1,2,3).filter{it>1}.forEach{
        sum+=it             //闭包内不只可以对外部访问还可以对外部修改,
    }
    println(sum)
    fun foo_2(x: Int):()->Unit{

        var y:Int=3
        val book:Book
        return fun()=println(x+sum+y)}//返回
    foo_2(10)()


}