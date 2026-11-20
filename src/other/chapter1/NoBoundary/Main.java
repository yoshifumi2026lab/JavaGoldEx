package other.chapter1.NoBoundary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Number[] nArr = { 0, 1, 2 };
        Integer[] iArr = { 0, 1, 2 };
        nArr = iArr;
        // 実態はIntegerだからDoubleを代入することはできても実行時にエラーとなる。
        // nArr[0] = 3.0;

        List<Number> nList = new ArrayList<>();
        nList.add(1);

        List<Integer> iList = new ArrayList<>();
        iList.add(1);

        // 「ジェネリックは不変」
        // nList = iList;

    }

    static void methodObj(List<Object> list) {
        for (Object e : list)
            System.out.print(e);
    }

    static void methodWcard(List<?> list) {
        for (Object e : list)
            System.out.print(e);
        // list.add(2); list.add(new Object());
        list.add(null);
    }
}
