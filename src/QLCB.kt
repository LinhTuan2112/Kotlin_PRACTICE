class QLCB (private val size:Int) {
    private val dsCanBo:Array<CanBo?> = arrayOfNulls(4)
    private var slCanBo: Int = 0

    fun themCanBo(canBo: CanBo){
        if (slCanBo < 4 ){
            dsCanBo[slCanBo] = canBo
            slCanBo++
            println("Đã thêm ${canBo.hoTen} thành công")
        } else{
            println("Danh sách đã đầy, không thể thêm cán bộ.")
        }
    }
    fun timKiemCanBo(hoTen: String){
        println("Kết quả tìm kiếm cho tên: $hoTen")
        var found = false
        for(i in 0 until slCanBo) {
            if (dsCanBo[i]?.hoTen?.contains(hoTen, ignoreCase = true) == true) {
                println(dsCanBo[i]?.hoTen)
                found = true
            }
        }
        if (!found) {
            println("Không tìm thấy ai có tên là $hoTen")
        }
    }
    fun hienThiDanhSachCB(){
        println("Hiển thị danh sách cán bộ sau khi thêm: ")
        if (slCanBo == 0) {
            println("Danh sách trống")
        }else{
            for (i in 0 until  slCanBo) {
                println("${i + 1}.${dsCanBo[i]?.thongTin()}")
            }
        }
    }
}