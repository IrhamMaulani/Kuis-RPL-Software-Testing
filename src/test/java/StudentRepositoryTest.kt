import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

internal class StudentRepositoryTest {
    private lateinit var student: StudentRepository

    @BeforeEach
    fun beforeEach(){
        student = StudentRepository()
    }

}
