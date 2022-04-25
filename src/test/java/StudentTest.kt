import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class StudentTest {
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach() {
        student = Student()
        student.id = 69
        student.nama = "Muhammad Fulan"
        student.noHP = "08135792468"
        student.tglLhr = "29 Februari 2020"
    }


}