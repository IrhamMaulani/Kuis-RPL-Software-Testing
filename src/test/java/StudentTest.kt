import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class StudentTest {
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach() {
        student = Student(5, "Toko Tarbiah", "10 Maret 2019", "08932123322")
    }

    @Test
    fun identity(){
        val expected = "5 Toko Tarbiah 10 Maret 2019 08932123322"
        assertEquals(expected, student.identity())
    }

    @Test
    fun phoneNumberSuccess(){
        student.setPhoneNumber("08932123322")
        val expected = "08932123322"
        assertEquals(expected, student.getphoneNumber())
    }

    @Test
    fun phoneNumberInvalid(){
        student.setPhoneNumber("0812345678910")
        val expected = "Number Invalid"
        assertEquals(expected, student.getphoneNumber())
    }

    @Test
    fun formatTest(){
        student.setBirthday("12 Juli 2001")
        val expected = "12-07-2001"
        assertEquals(expected, student.getBirthday())
    }

    @Test
    fun generateNIM() {
        student.setName("Shiraishi Kamisato")
        student.setId(2)
        val expected = "2SK10032019"
        assertEquals(expected, student.generateNIM())
    }

    @Test
    fun hobbies() {
    }
}