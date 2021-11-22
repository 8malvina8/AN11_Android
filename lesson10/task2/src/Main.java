import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String text = "Да да снова она. Да говорят смешно, но тогда да." +
                "Ура, но да значит ура. Ура да , говорят.";
        String[] text1 = text.split(("[.,:;!?\"\\s]+"));

        List<String> list = Arrays.asList(text1);

        Map<String, Integer> result = list.stream().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));

        result.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}

