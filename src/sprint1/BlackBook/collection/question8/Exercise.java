package sprint1.BlackBook.collection.question8;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();
        // ? extends Number = Number以下の型を受け取れるが、型が分からないので追加できない。
        // null しか設定できない Double、Integer、Floutどれかわからないから
        // list.add(10);

        // extends：中身の型が分からないが、少なくとも上限の型として受け取れる
        // super：上限の型またはサブクラスを入れる
    }
}
