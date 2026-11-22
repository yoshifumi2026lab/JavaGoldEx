package sprint1.BlackBook.collection.question14;

import java.util.Map;
import java.util.HashMap;

public class Sample {
    // Set：要素の重複NG
    // Map：キーの重複NG、値の重複OK
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("OTHER", 3);
        // キー重複 → 値を上書き
        map.put("OTHER", 4);

        map.keySet().stream().forEach(key -> {
            System.out.println(map.get(key));
        });
    }
}
