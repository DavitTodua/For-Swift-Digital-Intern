import java.util.HashMap;
import java.util.HashSet;

public class DataStructure<T> {
    HashMap<T,Integer> map;
    int size;

    public DataStructure() {
        map = new HashMap<T,Integer>();
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(T value) {
        map.put(value,0);
        size++;
    }

    public void remove(T value) {
        map.remove(value);
        size--;
    }

    public boolean contains(T value) {
        return map.containsKey(value);
    }

}
