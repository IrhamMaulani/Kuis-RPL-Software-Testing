import java.util.*

fun main(args: Array<String>) {
    var student:Student =Student()
    student.id  = 6
    student.nama = "Albert Sanjaya"
    student.tanggal = "23 April 2001"
    student.nomorHp = "085347205189"
    student.nimId = student.getNim()

    println("Nama: ${student.nama}")
    println("ID: ${student.id}")
    println("Tanggal lahir : ${student.tanggal}")
    println("Nomor HP : ${student.nomorHp}")
    println("Tanggal Lahir setelah format: ${student.dateFormat()}")
    println("NIM : ${student.getNim()}")
    println("Hobi : ${student.tampilhobi()}")
    println("Ayah : ${student.Orangtua.ayah}")
    println("Ibu : ${student.Orangtua.ibu}")
}
