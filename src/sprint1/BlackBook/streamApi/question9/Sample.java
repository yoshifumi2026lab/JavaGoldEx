package BlackBook.streamApi.question9;

import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer>list =List.of(1,2,3,4,5);
        //Consumer型のラムダ式を実行　※引数を受け取り戻り値なし
        list.forEach(x->System.out.print(x));
    }
}
