import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PhoneBookTest {
    @Test
    public void testAdd(){
        PhoneBook phoneBook = PhoneBook.getInstance();
        phoneBook.add("Michael", "+78020200299");
        phoneBook.add("Michael", "+78228828828");
        Assertions.assertEquals(1, phoneBook.add("Michael", "+78228828828"));
    }
    @Test
    public void testFindByNumber(){
        PhoneBook phoneBook = PhoneBook.getInstance();
        phoneBook.add("Michael", "+78020200299");
        phoneBook.add("Хасбула", "+79156666666");
        Assertions.assertEquals("Хасбула", phoneBook.findByNumber("+79156666666"));
    }
    @Test
    public void testFindByName(){
        PhoneBook phoneBook = PhoneBook.getInstance();
        phoneBook.add("Michael", "+78020200299");
        phoneBook.add("Хасбула", "+79156666666");
        Assertions.assertEquals("+79156666666", phoneBook.findByName("Хасбула"));
    }
}
