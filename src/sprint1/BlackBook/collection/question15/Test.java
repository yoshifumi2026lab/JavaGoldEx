package sprint1.BlackBook.collection.question15;

import java.util.Map;

/**
 * HashMap → 順序保証なし
 * LinkedHashMap → 挿入順を保持
 * TreeMap → キーの昇順
 */

public class Test {
    public static void main(String[] args) {
        var a = Map.entry(1, "A");
        var b = Map.entry(2, "B");
        var c = Map.entry(3, "C");

        Map<Integer, String> map = Map.ofEntries(a, b, c);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
