import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

open class StudentRepositoryTest {
    private lateinit var student: StudentRepository

    @BeforeEach
    fun beforeEach() {
        student = StudentRepository(1)
    }

    @Test
    fun testCariNamaSuccess(){
        val student = StudentRepository(1)
        assertEquals("Maulana Maulana", student.studentRepositoryNama())
    }

    @Test
    fun testCariNamaFailed(){
        val student = StudentRepository(4)
        assertEquals("id invalid",student.studentRepositoryNama(), )
    }

    @Test
    fun testCariTanggalLahirSuccess(){
        val student = StudentRepository(1)
        assertEquals("29 Oktober 2002", student.studentRepositoryTglLahir())
    }

    @Test
    fun testCariTanggalLahirFailed(){
        val student = StudentRepository(4)
        assertEquals("id invalid", student.studentRepositoryTglLahir())
    }

    @Test
    fun testCaridNoHPSuccess(){
        val student = StudentRepository(1)
        assertEquals("088811111111", student.studentRepositoryNoHP())
    }

    @Test
    fun testCariNoHPFailed(){
        val student = StudentRepository(4)
        assertEquals("id invalid", student.studentRepositoryNoHP())
    }

    @Test
    fun testCariNIMSuccess(){
        val student = StudentRepository(1)
        assertEquals("1MM29102002", student.studentRepositoryNIM())
    }

    @Test
    fun testCariNIMFailed(){
        val student = StudentRepository(4)
        assertEquals("id invalid", student.studentRepositoryNIM())
    }

    @Test
    fun testCetakInfoStudentSuccess(){
        val student = StudentRepository(1)
        assertEquals("Nama : Maulana Maulana\nTanggal Lahir : 29 Oktober 2002\nNIM : 1MM29102002\nNomor HP : 088811111111", student.cetakInfoStudentRepository())
    }
}