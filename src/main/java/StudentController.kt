class StudentController(Sid: Int, Sname: String, Sbirth: String, Snphone: String){
    val StudentController = Student(Sid,Sname,Sbirth,Snphone)

    fun getStudentInfo(): List<String>  {
        return StudentController.getStudentInfo()
    }

    fun getSbirth(Sbirth: String): String {
        return StudentController.formatTgl(Sbirth)
    }

    fun getSnphone(Snphone: String): String {
        return StudentController.getStudentNPhone(Snphone).toString()
    }

    fun getNIM(Sid: Int, Sname: String, Sbirth: String): String {
        return StudentController.formatNim(Sid, Sname, Sbirth)
    }

    fun getHobi(): String {
        var index = this.StudentController.Sid
        if(index in 0..2) return StudentController.hobby[index]
        else return "Hobi tidak ditemukan"
    }

}