import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static PhoneBook PHONEBOOK = null;
    private static Map<String, String> book = new HashMap<>();
    private PhoneBook(){}
    public int add(String name, String number){
        book.put(name, number);
        return book.size();
    }
    public static PhoneBook getInstance(){
        if(PHONEBOOK == null){
            synchronized (PhoneBook.class){
                if(PHONEBOOK == null){
                    PHONEBOOK= new PhoneBook();
                }
            }
        }
        return PHONEBOOK;
    }
}
