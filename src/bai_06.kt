fun main(args: Array<String>) {
    var cn = CongNhan("Trần Văn Bình", 35, "Nam", "Hà Nội", 5)
    var ks = KySu("Lê Hoàng Long", 27, "Nam", "Ninh Bình", "Khoa học máy tính")
    var nv = NhanVien("Nguyễn Thi Phương", 30, "Nữ", "Nghệ An", "Kế toán")

    println("Thông tin của công nhân: ")
    cn.hienThiThongTin()
    println()
    println("Thông tin của kỹ sư: ")
    ks.hienThiThongTin()
    println()
    println("Thông tin của nhân viên: ")
    nv.hienThiThongTin()
    println()

    val qlcb = QLCB(5)
    qlcb.themCanBo(CanBo("Trần Ngọc Minh Anh", 25, "Nữ", "Hải Phòng"))
    qlcb.themCanBo(CanBo("Lê Hải Yến", 26, "Nữ", "Hải Phòng"))
    qlcb.themCanBo(CanBo("Tạ Quốc Bảo", 28, "Nam", "Quảng Ninh"))
    qlcb.themCanBo(KySu("Nguyễn Xuân Mạnh", 30, "Nam", "Phú Thọ", "Khoa học máy tính"))
    qlcb.themCanBo(NhanVien("Trần Ngọc Lâm", 25, "Nam", "Hà Tĩnh", "Kiểm toán"))

    println()
    qlcb.timKiemCanBo("Lan")
    qlcb.timKiemCanBo("Bảo")

    println()

    qlcb.hienThiDanhSachCB()


}