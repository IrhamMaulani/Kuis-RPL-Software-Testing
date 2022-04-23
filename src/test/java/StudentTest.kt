
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


internal class StudentTest {
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach() {
        student = Student()
    }
    
    @Test
    fun testDateFormat() {
        assertEquals("23-04-2022", student.dateFormat())
    }

    @Test
    fun testgetNim() {
        assertEquals("6JT", student.getNim())
    }
}
