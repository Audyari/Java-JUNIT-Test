package Programmer.testing.ProblemSolving.DUAPULUHSATU;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestingPakeMocking {

    private PersonRepository personRepository; // Mock repository
    private PersonService personService; // Service yang diuji

    @BeforeEach
    void setUp() {
        // Membuat mock untuk personRepository
        personRepository = mock(PersonRepository.class);

        // Menginisialisasi personService dengan mock
        personService = new PersonService(personRepository);
    }

    @Test
    void testNotFound() {
        // Mengatur perilaku mock untuk mengembalikan null
        when(personRepository.selectById("Person tidak di temukan")).thenReturn(null);

        // Memastikan NullPointerException dilemparkan
        Assertions.assertThrows(NullPointerException.class, () -> {
            personService.get("Person tidak di temukan");
        });
    }

    @Test
    void GetPersonSukses() {
        // Mengatur perilaku mock
        Mockito.when(personRepository.selectById("AUDY")).thenReturn(new Person("Audy", "AUDY"));

        // Memanggil metode yang diuji
        var person = personService.get("AUDY");

        // Memastikan hasil yang diharapkan
        Assertions.assertNotNull(person);
        assertEquals("Audy", person.id);
        assertEquals("AUDY", person.name);
    }

    @Test
    public void testRegisterServiceSALAH(){
        var person = personService.register("AUDY");

        assertNotNull(person);
        assertEquals("AUDY",person.name);
        assertNotNull(person.getId());
    }

    @Test
    public void testRegisterServiceBENAR(){
        var person = personService.register("AUDY");

        assertNotNull(person);
        assertEquals("AUDY",person.name);
        assertNotNull(person.getId());

        Mockito.verify(personRepository,times(1)).insert(new Person(person.getId(),person.getName()));
    }
}