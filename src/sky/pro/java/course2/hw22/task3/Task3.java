package sky.pro.java.course2.hw22.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task3 {
    Map<String, Integer> map = new HashMap<>();

    public void addInfo(String key, Integer value) {
        if (Objects.equals(map.get(key), value)) {
            throw new IllegalArgumentException();
        } else {
            map.put(key, value);
        }
    }
}
