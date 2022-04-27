import java.util.*

fun main(args: Array<String>) {
    var student1:Student = Student()
    student1.IDStudent = 3
    student1.nama = "Bachrul Uluum"
    student1.noHP = "0812345678999"
    student1.tanggalLahir = "02 Desember 2001"
    student1.nim = student1.generateNIM(student1.IDStudent,student1.nama, student1.tanggalLahir)
    println("Nama ${student1.nama}")
    println("No HP ${student1.noHP}")
    println("NIM ${student1.nim}")
    println("Tanggal Lahir ${student1.tanggalLahir}")
    println()
    
    var student2 = Student()
    student2.IDStudent = 4
    student2.nama = "Zhia Amirul Mukminin"
    student2.noHP = "081234567899"
    student2.tanggalLahir = "12 Agustus 2002"
    student2.nim = student2.generateNIM(student2.IDStudent,student2.nama, student2.tanggalLahir)
    println("Nama ${student2.nama}")
    println("No HP ${student2.noHP}")
    println("NIM ${student2.nim}")
    println("Tanggal Lahir ${student2.tanggalLahir}")
    println()

    var student3 = Student(5,"Dwi Nabela","10 September 2002","08123456799")
    student3.nim = student3.generateNIM(student3.IDStudent,student3.nama, student3.tanggalLahir)
    println("Nama ${student3.nama}")
    println("No HP ${student3.noHP}")
    println("NIM ${student3.nim}")
    println("Tanggal Lahir ${student3.tanggalLahir}")

}