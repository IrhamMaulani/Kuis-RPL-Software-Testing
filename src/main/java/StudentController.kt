open class StudentController(id: Int, nama: String, tanggalLahir: String, noHP: String){
    val studentController = Student (id,nama,tanggalLahir,noHP)

    fun getIdentity(): List<String>  {
        return studentController.getFullIdentification()
    }

    fun getTglLahir(tglLahir: String): String {
        return studentController.formatTgl(tglLahir)
    }

    fun getNoHP(noHP:String): String {
        return studentController.getNoHP(noHP)
    }

    fun getNIM(id: Int, nama: String, tglLahir: String): String {
        return studentController.NIM(id, nama, tglLahir)
    }

    fun getHobi(): String {
        var index = this.studentController.id
        if(index in 0..2) return studentController.hobi[index]
        else return "hobi invalid"
    }

}