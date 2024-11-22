class QLCB (private val size:Int) {
    private val dsCanBo:Array<CanBo?> = arrayOfNulls(size)
    private var slCanBo: Int = 0

    fun themCanBo(canBo: CanBo){
        if (slCanBo < size){
            dsCanBo[slCanBo] = canBo
            slCanBo++
            println("Đã thêm ${canBo.hienThiThongTin()} thành công")
        } else{
            println("Danh sách đã đầy, không thể thêm cán bộ.")
        }



    }
}