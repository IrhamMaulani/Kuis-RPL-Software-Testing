import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Test

internal class StudentControllerTest {
    private lateinit var maha: Student
    private lateinit var orangtua: Student.Orangtua

    @BeforeEach
    fun beforeEach(){
        maha = Student()
        maha.studentid = 5
        maha.nama = "Biahlil Akbar"
        maha.nohp = "083150195537"
        maha.tlahir = "14 February 2002"
        orangtua = Student.Orangtua()
        orangtua.ayah = "Joko Tarbiah"
        orangtua.ibu = "Siti Amanah"
    }


    @Test
    fun testGetIdentitasSucces (){
        val expected = "ID : 5 Nama :  Biahlil Akbar, Tanggal lahir : 14 February 2002, Nomor hp : 083150195537"
        assertEquals(expected,maha.getStudentDetails())
    }
    
    @Test
    fun testGetTanggalLahirSucces() {
        val expected = "14-02-2002"
        assertEquals(expected,maha.tanggal())
    }
    
    @Test
    fun testGenNIMSucces() {
        val expected = "5BA14022002"
        assertEquals(expected,maha.genNIM())
    }

    @Test
    fun testArrayHobiSucces() {
        val expected = "Bersepeda , Bernyanyi , Makan "
        assertEquals(expected,maha.arrayhobi())
    }

}