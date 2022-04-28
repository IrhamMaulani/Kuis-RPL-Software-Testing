open class StudentViewModel (
    private val dataSource : Student
) {

    fun getId (id: Int): Int {
        return dataSource.id
    }

    fun getNama (nama: String): String {
        return dataSource.nama
    }

    fun getTanggalLahir(tanggalLahir: String): String {
        return  dataSource.formatTanggal(tanggalLahir)
    }

    fun getNoTelp(noTelp: String): String? {
        return  dataSource.getNoTelp(noTelp)
    }

    fun getOrangTua(s: String): String {
        return dataSource.getOrangTua()
    }

    fun getHobi(hobi: List<String>) : String {
        return dataSource.getHobi(hobi).joinToString(", ")
    }

    fun getNim(id: Int, nama: String, tglLahir: String) : String {
        return  dataSource.generateNim(id, nama, tglLahir )
    }

}


