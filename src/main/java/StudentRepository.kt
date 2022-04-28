class StudentRepository(var id: Int) {

    var nama: String = " "
    var tanggalLahir: String = " "
    var noTelp: String = " "

    var studentRepo = StudentViewModel(Student(this.id, this.nama, this.tanggalLahir, this.noTelp))

    fun repoNama(): String {
        var panggil = this.id
        panggil--
        val nama = arrayListOf<String>(
            "Aurel",
            "Firda",
            "Putri",
            "Ryan"
        )
        when(id) {
            in 1..4 -> this.nama = nama[panggil]
            else -> return "ID invalid"
            }
        return nama[panggil]
}
    fun repoTanggallahir(): String {
        var panggil = this.id
        panggil--
        val tanggalLahir = arrayListOf<String>(
            "31 Agustus 2002",
            "15 April 2002",
            "13 April 2002",
            "15 Maret 2002"
        )
        when(id) {
            in 1..4 -> this.tanggalLahir = tanggalLahir[panggil]
            else -> return "ID invalid"
        }
        return tanggalLahir[panggil]
    }

    fun repoNoTelp(): String {
        var panggil = this.id
        panggil--
        val noTelp = arrayListOf<String> (
            "082253271430",
            "082253281430",
            "082253291430",
            "082253301430"
        )
        when(id) {
            in 1..4 -> this.noTelp = noTelp[panggil]
            else -> return "ID invalid"
        }
        return noTelp[panggil]
    }

    fun repoNim(): String {
        var panggil = this.id

        when(id) {
            in 1..4 -> return studentRepo.getNim(
                panggil, repoNama(), repoTanggallahir()
            )
            else -> return "ID invalid"
        }
    }
}
