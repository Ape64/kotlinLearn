import kotlin.math.PI

abstract class Button {
    abstract var clickNumber: Int        //Abstract Property
    abstract fun onClick()
    val buttonName: String = "Views"     //Specific Property
    fun getName() = println(buttonName)
}

//Implement a abstract class
class ViewButton : Button() {
    var isClick: Boolean = false
    override var clickNumber: Int = 0
        get() = clickNumber

    override fun onClick() {
        println("Click!")
        isClick = true
        clickNumber++
    }
}

//Using of Backing Field
class Human(age: Int) {
    var sex: String = " "
        get() = field
        set(value) {
            field = value
        }
}

//A simple case of enum
enum class Week(val day: Int) {
    MON(1),
    TUE(2),
    WEN(3),
    THU(4),
    FRI(5),
    SAT(6),
    SUN(7);

    fun getDayNumber() = day
}

//ADT: which achieved by sealed class, as a SUM type
sealed class Shape {
    class Circle(val radius: Double) : Shape()
    class Rectangle(val width: Double, val height: Double) : Shape()
    class Triangle(val base: Double, val height: Double) : Shape()
}

//Pattern Matching
fun getArea(shape: Shape): Double = when (shape) {
    is Shape.Circle -> PI * shape.radius * shape.radius
    is Shape.Rectangle -> shape.width * shape.height
    is Shape.Triangle -> shape.base + shape.height * 0.5
}

//How to deal with nested expressions with Pattern Matching
sealed class Expr {
    abstract fun isZero(v:Vistor):Boolean
    abstract fun isAddZero(v:Vistor):Boolean
    abstract fun simplifyExpr(v:Vistor)
    data class Num(val value: Int) : Expr()
    data class Operate(val operator: String, val left: Expr, val right: Expr) : Expr()
}

//TODO: To complete a Visitor class