class StudentController(studentid: Int, nama: String, tlahir: String, nohp: String, nim: String) {
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

    fun getHobi(hobi: List<String>): String {
        return maha.arrayhobi()
    }
}
