package BlackBook.collection.question3;
import java.util.ArrayList;
import java.util.List;

public class Sample {
 public static void main(String[] args) {
    //変数への代入
    List<String> list = new ArrayList<>();

    list = test();
    System.out.println(list);

    //メソッド呼び出しの引数
    execute(new ArrayList<>());
 }
 private static List<String>test(){
    //メソッドの戻り値
    return new ArrayList<>();
 }
 private static void execute(List<String>list){
    System.out.println(list);
 }   
}
