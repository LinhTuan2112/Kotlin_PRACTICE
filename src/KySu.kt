class KySu(hoTen:String, tuoi:Int, gioiTinh:String, diaChi:String, val nganhDaoTao:String): CanBo(hoTen, tuoi, gioiTinh, diaChi) {
    override fun hienThiThongTin() {
        super.hienThiThongTin()
        println("Ngành đào tạo: $nganhDaoTao")
    }
}