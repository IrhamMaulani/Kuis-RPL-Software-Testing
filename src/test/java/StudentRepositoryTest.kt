import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class StudentRepositoryTest {
    private lateinit var student: StudentRepository

    @Test
    fun testFindNamaSuccess(){
        val student = StudentRepository(1)
        assertEquals("Dayat Hassan", student.studentRepoFindNama())
    }

    @Test
    fun testFindNamaFailed(){
        val student = StudentRepository(5)
        assertEquals("Tidak ada id seperti itu (hanya ada 1 - 3)",student.studentRepoFindNama(), )
    }

    @Test
    fun testFindTanggalLahirSuccess(){
        val student = StudentRepository(1)
        assertEquals("07 Mei 2002", student.studentRepoFindTanggalLahir())
    }

    @Test
    fun testFindTanggalLahirFailed(){
        val student = StudentRepository(5)
        assertEquals("Tidak ada id seperti itu (hanya ada 1 - 3)", student.studentRepoFindTanggalLahir())
    }

    @Test
    fun testFindNomorHpSuccess(){
        val student = StudentRepository(3)
        assertEquals("087877889922", student.studentRepoFindNomorHp())
    }

    @Test
    fun testFindNomorHpFailed(){
        val student = StudentRepository(9)
        assertEquals("Tidak ada id seperti itu (hanya ada 1 - 3)", student.studentRepoFindNomorHp())
    }
    @Test
    fun testFindNIMSuccess(){
        val student = StudentRepository(2)
        assertEquals("2FH03012002", student.studentRepoFindNIM())
    }

    @Test
    fun testFindNIMFailed(){
        val student = StudentRepository(7)
        assertEquals("Tidak ada id seperti itu (hanya ada 1 - 3)", student.studentRepoFindNIM())
    }

    @Test
    fun testCetakInfoStudent(){
        val info = StudentRepository(2)
        assertEquals(
            "Nama: ${info.studentRepoFindNama()}/n" +
                    "Tanggal Lahir: ${info.studentRepoFindTanggalLahir()}/n" +
                    "Nomor Hp: ${info.studentRepoFindNomorHp()}/n" +
                    "NIM: ${info.studentRepoFindNIM()}",
            info.cetakInfoStudent(2)
        )
    }



}
