import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class StudentViewModelTest {
    private lateinit var studentViewModel : StudentViewModel

    @BeforeEach
    fun beforeEach() {
        studentViewModel = StudentViewModel(Student(3, "Putri", "13 April 2002", "082253291430"))
    }

    @Test
    fun testGetIdSuccess() {
        assertEquals(3, studentViewModel.getId(3))
    }

    @Test
    fun testGetNamaSuccess() {
        assertEquals("Putri", studentViewModel.getNama("Putri Ridha Amalia"))
    }

    @Test
    fun testGetTanggalLahirSuccess() {
        assertEquals("13-04-2002", studentViewModel.getTanggalLahir("13 April 2002"))
    }

    @Test
    fun testGetNoTelpSuccess() {
        assertEquals("082253291430", studentViewModel.getNoTelp("082253291430"))
    }

    @Test
    fun testGetOrangTuaSuccess() {
        assertEquals("ayah: Stephen Sambura ibu: Stephani Sambruang", studentViewModel.getOrangTua("ayah: tephen Sambura ibu: Stephani Sambruang "))
    }

    @Test
    fun testGetHobi() {
        val hobi = listOf("Berjalan", "makan")
        assertEquals("Berjalan, makan", studentViewModel.getHobi(hobi) )
    }

    @Test
    fun testGetNim() {
        assertEquals("9PRA13042002", studentViewModel.getNim(9, "Putri Ridha Amalia", "13 April 2002"))
    }




}