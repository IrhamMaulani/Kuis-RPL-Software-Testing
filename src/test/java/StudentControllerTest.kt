import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class StudentControllerTest {
    private lateinit var studentController: StudentController

    @BeforeEach
    fun beforeEach(){
        studentController = StudentController(
            5,"Joko Tarbiah","10 Agustus 2019", "085312345678"
        )
    }

    @Test
    fun getIdentitySuccess(){
        assertEquals(listOf("5", "Joko Tarbiah", "10 Agustus 2019", "085312345678"), studentController.getIdentity())
    }

    @Test
    fun getTanggalLahirSuccess(){
        assertEquals("10-08-2019",studentController.getTanggalLahir())
    }

    @Test
    fun getNIMSuccess(){
        assertEquals("5JT10082019", studentController.getNIM())
    }

    @Test
    fun getHobiSuccess(){
        val hobi = listOf("Bersepeda", "Menyanyi")
        assertEquals("Bersepeda, Menyanyi", studentController.getHobi(hobi))
    }
}