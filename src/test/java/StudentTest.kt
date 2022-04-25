import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class StudentTest {
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach() {
        student = Student(9, "Putri Ridha Amalia", "13 April 2002", "082253292430")
    }

    @Test
    fun testGetNoTelpSuccess() {
        assertEquals("082253291430", student.getNoTelp()
        )
    }

    @Test
    fun testNimSuccess() {
        assertEquals("9PRA130420002", student.getNim())
    }

    @Test
    fun testFormatTanggalSuccess() {
        val tgl = "13 April 2002"
        assertEquals("13-04-2002", student.formatTanggal(tgl))
    }
}