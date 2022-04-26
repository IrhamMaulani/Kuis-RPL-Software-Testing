import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class StudentTest {

    val student = Student()
    @Test
    fun testTanggalSucces() {
        val expected = "10-08-2019"
        assertEquals(expected, student.tanggal())
    }

    @Test
    fun testPhonenumSucces() {
        val expected = student.nohp
        assertEquals(expected,student.Phonenum())
    }

    @Test
    fun testOrangtuaSucces() {
        val ortu = Student.Orangtua()
        val (ayah,ibu) = ortu.displayortu()
        assertEquals(Pair(ayah,ibu),ortu.displayortu())
    }

    @Test
    fun testArrayHobiSucces() {
        val expected = "Bersepeda , Bernyanyi , Makan "
        assertEquals(expected,student.arrayhobi())
    }

    @Test
    fun testGenNIMSucces() {
        val expected = "5JT10082019"
        assertEquals(expected,student.genNIM())
    }

    @Test
    fun testGetStudentArry (){
        val array = student.getStudentArray
        assertEquals(array,student.getStudentArray)
    }


}