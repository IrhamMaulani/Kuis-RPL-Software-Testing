fun main(args: Array<String>) {
    val student1 = Student()
    student1.stduentID = 1
    student1.nama = "Joko Tarbiah"
    student1.nomorHP = "080000000000"
    student1.tanggalLahir = "10 Agustus 2019"
    student1.nim = student1.generateNIM(student1.stduentID,student1.nama, student1.tanggalLahir)
    println("Nama ${student1.nama}")
    println("No HP ${student1.nomorHP}")
    println("NIM ${student1.nim}")
    println("Tanggal Lahir ${student1.tanggalLahir}")
}