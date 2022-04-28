import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class StudentControllerTest {
    private lateinit var studentController: StudentController

    @BeforeEach
    fun beforeEach() {
        studentController = StudentController(22, "Felix Kjellberg", "22 Februari 2002", "081234567891")
    }

    @Test
    fun getStudentInfo(){
        assertEquals(listOf("22", "Felix Kjellberg", "22 Februari 2002", "081234567891"), studentController.getStudentInfo())
    }

    @Test
    fun getSnPhoneSuccess(){
        val student = studentController.getSnphone("081234567891")
        assertEquals("081234567891", student)
    }

    @Test
    fun getSnPhoneFailed(){
        val student = studentController.getSnphone("081234567891")
        assertEquals("Nomor Telepon Tidak Valid", student)
    }

    @Test
    fun getSbirthSuccess(){
        val birth = studentController.getSbirth("22 Februari 2002")
        assertEquals("22-01-2002", birth)
    }

    @Test
    fun getSNimSuccess(){
        val student = studentController.getNIM(22,"Felix Kjellberg","22 Februari 2002")
        assertEquals("22FK22022002", student)
    }

    @Test
    fun getHobbySuccess(){
        assertEquals("Makan", studentController.getHobi())
    }
}