class StudentRepository(var id: Int) {
    var nama: String = ""
    var tanggalLahir: String = ""
    var nomorHp: String = ""

    var student = StudentController(this.id, this.nama, this.tanggalLahir, this.nomorHp)


    fun studentRepoFindNama(): String {
        var temp = this.id
        temp--
        val nama = mutableListOf<String>(
            "Dayat Hassan",
            "Fadil Hidayat",
            "Ihsan Hidayat"
        )
        if (id in 1..3)
            this.nama = nama[temp]
        else
            return "Tidak ada id seperti itu (hanya ada 1 - 3)"

        return nama[temp]
    }

    fun studentRepoFindTanggalLahir(): String{
        var temp = this.id
        temp--
        val tanggalLahir = arrayListOf<String>(
            "07 Mei 2002",
            "03 Januari 2002",
            "10 Febuari 2002"
        )
        if (id in 1..3)
            this.tanggalLahir = tanggalLahir[temp]
        else
            return "Tidak ada id seperti itu (hanya ada 1 - 3)"

        return tanggalLahir[temp]
    }

    fun studentRepoFindNomorHp(): String{
        var temp = this.id
        temp--
        val nomorHp = arrayListOf<String>(
            "085387654321",
            "085298765432",
            "087877889922"
        )
        if (id in 1..3)
            this.nomorHp= nomorHp[temp]
        else
            return "Tidak ada id seperti itu (hanya ada 1 - 3)"

        return nomorHp[temp]
    }

    fun studentRepoFindNIM(): String{
        val temp = this.id
        if (temp in 1..3) {
            return student.getNIM(
                temp,
                studentRepoFindNama(),
                studentRepoFindTanggalLahir()
            )
        }
        else
            return "Tidak ada id seperti itu (hanya ada 1 - 3)"

    }

    fun cetakInfoStudent(id: Int): String {
        val info = StudentRepository(id)
        return "Nama: ${info.studentRepoFindNama()}/n" +
                "Tanggal Lahir: ${info.studentRepoFindTanggalLahir()}/n" +
                "Nomor Hp: ${info.studentRepoFindNomorHp()}/n" +
                "NIM: ${info.studentRepoFindNIM()}"
    }
}
