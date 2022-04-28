class StudentRepository(var id:Int) {
    var nama: String = ""
    var tglLahir: String = ""
    var noHP: String = ""
    val studentRepository = StudentController(this.id, this.nama, this.tglLahir, this.noHP)

    fun studentRepositoryNama(): String {
        var id = this.id
        val nama: List<String> = listOf("Maulana Maulana", "Charles Phandurand", "Muhammad Alkausar")
        if (id in 1..3) this.nama = nama[id--]
        else return "id invalid"
        return nama[id]
    }

    fun studentRepositoryTglLahir(): String{
        var id = this.id
        val tglLahir: List<String> = listOf("29 Oktober 2002", "05 Februari 2002", "14 Juli 2002")
        if (id in 1..3) this.tglLahir = tglLahir[id--]
        else return "id invalid"
        return tglLahir[id]
    }

    fun studentRepositoryNoHP(): String{
        var id = this.id
        val noHP: List<String> = listOf("088811111111", "088822222222", "088833333333")
        if (id in 1..3) this.noHP = noHP[id--]
        else return "id invalid"
        return noHP[id]
    }

    fun studentRepositoryNIM(): String{
        val id = this.id
        val nama = studentRepositoryNama()
        val tglLahir = studentRepositoryTglLahir()
        if (id in 1..3) return studentRepository.getNIM(id, nama, tglLahir)
        else return "id invalid"
    }

    fun cetakInfoStudentRepository(): String {
        val id = this.id
        if (id in 1..3) return "Nama : ${studentRepositoryNama()}\nTanggal Lahir : ${studentRepositoryTglLahir()}\nNIM : ${studentRepositoryNIM()}\nNomor HP : ${studentRepositoryNoHP()}"
        else return "id invalid"
    }
}