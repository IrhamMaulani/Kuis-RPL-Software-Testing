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

fun main() {
    val student1 = StudentController(5,"Joko Tarbiah","10 Agustus 2019", "085312345678")
    student1.getIdentity()
    println("Tanggal Lahir: ${student1.getTanggalLahir()}")
    println("NIM: ${student1.getNIM()}")
    println("Hobi: ${student1.getHobi(listOf("Hobi1", "Hobi2", "hobi3"))}")
}
