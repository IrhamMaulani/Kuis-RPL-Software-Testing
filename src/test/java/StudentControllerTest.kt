import org.junit.jupiter.api.BeforeEach

internal class StudentControllerTest {
    private lateinit var studentController: StudentController

    @BeforeEach
    fun beforeEach(){
        studentController = StudentController()
    }
}