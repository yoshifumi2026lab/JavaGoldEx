package BlackBook.streamApi.question11;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sample {
    // プリミティブ型の場合、戻り値がStreamではないため、
    // オーバーロードされている IntStream LongStream DoubleStream
    int[] array = { 1, 2, 3, 4, 5 };
    IntStream stream = Arrays.stream(array);
}
