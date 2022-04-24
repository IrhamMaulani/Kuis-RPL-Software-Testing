import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class StudentTest{
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach(){
        student = Student()
        student.IDStudent = 4
        student.nama = "Dwi Nabela"
        student.noHP = "08123456799"
        student.tanggalLahir = "10 September 2002"
    }

    @Test
    fun tesNim() {
        val nim = student.nim
        assertEquals("4DN10092002", nim)
    }

    @Test
    fun testNoHP(){
        assertEquals("08123456799", student.noHP)
    }

    @Test
    fun testNoHpFail()
    {
        student.noHP =  "088812"
        assertNotEquals("08123456799",student.noHP)
    }
    @Test
    fun testKonversiTanggal(){
        val tanggal = "20 April 2022"
        assertEquals("10-08-2019", student.tanggal(tanggal))
    }
}