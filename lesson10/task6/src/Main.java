import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static <T> Set<T> intersect(Set<T> ...sets) {
        if (sets.length == 0)
            return Set.of();
        final Set<T> result = new HashSet<>(sets[0]);
        for (final Set<T> set : sets) {
            result.retainAll(set);
        }
        return result;
    }

    public static <T> Set<T> union(Collection<T> ...sets) {
        final Set<T> result = new LinkedHashSet<>();
        for (final Collection<T> set : sets) {
            result.addAll(set);
        }
        return result;
    }

    public static void main(String[] args) {
        Set<String> list1 = Set.of("Masha", "Dima", "Alex");
        Set<String> list2 = Set.of("Alex", "Vika", " Annie");
        final Set<String> result = intersect(list1,list2);
        System.out.println(result);
        final Set<String> result1 = union(list1,list2);
        System.out.println(result1);
    }

}
