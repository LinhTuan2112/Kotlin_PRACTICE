//fun tongCacChuSo(n: Int): Int{
//    var so = n
//    var tong:Int = 0
//    while (so > 0) {
//        tong += so % 10
//        so /= 10
//    }
//    return tong
//}
//fun thuaSoNguyenTo() {
//    var n: Int
//    var s:String? = readln()
//    if (s!=null){
//        n=s.toInt()
//        println("Các thừa số nguyên tố của $n là:")
//        var i : Int = 2
//        while (i!=1) {
//            if (n % i == 0){
//                print("$i, ")
//                n/=i
//            }
//            else
//                i++
//        }
//        println()
//    }
//
//}
//
//fun lietKeUocSo(){
//    var n: Int
//    var s:String? = readln()
//    if(s!=null){
//        n=s.toInt()
//        print("Các ước số của $n là: ")
//        for (i in 1..n){
//            if (n % i == 0)
//                print("$i là ước số")
//        }
//        println()
//    }
//fun soNguyenTo(m:Int):Boolean{
//    if (m<2)
//        return false
//    for (i in 2 .. kotlin.math.sqrt(m.toDouble()).toInt() ){
//        if ( m % i == 0){
//            return false
//        }
//        return true
//    }
//}
//fun lietKeSNT(n:Int):Boolean{
//    for (i in 2 .. n/2){
//        if (n % i == 0){
//        return false
//        }
//    }
//    return true
//    }
//}
//fun main(args: Array<String>) {
//    while (true) {
//        try {
//            println("Hãy nhập 1 số nguyên dương: ")
//            var n: Int? = readLine()?.toInt()
//            if (n!= null) {
//                println("Vui lòng nhập số nguyên dương: ")
//                continue
//            }
//            println("Tổng các chữ số của $n là ${tongCacChuSo(n)} ")
//            println("Phân tích $n thành thừa số nguyên tố là ${thuaSoNguyenTo(n)}")
//            println("Các ước số của $n: ${lietKeUocSo(n)}")
//            println("")
//            break
//        } catch (e: Exception) {
//            println("Vui lòng nhập 1 số hợp lệ!")
//        }
//    }
//}