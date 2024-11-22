class CongNhan(hoTen:String, tuoi:Int, gioiTinh:String, diaChi:String, val bac:Int): CanBo(hoTen, tuoi, gioiTinh, diaChi) {
    init {
        require(bac in 1..10)
    }
    override fun hienThiThongTin() {
        super.hienThiThongTin()
        println("Bậc: $bac")
    }
}