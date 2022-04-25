import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Test

internal class StudentTest {
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach() {
        student = Student()
        student.nama = "Laily Zida"
        student.noHp = "08xxxxxxxxx"
        student.id = 3
        student.tanggalLahir = "15 Maret 2002"
    }

    @Test
    fun convertDate() {
        assertEquals("15-03-2002", student.convertDate(student.tanggalLahir))
    }

    @Test
    fun getNoHp() {
    }

    @Test
    fun setNoHp() {
    }

    @Test
    fun getOrtu() {
    }

    @Test
    fun setOrtu() {
    }

    @Test
    fun getHobi() {
    }

    @Test
    fun setHobi() {
    }

    @Test
    fun getNim() {
    }

    @Test
    fun setNim() {
    }

    @Test
    fun generateNIM() {
    }
}