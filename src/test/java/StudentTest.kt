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
        assertEquals("082253291430", student.getNoTelp("082253291430")
        )
    }

    @Test
    fun testGetNomorHPError(){
        val noHp = student.getNoTelp("0853")
        assertEquals(null, noHp)
    }

    @Test
    fun testGetOrangTuaSuccess(){
        val ortu = student.getorangTua()
        assertEquals("ayah: Stephen Sambura ibu: Stephani Sambruang", ortu)
    }

    @Test
    fun testNimSuccess() {
        assertEquals("9PRA13042002", student.getNim())
    }

    @Test
    fun testGetHobiSuccess(){
        val hobi = listOf("Bersepeda", "Bermain", "Menyanyi")
        assertEquals("[Bersepeda, Bermain, Menyanyi]", student.getHobi(hobi).toString())
    }

    @Test
    fun testFormatTanggalSuccess() {
        val tgl = "13 April 2002"
        assertEquals("13-04-2002", student.formatTanggal(tgl))
    }

    @Test
    fun testStudentArrayList() {
        val student = Student (9, "Putri", "13 Apiril 2002", "082253291430")
        assertEquals(student.getStudent, arrayListOf(student))
    }
}