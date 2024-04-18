import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PhoneBookTest {
    @Test
    public void testAdd(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Michael", "+78020200299");
        phoneBook.add("Michael", "+78228828828");
        Assertions.assertTrue(phoneBook.add("Michael", "+78228828828") == 1);
    }
}
