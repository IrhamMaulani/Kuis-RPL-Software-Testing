import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class StudentTest {
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach() {
        student = Student()
        student.Sid = 22
        student.Sname = "Felix Kjellberg"
        student.Snphone = "081234567891"
        student.Sbirth = "22 Februari 2002"
    }

    @Test
    fun testFormatNim() {
        assertEquals("22FK22022002", student.formatNim(student.Sid, student.Sname, student.Sbirth))
    }

    @Test
    fun testNoHpFail(){
        assertEquals("081234567891", student.Snphone)
        assertNotEquals("Nomor Telepon Tidak Valid", student.Snphone)
    }

    @Test
    fun testDateFormat() {
        assertEquals("22-02-2002", student.formatTgl(student.Sbirth))
    }

    @Test
    fun testNoHP(){
        assertEquals("08135792468",student.Snphone)
    }
}
