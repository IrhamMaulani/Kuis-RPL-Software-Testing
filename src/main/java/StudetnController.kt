class StudetnController(studentid: Int, nama: String, tlahir: String, nohp: String, nim: String) {
    val maha = Student()

    fun getIdentitas(): String {
        return maha.getStudentDetails()
    }

    fun getTanggalLahir(): String? {
        return maha.tanggal()
    }

    fun getNIM(): String {
        return maha.genNIM()
    }

    fun getHobi(hobi: List<String>) {
        return maha.arrayhobi()
    }
}