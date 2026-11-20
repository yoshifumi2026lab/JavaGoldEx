package other.chapter1.BoundaryWildCard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //上限協会の例
    static void testUpperBnd(List<? extends Number> list) {
        list.add(null);
        //もしDoubleだったらIntegerは代入できないから
        //list.add(Integer.valueOf(10));
        //すべてはNumberの子だから大丈夫
        Number n = list.get(0);
    }
    //下限協会の例
    static void testLowerBnd(List<? super Number>list){
        list.add(Integer.valueOf(10));
        //Numberの親というイメージだからNumber以上
        //List.add(new Object());
        Object o = list.get(0);
        //Number n = list.get(1); Integer i = list.get(2);
    }
    public static void Main(String[]args) {
        List<Object> oList = new ArrayList<>(); oList.add(1);
        List<Number>nList = new  ArrayList<>();nList.add(1);
        List<Integer>iList = new  ArrayList<>();iList.add(1);
        // 上限がNunber型のためObjectはNG
        // testUpperBnd(oList);
        testUpperBnd(nList);
        // 上限がNunber型のためIntegerはOK
        testUpperBnd(iList);
        // 下限がNumberのためOK
        testLowerBnd(oList);
        // 下限がNumberのためOK
        testLowerBnd(nList);
        // 下限がNumberのためNG
        // testLowerBnd(iList);     
    } 
}