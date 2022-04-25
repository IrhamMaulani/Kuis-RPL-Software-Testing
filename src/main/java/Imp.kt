fun main(args: Array<String>) {
    var student:Student = Student()
    println("ID: ${student.studentid}")
    println("Nama: ${student.nama}")
    println("Tanggal Lahir: ${student.tlahir}")
    println("Nomor HP: ${student.nohp}")
    println()
    println("Tanggal Lahir (reformat) : ${student.tanggal()}")
    println("Conditional Nomor HP : ${student.Phonenum()}")

    val ortu = Student.Orangtua()
    ortu.displayortu()
    print("Hobi : ")
    println("${student.arrayhobi()}")

    println("NIM : ${student.genNIM()}")

}
