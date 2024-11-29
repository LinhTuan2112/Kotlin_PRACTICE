fun main(args: Array<String>) {
    val daGiac = DaGiac(4, intArrayOf(3, 4, 5, 6))
    val tamGiac = TamGiac(intArrayOf(5, 6, 7))

    tamGiac.dienTich()
    daGiac.inCacCanh()  // In ra các cạnh
    println("Chu vi của đa giác: ${daGiac.chuVi()}")  // In ra chu vi
    println("Chu vi của tam giác: ${tamGiac.chuVi()}")
    println("Diện tích của tam giác: ${tamGiac.dienTich()}")
    println("------------")

    println("Nhập vào số lượng tam giác: ")
    val n = readLine()?.toIntOrNull()?:0
    val danhSachTamGiac = ArrayList<TamGiac>()
    for (i in 1..n) {
        println("Nhập các cạnh của tam giác thứ $i (gồm 3 cạnh):")
        val canh = IntArray(3)
        for (j in 0..2) {
            print("Cạnh ${j + 1}: ")
            canh[j] = readLine()?.toIntOrNull() ?: 0
        }
        val tamGiac = TamGiac(canh)
        danhSachTamGiac.add(tamGiac)
    }
    println("\nDanh sách các tam giác:")
    println("STT | Cạnh 1 | Cạnh 2 | Cạnh 3 | Chu vi | Diện tích")
    for ((index, tamGiac) in danhSachTamGiac.withIndex()) {
        print("${index + 1}   | ")
        tamGiac.inCacCanh()
        println("Chu vi: ${tamGiac.chuVi()} | Diện tích: ${tamGiac.dienTich()}")
    }

}