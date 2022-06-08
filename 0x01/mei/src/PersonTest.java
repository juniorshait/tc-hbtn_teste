import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    Person person;

    @BeforeEach
    void setup(){
        person = new Person("Paul", "McCartney", 2000,  true,  true, true);
    }

    @Test
    void show_full_name(){
        Assertions.assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    void test_calculateYearlySalary(){
        person.setSalary(1200);
        Assertions.assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    void person_is_MEI(){
        person = new Person("Shait", "Junior", 1999, false, false, false);
        person.setSalary(2100);
        Assertions.assertTrue(person.isMEI());
    }

    @Test
    void person_is_not_MEI(){
        person = new Person("Shait", "Junior", 1999, true, false, false);
        person.setSalary(2100);
        Assertions.assertFalse(person.isMEI());
    }
}
