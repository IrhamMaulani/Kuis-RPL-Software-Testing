import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class StudentTest {
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach() {
        student = Student(5, "Toko Tarbiah", "10 Maret 2019", "+62227814843")
    }

    @Test
    fun identity(){
        val expected = "5 Toko Tarbiah 10 Maret 2019 +62227814843"
        assertEquals(expected, student.identity())
    }

    @Test
    fun phoneNumberSuccess(){
        student.setPhoneNumber("+62227814843")
        val expected = "+62227814843"
        assertEquals(expected, student.getphoneNumber())
    }

    @Test
    fun phoneNumberFail(){
        student.setPhoneNumber("62227814843")
        val expected = "Number Invalid"
        assertEquals(expected, student.getphoneNumber())
    }

    @Test
    fun formatTest(){
        student.setBirthday("13 Agustus 2002")
        val expected = "13-08-2002"
        assertEquals(expected, student.getBirthday())
    }

    @Test
    fun parent(){
        val expected = "Nama Ayah, Nama Ibu"
        assertEquals(expected, parent.show())
    }

    @Test
    fun generateNIM() {
        student.setName("Alpha")
        student.setId(1)
        val expected = "123456789"
        assertEquals(expected, student.generateNIM())
    }

    @Test
    fun hobbies() {
    }

}