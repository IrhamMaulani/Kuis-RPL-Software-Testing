import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class StudentControllerTest {
    private lateinit var studentController: StudentController

    @BeforeEach
    fun beforeEach(){
        studentController = StudentController(
            2,"Ahmad Fulan","10 Agustus 2019", "082112341234"
        )
    }

    @Test
    fun getIdentitySuccess(){
        assertEquals(listOf("2", "Ahmad Fulan", "10 Agustus 2019", "082112341234"), studentController.getIdentity())
    }
    
     @Test
    fun getTanggalLahirSuccess(){
        assertEquals("10-08-2019",studentController.getTanggalLahir("10 Agustus 2019"))
    }

    @Test
    fun getNIMSuccess(){
        assertEquals("2AF10082019", studentController.getNIM(
            2,"Ahmad Fulan","10 Agustus 2019"))
    }
