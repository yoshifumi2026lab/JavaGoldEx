package other.chapter1;
public class Confirmation {

    //オートボクシング
    Integer iWrapper = 100;
    //基本データ型　⇒　ラッパークラス
    Integer obj = Integer.valueOf(10);
    //オートアンボクシング
    int intValue = obj;
    //ラッパークラス　⇒　基本データ型
    int i = obj.intValue();
    
}
