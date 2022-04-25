fun main() {
    val student = Student(1, "Shrchse Lin", "21 Juni 1991","08932113121")
    println("Student Info : " + student.identity())
    println("Student Phone Number : " + student.getphoneNumber())
    println("Student Birthday reformat : " + student.getBirthday())
    println("Student Parent : " + Student.Parent("Loid Forger", "Siti Forger").show())
    student.setPhoneNumber("01223344556678")
    println("If Student Phone Number Exceed 12 : " +student.getphoneNumber())
    println("Generated Student NIM : " + student.generateNIM())
    println("Hobbies : " + student.hobbies())
}