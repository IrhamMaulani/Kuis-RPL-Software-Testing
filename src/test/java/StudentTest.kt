import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class StudentTest{
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach(){
        student = Student()
        student.stduentID = 1
        student.nama = "Joko Tarbiah"
        student.nomorHP = "080000000000"
        student.tanggalLahir = "10 Agustus 2019"
    }

    @Test
    fun tesNim() {
        val nim = student.nim
        assertEquals("1JK10082019", nim)
    }

    @Test
    fun testNoHP(){
        assertEquals("080000000000", student.nomorHP)
    }

    @Test
    fun testErrorNoHp()
    {
        student.nomorHP =  "080000"
        assertNotEquals("080000000000",student.nomorHP)
    }
    @Test
    fun testFormatTanggal(){
        val tanggal = "10 Agustus 2019"
        assertEquals("10-08-2019", student.formatTanggalLAhir(tanggal))
    }
}