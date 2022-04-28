import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class StudentControllerTest {
    private lateinit var studentController: StudentController

    @BeforeEach
    fun beforeEach() {
        studentController = StudentController(1, "Maulana AlkaChar", "29 Oktober 2002", "082256401111")
    }

    @Test
    fun getFullIdentitySuccess(){
        assertEquals(listOf("1", "Maulana AlkaChar", "29 Oktober 2002", "082256401111"), studentController.getIdentity())
    }

    @Test
    fun getNoHPSuccess(){
        val pelajar = studentController.getNoHP("081234567890")
        assertEquals("081234567890", pelajar)
    }

    @Test
    fun getNoHPSuccess2(){
        val pelajar = studentController.getNoHP("0812340")
        assertEquals("Phone Number Invalid", pelajar)
    }

    @Test
    fun getTanggalLahirSuccess(){
        val tanggal = studentController.getTglLahir("11 November 2011")
        assertEquals("11-11-2011", tanggal)
    }

    @Test
    fun getNIMSuccess(){
        val pelajar = studentController.getNIM(2,"Maulana Okee","6 Januari 2010")
        assertEquals("2MO06012010", pelajar)
    }

    @Test
    fun getHobiSuccess(){
        assertEquals("Badminton", studentController.getHobi())
    }
}