package sprint2.BlackBook.CollectionEX.question1;

import java.util.ArrayList;
import java.util.List;

/**
 * 要点
 * プリミティブ型に対応したラッパークラス
 * int Integer
 * char Character
 * 上記以外のラッパークラスは先頭大文字
 */
public class CollectionEx {
    public static void main(String[] args) {
        // 問1 プリミティブ型に対するラッパークラス
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(10));// ※java9以降はオートボクシングを使用のため非推奨
        list.add(20);
        list.add(30);

        for (int i = 0; i < list.size(); i++) {
            Integer obj = list.get(i);
            int num = obj.intValue();
            System.out.println(num);
        }

        // オートボクシング オートアンボクシング
        Integer a = 10;
        int b = a;

        // コンパイラによって、コンパイルすると
        Integer c = Integer.valueOf(10);
        int d = a.intValue();

        // プリミティブ型に対応するラッパークラス
        /**
         * Byte
         * byte = 8ビット = 256種類 = -128～127
         * 2の補数 全ビット反転 +1 00000101(5) ⇒ 11111010(全ビット反転) ⇒ 11111011(-5)
         * char 0～65535以外は符号付き
         * 最上位ビットが１なら負数
         * 128は10000000は整数として表現できない そのため、-128 整数は127まで01111111
         */
        // オートボクシング
        Byte byte1 = 10;
        // メソッド引数では自動変換されません。
        // Byte byte2 = Byte.valueOf(20);
        Byte byte2 = Byte.valueOf((byte) 20);
        // オートアンボクシング
        byte byte3 = byte1;
        // ラッパークラス ⇒ プリミティブ型
        byte byte4 = byte1.byteValue();

        /**
         * shotの場合
         * 16ビット(2バイト)
         * byteと同じ2の補数
         * 最大値 32767 最小値 -32768
         * 
         */
        // オートボクシング
        Short short1 = 10;
        // メソッド引数では自動変換されません。
        // Short short2 = Short.valueOf(20);
        Short short2 = Short.valueOf((short) 20);
        // オートアンボクシング
        short Short3 = short1;
        // ラッパークラス ⇒ プリミティブ型
        short Short4 = short1.shortValue();

        /**
         * Float
         * fを付ける
         */
        // オートボクシング
        Float float1 = 10.f;
        Float float2 = Float.valueOf(10.5f);

        // オートアンボクシング
        float float3 = float1;
        float float4 = float1.floatValue();

        /**
         * Double
         */

        // オートボクシング
        Double double1 = 10.5;
        Double double2 = Double.valueOf(10.5);

        // オートアンボクシング
        double double3 = double1;
        double double4 = double1.doubleValue();

        /**
         * Char
         */

        // オートボクシング
        Character char1 = '1';
        Character char2 = Character.valueOf('2');

        // オートアンボクシング
        char char3 = char1;
        char char4 = char1.charValue();

        /**
         * Boolean
         */

        // オートボクシング
        Boolean boolean1 = true;
        Boolean boolean2 = Boolean.valueOf(true);

        // オートアンボクシング
        boolean boolean3 = boolean1;
        boolean boolean4 = boolean1.booleanValue();

    }
}
