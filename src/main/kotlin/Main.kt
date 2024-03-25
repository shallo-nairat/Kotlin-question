fun main() {
    println(calculate(arrayOf(80,10,20,90)).contentToString())
    volume(40.5)
    println( myNumbers(arrayOf(40,30)).contentToString())
}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.
fun calculate (value:Array<Int>):Array <Any>{
    return  arrayOf(value.sum(),value.average(),value.count())
}
//The volume of a sphere is calculated using the formula below
//
//V = 4/3 π r
//3
//
//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π
fun volume(radius:Double) {
    val volume = 4 / 3 * 3.14159 * (radius * 3)
    println(volume)
}
fun myNumbers(number:Array<Int>):Array<Int>{
    return arrayOf(number.sum())
}