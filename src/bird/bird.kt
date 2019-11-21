package bird

interface Biology {
    fun evolution()
    fun sexCheck(): Int
    var series: String
        get() = "Bird"
        @Deprecated("Wrong Setter!!") set(value) {
            series = value
        }
}

open class Bird(val age: Int) {
    protected var sex: Int = 0

    constructor(timeStamp: String) : this(DateTime(timeStamp))
    constructor(birth: DateTime) : this(getAgeByBirth(birth))
    constructor(age: Int, sex: Int) : this(age) {
        this.sex = sex
    }
}

class Penguin(val location: String, age: Int) : Bird(age), Biology {
    companion object {
        var isAlive: Boolean = true
        fun changeLive(): Boolean = !isAlive
    }

    override fun evolution() {
        TODO("not implemented") //To change body of created factorisations use File | Settings | File Templates.
    }

    override fun sexCheck(): Int {
        return sex
    }
}

fun getAgeByBirth(birth: DateTime): Int {
    return 2019 - birth.year
}

class DateTime(private val dateString: String) {
    private val dateList = dateString.split("/".toRegex())
    val year = dateList[0].toInt()
    val month = dateList[1].toInt()
    val day = dateList.last().toInt();
}

