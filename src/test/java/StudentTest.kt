import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class StudentTest{
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach(){
        student = Student()
    }

    @Test
    fun tesNim() {
        val nim = student.nim
        assertEquals("5JT10082019", nim)
    }

    @Test
    fun testKonversiTanggal(){
        val tanggal = "20 April 2022"
        assertEquals("10-08-2019", student.tanggal(tanggal))
    }
}