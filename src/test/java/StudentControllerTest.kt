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
