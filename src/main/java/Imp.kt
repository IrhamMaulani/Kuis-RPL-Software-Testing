fun main() {
    val student = Student()
    student.setId(2)
    student.setName("Shrchse Lin")
    student.setBirthday("21 Desember 1921")
    student.setPhoneNumber("091322110201")

    println("Student Info : " + student.identity())
    println("Student Phone Number : " + student.getphoneNumber())
    println("Student Birthday reformat : " + student.getBirthday())
    println("Student Parent : " + Student.Parent("Loid Forger", "Siti Forger").show())
    student.setPhoneNumber("01223344556678")
    println("If Student Phone Number Exceed 12 : " +student.getphoneNumber())
    println("Generated Student NIM : " + student.generateNIM())
    println("Hobbies : " + student.hobbies())
}