import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test03 {
    static String[] names = {
            "a", "b", "c", "d","e"
    };
    static int num = 3;
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        for (;;){
            if (stringSet.size() == num) {
                break;
            }
            int random = new SecureRandom().nextInt(names.length);
            stringSet.add(names[random]);
        }

        Iterator<String> stringIterator = Arrays.stream(names).iterator();
        while(stringIterator.hasNext()) {
            System.out.println("gg" + stringIterator.next());
        }

    }
}
