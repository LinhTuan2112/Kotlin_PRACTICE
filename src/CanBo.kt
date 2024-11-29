open class CanBo(val hoTen: String, val tuoi: Int, val gioiTinh: String, val diaChi: String) {
    open fun hienThiThongTin() {
        println("Họ tên : $hoTen")
        println("Tuổi : $tuoi")
        println("Giới tính : $gioiTinh")
        println("Địa chỉ : $diaChi")
    }

    open fun thongTin() {
        println("Họ tên : $hoTen, Tuổi : $tuoi, Giới tính : $gioiTinh, Địa chỉ : $diaChi")

    }
}




