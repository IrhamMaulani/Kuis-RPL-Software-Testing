class Controller (id: Int, name: String, birthday: String, phoneNumber: String){
    private val control = Student()
    private val controlParent = Student.Parent("Sukidesu", "Sukijan")

    fun getIdentity(): String {
        return control.identity()
    }

    fun getBirthday(): String {
        return control.getBirthday().toString()
    }

    fun getNim(): String {
        return control.generateNIM()
    }

    fun getHobbies(): String {
        return control.hobbies()
    }

    fun getParent(): String{
        return controlParent.show()
    }
}