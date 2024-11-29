class TamGiac(private val canh: IntArray): DaGiac(3, canh) {
    override fun chuVi(): Int {
        var chuVi = 0
        for (i in canh) {
            chuVi += i
        }
        return chuVi
    }
    fun dienTich(): Double {
        val p = chuVi() / 2.0
        val s = p * (p - canh[0]) * (p - canh[1]) * (p - canh[2])
        return if (s >= 0) Math.sqrt(s) else 0.0
    }
}