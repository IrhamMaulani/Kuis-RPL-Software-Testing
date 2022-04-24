import java.util.*

fun main(args: Array<String>) {
    var student:Student =Student()
    println("Nama: ${student.nama}")
    println("ID: ${student.id}")
    println("Tanggal lahir : ${student.tanggal}")
    println("Nomor HP : ${student.nomor}")
    println("Tanggal Lahir setelah format: ${student.dateFormat()}")
    println("NIM : ${student.getNim()}")
    println("Hobi : ${student.tampilhobi()}")
    println("Ayah : ${student.Orangtua.ayah}")
    println("Ibu : ${student.Orangtua.ibu}")
}
