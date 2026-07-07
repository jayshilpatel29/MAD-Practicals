open class car(var model: String){

    var price: Double=100000.0

}
class suzuki(m:String):car( m){

constructor(m:String,p: Double):this(m)
{

}
}
fun main()
{
    val car = suzuki("alto")
    println(car.model)
    println(car.price)
}