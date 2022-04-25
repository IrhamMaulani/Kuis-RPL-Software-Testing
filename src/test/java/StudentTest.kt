import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class StudentTest {
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach() {
        student = Student()
    }

    @Test
    fun testFormatNim() {
        assertEquals("5JT10082019", student.formatNim(5, "Joko Tai", "10-08-2019"))
    }

    @Test
    fun testing() {
        assertEquals("10-08-2019", student.formatTanggal("10 Agustus 2019"))
    }

    @Test
    fun Testnohp(){
        assertEquals("123456789101", student.formatNoHp("12345678910"))
    }
}