package other.chapter1.Boundary2;

public class Main {
    static <T extends Comparable<T>> void method(T t1 ,T t2) {
        //t1のほうがt2より大きい？
        if(t1.compareTo(t2)> 0)System.out.println(t1);
    }

    //
    // static  <T> void methodErr(T t1,T t2){
    //     if(t1> t2) System.out.println(t1);
    //     if(t1.compareTo(t2)>0)System.out.println(t1);
    // }
    public static void main(String[]args){
        method(10, 0);
        //String の compareTo() は文字列を辞書順で比較
        method("A", "B");
        method(true, false);
    }
}
