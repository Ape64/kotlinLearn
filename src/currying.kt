fun main(args:Array<String>)
{
    fun add1(a:Int,b:Int,c:Int,d:Int,e:Int,f:Int)=a+b+c+d+e+f

    fun add2(a:Int)={
            b:Int->
                {c:Int->
                    {d:Int->
                        {e:Int->
                            {f:Int-> a+b+c+d+e+f}}}}}
    println(add1(1,2,3,4,5,6))
    println(add2(1)(2)(3)(4)(5)(6))
    fun out(block:()->Unit)
    {
        block()
    }
    out  {
        println("that's ♂ good")
    }
    fun curry(s:String,Block:(String)->Unit)
    {
        Block(s);
    }
    curry("aaaaaaaa")
    {
            s->
        println(s);
    }

}