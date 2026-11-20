package BlackBook.streamApi.question13;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;


public class ParallelStream {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("A","B","C","D","E");
        //並列ストリーム
        Stream<String> stream = list.parallelStream();
        
        stream.forEach(System.out::println);
        //マルチスレッドの利点は見込めないが、コレクションが管理している通りになる。
        stream.forEachOrdered(System.out::println);
    }
}
