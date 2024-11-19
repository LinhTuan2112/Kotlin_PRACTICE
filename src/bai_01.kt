fun main(args: Array<String>) {
    var result = mutableListOf<String>()
    for (i in 10..200) {
        if (i % 7 ==0 || i % 5 != 0 )
            result.add(i.toString())
    }
    println(result.joinToString(","))
}