import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach

internal class StudentTest {
  private lateinit var student: Student

    @BeforeEach
    fun beforeEach(){
        student = Student()
    }

    @Test
    fun testFullIdentificationSuccess() {
        val student = Student(2, "Ahmad Fulan", "10 Agustus 2019", "082112341234")
        assertEquals(listOf("2", "Ahmad Fulan", "10 Agustus 2019", "082112341234"), student.getFullIdentification())
    }

    @Test
    fun testGetNomorHpSuccess(){
        val noHp = student.getNomorHp("085312345678")
        assertEquals("085312345678", noHp)
    }

    @Test
    fun testGetNomorHPFailed(){
        val noHp = student.getNomorHp("0821")
        assertEquals(noHp,"Nomor tidak valid")
    }
}
