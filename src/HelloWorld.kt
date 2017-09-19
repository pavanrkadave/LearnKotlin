package demo

fun main(args : Array<String>){

    //Printing the String
    //{@val refers to immutable} or the value cannot be changed
    val myName = "Pavan"
    println("Hey There!! $myName \n")

    //Using the integer value
    //var value can be changed
    var bigInt : Int = Int.MAX_VALUE
    var smallInt : Int = Int.MIN_VALUE
    println("Biggest Integer is : " + bigInt)
    println("Smallest integer is : $smallInt \n")

    //using the float data type
    var bigFloat : Float = Float.MAX_VALUE
    var smallFloat : Float = Float.MIN_VALUE
    println("Biggest Float is : " + bigFloat)
    println("Smallest Float is : $smallFloat \n")

    //using Double data type
    var bigDouble : Double = Double.MAX_VALUE
    var smallDouble : Double = Double.MIN_VALUE
    println("Biggest Double is : " + bigDouble)
    println("Smallest Double is : $smallDouble \n")

    //using Long data type
    var bigLong : Long = Long.MAX_VALUE
    var smallLong : Long = Long.MIN_VALUE
    println("Biggest Long is : " + bigLong)
    println("Smallest Long is : $smallLong \n")

    //using Short data type
    var bigShort : Short = Short.MAX_VALUE
    var smallShort : Short = Short.MIN_VALUE
    println("Biggest Short is : " + bigShort)
    println("Smallest Short is : $smallShort \n")

    //using Byte data type
    var bigByte : Byte = Byte.MAX_VALUE
    var smallByte : Byte = Byte.MIN_VALUE
    println("Biggest Byte is : " + bigByte)
    println("Smallest Byte is : $smallByte \n")


}