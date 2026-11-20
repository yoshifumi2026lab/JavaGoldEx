package BlackBook.collection.question2;

public class Test {
    public static void main(String[] args) {
        //raw type 生データ
        Value rawV = new Value<String>("Hello");
        Value<String> strV = new Value<String>("Hello");
        //ジェネリンクスを省略している場合はobject型
        Value objV = new Value("Hello");
        
        Object a = rawV.getVal();
        String b = strV.getVal();
        Object c = objV.getVal();


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
