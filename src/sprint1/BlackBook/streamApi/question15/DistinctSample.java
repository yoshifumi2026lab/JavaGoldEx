package BlackBook.streamApi.question15;

import java.util.List;
import java.util.Arrays;

public class DistinctSample {
    public static void main(String[] args) {
        // distinct 要素の重複を取り除く equalsメソッドの結果true
        List<String> list = Arrays.asList("A", "B", "C", "A");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        // limit
        List<Integer> limitList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
        limitList.stream()
                .limit(5)
                .forEach(System.out::println);

        // skip
        List<Integer> skipList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
        skipList.stream()
                .skip(5)
                .forEach(System.out::println);
    }
}
