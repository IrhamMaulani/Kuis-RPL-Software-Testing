import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class StudentRepositoryTest {

    @Test
    fun testRepoNamaSuccess() {
        val studentRepository = StudentRepository(1)
        assertEquals("Aurel", studentRepository.repoNama())
    }

    @Test
    fun testRepoTanggalLahirSucces() {
        val studentRepository = StudentRepository(2)
        assertEquals("15 April 2002", studentRepository.repoTanggallahir())
    }

    @Test
    fun testRepoNoTelpFailed() {
        val studentRepository = StudentRepository(5)
        assertEquals("ID invalid", studentRepository.repoNoTelp())
    }

    @Test
    fun testRepoNoTelpSuccess() {
        val studentRepository = StudentRepository(3)
        assertEquals("082253291430", studentRepository.repoNoTelp())
    }

    @Test
    fun testRepoNimSuccess() {
        val studentRepository = StudentRepository(4)
        assertEquals("4R15032002", studentRepository.repoNim())
    }
}