
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        String str = "1,2,3,4,5,5,7,7,8,7,9";
        String[] numbers = str.split("[,\\s]");
        List<String> listNumbers = Arrays.asList(numbers);


        Set<String> set = new HashSet<>(listNumbers);
        for (String i : set) {
            System.out.println(i);
        }
    }
}
