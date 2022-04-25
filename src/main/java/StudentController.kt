open class StudentController(id: Int, nama: String, tglLahir: String, noHp: String){
  val student = Student(id,nama,tglLahir,noHp)
  
  fun getIdentity(): List<String> {
    return student.getFullIdentification()
  }
  
  fun getTanggalLahir(tglLahir: String): String {
    return student.formatTanggal(tglLahir)
  }
  
  fun getNIM(id: Int, nama: String, tglLahir: String): String {
    return student.NIM(id, nama, tglLahir)
  }
  
  fun getHobi(hobi: List<String>): String {
    return student.hobi(hobi).joinToString(", ")
  }
}
