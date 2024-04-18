import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private static PhoneBook PHONEBOOK = null;
    private static Map<String, String> book = new HashMap<>();
    private PhoneBook(){}
    public int add(String name, String number){
        book.put(name, number);
        return book.size();
    }
    public String findByNumber(String number){
        String name = "Такого номера нет в базе";
        if(book.containsValue(number)) {
            Set<Map.Entry<String, String>> entrySet = book.entrySet();
            for(Map.Entry<String, String> pair : entrySet){
                if(number.equals(pair.getValue())){
                    name = pair.getKey();
                }
            }
        }
        return name;
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
