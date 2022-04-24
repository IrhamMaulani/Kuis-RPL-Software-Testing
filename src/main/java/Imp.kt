import java.util.*

fun main(args: Array<String>) {
    var student:Student = Student()
    println("Nama ${student.nama}")
    println("NIM ${student.nim}")
    println("Tanggal Lahir ${student.tanggalLahir}")
    println("Orang tua")
    println("Ayah ${student.orangTua.ayah}")
    println("Ibu ${student.orangTua.ibu}")

}