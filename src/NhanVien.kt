class NhanVien(hoTen:String, tuoi:Int, gioiTinh:String, diaChi:String, val congViec:String): CanBo(hoTen, tuoi, gioiTinh, diaChi) {
    override fun hienThiThongTin() {
        super.hienThiThongTin()
        println("Công việc: $congViec")
    }
}