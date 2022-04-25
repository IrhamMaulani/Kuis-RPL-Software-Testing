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

    @Test
    fun testTanggal(){
        assertEquals("29-02-2020", student.formatTanggal(student.tglLhr))
    }

    @Test
    fun testNim(){
        assertEquals("69MF29022020", student.formatNim(student.id, student.nama, student.tglLhr))
    }

    @Test
    fun testNoHP(){
        assertEquals("0813579246",student.noHP)
    }

    @Test
    fun testNoHpFail(){
        student.noHP = "0813579246"
        assertEquals("No Hp Tidak Valid",student.noHP)
        assertNotEquals("0813579246",student.noHP)
    }
}