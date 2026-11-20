package other.chapter1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>();
        box1.set("Gold");
        String s = box1.get();

        Box<Integer> box2 = new Box<Integer>();
        box2.set(10);

        Integer i = box2.get();
        

        //型パラメータを指定しないことも可能
        Box box4 = new Box();
        box4.set(true);
        //※Box<Object>として扱われるため、
        //取得時はBoolean型にダウンキャストが必要
        Boolean b = (Boolean)box4.get();

        //型推論されるため、右辺の型パラメータは省略
        Box<Integer> iBox = new  Box<>();

        method(new Box<>());
        Box<String> sBox = method();
    }

    //仮引数が設定されているため、型推論が可能
    public static void method(Box<String>box){
        System.out.println("引数設定あり");
    }

    //戻り値の型があるため、インスタンス生成で型推論可能
    public static Box<String>method(){
        return new Box();
    }   
}
