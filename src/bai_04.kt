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
    }while (n<=0)
        var M = IntArray(n)
        println("Nhập các phần tử của mảng (1 <= M[i] < 100): ")
        for (i in M.indices) {
            do {
                print("M[$i] =")
                M[i] = try {
                    readLine()?.toIntOrNull() ?: -1 // nếu là null thì gán là -1
                } catch (e:NumberFormatException){
                    -1 // neesu không phải số hợp le thì gán là -1
                }
                if (M[i] <= 0 || M[i] >= 100) {
                    println("Giá trị không hợp lệ, hãy nhập lại (1 <= M[i] < 100).")
                }
            } while (M[i] <= 0 || M[i] >= 100)
        }
        println("Mảng vừa nhập là: ${M.joinToString(", ")}")
    //Tìm phần tử lớn thứ nhất và thứ 2 trong mảng
    

    //Sắp xếp mảng theo thứ tự tăng dần
        M.sort()
        println("Mảng sau sắp xếp tăng dần là: ")
        for (i in M) {
            print("$i\t")
        }
        println()
    }






