import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomCollections {
    static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key)
    {
        return Collections.binarySearch(list, key);
    }

    static <T> int binarySearch(List<T> list, T key, Comparator<? super T> c)
    {
        return Collections.binarySearch(list, key, c);
    }
}
