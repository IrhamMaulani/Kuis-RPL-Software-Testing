import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Test

internal class StudentTest {
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach() {
        student = Student()
        student.nama = "Laily Zida"
        student.id = 3
        student.tanggalLahir = "15 Maret 2002"
        student.noHp = "12345678910"
    }

    @Test
    fun convertDate() {
        assertEquals("15-03-2002", student.convertDate(student.tanggalLahir))
    }

    @Test
    fun generateNIM() {
        assertEquals("3LZ15032002", student.generateNIM(student.id, student.nama, student.tanggalLahir))
    }

    @Test
    fun testNoHpFalse() {
        assertNotEquals("Phone Number Is Not Valid", student.setNumPhone(student.noHp))
        assertEquals("12345678910", student.setNumPhone(student.noHp))
    }
}