import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class StudentControllerTest {
    val maha = Student()

    @Test
    fun testGetIdentitasSucces (){
        val expected = maha.getStudentDetails()
        assertEquals(expected,maha.getStudentDetails())
    }
    
    @Test
    fun testGetTanggalLahirSucces() {
        val expected = maha.tanggal()
        assertEquals(expected,maha.tanggal())
    }
    
    @Test
    fun testGenNIMSucces() {
        val expected = "5JT10082019"
        assertEquals(expected,maha.genNIM())
    }

    @Test
    fun testArrayHobiSucces() {
        val expected = "Bersepeda , Bernyanyi , Makan "
        assertEquals(expected,maha.arrayhobi())
    }

}