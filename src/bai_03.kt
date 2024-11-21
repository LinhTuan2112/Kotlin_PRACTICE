fun main(args: Array<String>) {
    while (true)
    {
        var choose:Int;
        println("1. Tính tổng các chữ số của n")
        println("2. Phân tích n thành các thừa số nguyên tố")
        println("3. Liệt kê các ước số của n")
        println("4. Liệt kê các ước số là nguyên tố của n")
        println("0. Thoát")
        var s:String? = readLine();
        if(s!=null)
        {
            choose = s.toInt()
            when(choose)
            {
                1 -> tinhTong()
                2 -> phanTich()
                3 -> lietKe()
                4 -> lietKeSnt()
                else -> break
            }
        }
    }

}

fun tinhTong()
{
    var n:Int;
    var sum:Int = 0;
    var s:String? = readLine();
    if(s!=null)
    {
        n = s.toInt();
        while (n != 0)
        {
            sum+=n%10;
            n/=10;
        }
    }
    println("Tổng các chữ số của n là :$sum")
}
fun phanTich()
{
    var n:Int;
    var s:String? = readLine();
    if(s!=null)
    {
        n = s.toInt();
        print("Các thừa số nguyên tố của $n là: ")
        var i:Int = 2
        while (n != 1)
        {
            if(n%i==0)
            {
                print("$i, ")
                n/=i
            }
            else
                i++
        }
        println()
    }

}

fun lietKe()
{
    var n:Int;
    var s:String? = readLine();
    if(s!=null)
    {
        n = s.toInt();
        print("Các ước số của $n là: ")
        for(i in 1..n)
        {
            if(n%i==0)
            {
                print("$i,")
            }
        }
        println()
    }
}

fun lietKeSnt()
{
    var n:Int;
    var s:String? = readLine();
    if(s!=null)
    {
        n = s.toInt();
        print("Các ước số là số nguyên tố của của $n là: ")
        for(i in 1..n)
        {
            if(n%i==0 && checkSnt(i) == true)
            {
                print("$i,")
            }
        }
        println()

    }
}
fun checkSnt(n:Int): Boolean
{
    for(i in 2..n/2)
    {
        if(n%i==0)
            return false;
    }
    return true;
}