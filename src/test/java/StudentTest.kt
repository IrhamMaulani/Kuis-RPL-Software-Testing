import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class StudentTest {
    private lateinit var student: Student
    private lateinit var ortu: OrangTua

    @BeforeEach
    fun beforeEach() {
        student = Student(5, "Joko Tarbiah", "10 Agustus 2019", "08932123322")
        ortu = OrangTua("Bapaknya Joko Stephen Sambura", "Ibunya Joko Stephani Sambruang")
    }

    @Test
    fun GetFullIdentification(){
        val expectation = "5 Joko Tarbiah 10 Agustus 2019 08932123322"
        assertEquals(expectation, student.GetFullIdentification())
    }

    @Test
    fun NameSucces(){
        student.setName("Joko Tarbiah")
        val expectation = "Joko Tarbiah"
        assertEquals(expectation, student.getName())
    }

    @Test
    fun phoneNumberSuccess(){
        student.setPhoneNumber("089321233221")
        val expectation = "089321233221"
        assertEquals(expectation, student.getphoneNumber())
    }

    @Test
    fun phoneNumberInvalid(){
        student.setPhoneNumber("0812345678910")
        val expectation = "Number Invalid"
        assertEquals(expectation, student.getphoneNumber())
    }



    @Test
    fun parent(){
        val expectation = "Bapaknya Joko Stephen Sambura, Ibunya Joko Stephani Sambruang"
        assertEquals(expectation, ortu.show())
    }
}
