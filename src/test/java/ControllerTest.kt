
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ControllerTest {
    private lateinit var dum: Student
    private lateinit var parentDum: Student.Parent

    @BeforeEach
    fun before(){
        dum = Student()
        dum.setId(8)
        dum.setName("Devi Dini")
        dum.setPhoneNumber("081122113311")
        dum.setBirthday("02 Juli 2001")
        parentDum = Student.Parent("Sukidesu", "Sukijan")
    }

    @Test
    fun testFullInputSuccess(){
        val expected = "8 Devi Dini 02-07-2001 081122113311"
        assertEquals(expected, dum.identity())
    }

    @Test
    fun birthdayFormatSuccess(){
        val expected = "02-07-2001"
        assertEquals(expected, dum.getBirthday())
    }

    @Test
    fun generateNimSuccess(){
        val expected = "8DD02072001"
        assertEquals(expected, dum.generateNIM())
    }

    @Test
    fun generateArraySuccess(){
        val expected = "Minum Coklat Panas , Bermain Tictactoe , Bermain Permainan Papan "
        assertEquals(expected, dum.hobbies())
    }

    @Test
    fun parent(){
        val expected = "Sukidesu, Sukijan"
        assertEquals(expected, parentDum.show())
    }
}