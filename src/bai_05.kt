import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("Mời nhập vào hệ số a: ")
    var a:Double? = readLine()?.toDouble()
    println("Mời nhập vào hệ số b: ")
    var b:Double? = readLine()?.toDouble()
    println("Mời nhập vào hệ số c: ")
    var c:Double? = readLine()?.toDouble()
    if(a!=null && b!=null && c!=null){
        var delta = (b*b) - (4*a*c)
        if (delta < 0)
            println("Phương trình vô nghiệm")
        else if (delta == 0.0)
            println("Phương trình có nghiệm kép x1 = x2 = " + (-b/(2*a)))
        else {
            println("Phương trình có 2 nghiệm phân biệt")
            println("x1 = " +((-b + sqrt(delta))/(2*a)))
            println("x2 = " +((-b - sqrt(delta))/(2*a)))

        }
    }
}
