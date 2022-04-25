import kotlin.reflect.KProperty

class StudentController(id: Int, nama: String, tanggalLahir: String, nomorHp: String){
    val pelajar = Student(id,nama,tanggalLahir,nomorHp)


    fun getIdentity(): List<String> {
        return pelajar.getFullIdentification()
    }

    fun getTanggalLahir(): String {
        return pelajar.formatTanggal(pelajar.tanggalLahir)
    }

    fun getNIM(): String {
        return pelajar.NIM(pelajar.id, pelajar.nama, getTanggalLahir())
    }

    fun getHobi(hobi: List<String>): String {
        return pelajar.hobi(hobi).joinToString(", ")
    }
}
