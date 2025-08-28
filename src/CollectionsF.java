import java.util.HashMap;
import java.util.Map;

public final class CollectionsF {
    private CollectionsF() {}
    public static <T> Map<T, Integer> countOccurrences(T[] array) {
        if (array == null) throw new NullPointerException("Массив пуст!");
        Map<T, Integer> counts = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            T e = array[i];
            counts.merge(e, 1, Integer::sum);
        }
        return counts;
    }
}
