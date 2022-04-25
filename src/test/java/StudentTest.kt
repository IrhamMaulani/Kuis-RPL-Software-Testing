import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


internal class StudentTest {
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach() {
        student = Student()
        student.id  = 6
        student.nama = "Albert Sanjaya"
        student.tanggal = "23 April 2001"
        student.nomorHp = "085347205189"
        student.nimId = student.getNim()
    }
    @Test
    fun testgetdate() {
        assertEquals("23-04-2001", student.dateFormat())
    }
    @Test
    fun testgetNim() {
        assertEquals("6AS23042001", student.getNim())
    }
    @Test
    fun testnohp() {
        assertEquals("085347205189", student.nomorHp)
    }
    @Test
    fun testayah() {
        assertEquals("stephen Kurniawan", student.Orangtua.ayah)
    }
    @Test
    fun testibu() {
        assertEquals("Stephani Kurniawati", student.Orangtua.ibu)
    }
    @Test
    fun testhobi() {
        assertEquals("Swimming, Basketball, Volleyball, Cooking, Running", student.tampilhobi())
    }
}
