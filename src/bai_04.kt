import java.awt.PageAttributes.MediaType.A

fun main(args: Array<String>) {
    var n: Int = 0
    do {
        println("Nhập số lượng phần tử (n>0): ")
        var s: String? = readLine()
        if (s != null) {
            n = s.toInt()
            if (n <= 0) {
                println("Số phần tử không hợp lệ. ")
            }
        }
    } while (n <= 0)
    var M = IntArray(n)
    println("Nhập các phần tử của mảng (1 <= M[i] < 100): ")
    for (i in M.indices) {
        do {
            print("M[$i] =")
            M[i] = try {
                readLine()?.toIntOrNull() ?: -1 // nếu là null thì gán là -1
            } catch (e: NumberFormatException) {
                -1 // neesu không phải số hợp le thì gán là -1
            }
            if (M[i] <= 0 || M[i] >= 100) {
                println("Giá trị không hợp lệ, hãy nhập lại (1 <= M[i] < 100).")
            }
        } while (M[i] <= 0 || M[i] >= 100)
    }
    println("Mảng vừa nhập là: ${M.joinToString(", ")}")


    //Sắp xếp mảng theo thứ tự tăng dần
    M.sort()
    println("Mảng sau sắp xếp tăng dần là: ")
    for (i in M) {
        print("$i\t")
    }
    println()

    //Tìm phần tử lớn thứ nhất và thứ 2 trong mảng
    println("MAX = ${M.max()}")
    println("MAX2 = " + M[M.size - 2])
    //Nhập số nguyên x và chèn x vào mảng A sao cho mảng Á vẫn có tính tăng dần

    println("Nhập số nguyên x cần chèn vào mảng: ")
        var x:Int = 0
    do {
        var s: String? = readLine()
        if (s != null) {
            x = s.toIntOrNull() ?: -1
            if (x <= 0) {
                println("Số phần tử không hợp lệ. ")
            }
        }
    }while (x <= 0)
        var B = IntArray(M.size + 1)
        var inserted = false                    //kiem tra xem x dc chèn vào bảng chưa
        var j = 0
        for (i in M.indices) {
            if (!inserted && x <= M[i]) {
                B[j++] = x
                inserted = true                 //nếu chưa chèn và x<= phầntu trong mảng thì chèn x vào bảng và  đánh dấu là đã chèn
            }
            B[j++] = M[i]
        }
        if (!inserted) {
            B[j] = x                            // hết vòng lặp mà chưa dc chèn vào thì chèn vào cuối bảng vì x là lớn nhất 
        }
        println("Mảng sau khi chèn x = $x:")
        println(B.joinToString(", "))
}






