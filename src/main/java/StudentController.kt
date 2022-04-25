open class StudentController(id: Int, nama: String, tanggalLahir: String, nomorHp: String){
    val pelajar = Student(id,nama,tanggalLahir,nomorHp)

    fun getIdentity(): List<String> {
        return pelajar.getFullIdentification()
    }

    fun getTanggalLahir(tanggalLahir: String): String {
        return pelajar.formatTanggal(tanggalLahir)
    }

    fun getNIM(id: Int, nama: String, tanggalLahir: String): String {
        return pelajar.NIM(id, nama, tanggalLahir)
    }

    fun getHobi(hobi: List<String>): String {
        return pelajar.hobi(hobi).joinToString(", ")
    }
}
