import kotlin.math.sqrt

fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2 .. sqrt(n.toDouble()).toInt()){
        if (n % i == 0) return false
    }
        return true
        }
fun listFibonacciPrime (n: Int) {
    var a = 0
    var b = 1
    println("Các số Fibonacci nhỏ hơn $n là số nguyên tố: ")
    while (a < n) {
       if(isPrime(a)) {
           print("$a,")
       }
        var temp = a + b
        a = b
        b = temp
    }
}
fun main(args: Array<String>) {

    println("Nhập 1 số nguyên dương n: ")
    val s = readLine()?.toIntOrNull()
    if (s == null || s <= 0) {
        println("Vui lòng nhập một số nguyên dương!")
    } else {
        listFibonacciPrime(s)
    }

}



