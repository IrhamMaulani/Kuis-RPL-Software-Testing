class StudentRepository() {
    var id: Int = 0
    lateinit var nama: String
    lateinit var tanggalLahir: String
    lateinit var nomorHp: String

    var student = StudentController(this.id, this.nama,this.tanggalLahir,this.nomorHp)


    fun studentRepoFindNama(id: Int): String {
        val nama = arrayListOf<String>(
            "Dayat Hassan",
            "Fadil Hidayat",
            "Ihsan Hidayat"
        )
        this.id = id
        return nama[id]
    }

    fun studentRepoFindTanggalLahir(id: Int): String{
        val tanggalLahir = arrayListOf<String>(
            "07 Mei 2002",
            "03 Januari 2002",
            "5 Febuari 2002"
        )
        return tanggalLahir[id]
    }

    fun studentRepoFindNomorHp(id: Int): String{
        val nomorHp = arrayListOf<String>(
            "085387654321",
            "085298765432",
            "087877889922"
        )
        return nomorHp[id]
    }

    fun studentRepoFindNIM(): String{
        return student.getNIM()
    }

    fun cetakInfoStudent(id: Int){
        val info = StudentRepository()

        println("Nama: " + info.studentRepoFindNama(id))
        println("Tanggal Lahir: " + info.studentRepoFindTanggalLahir(id))
        println("Nomor Hp: " + info.studentRepoFindNomorHp(id))
        println("NIM: " + info.studentRepoFindNIM())

    }
}
