
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
        assertEquals("6JT23042022", student.getNim())
    }
    @Test
    fun testnohp() {
        assertEquals("086753102945", student.noHp("086753102945"))
    }
    @Test
    fun testayah() {
        assertEquals("stephen Sambura", student.Orangtua.ayah)
    }
    @Test
    fun testibu() {
        assertEquals("Stephani Sambruang", student.Orangtua.ibu)
    }
    @Test
    fun testhobi() {
        assertEquals("Swimming, Basketball, Volleyball, Cooking, Running", student.tampilhobi())
    }
}
