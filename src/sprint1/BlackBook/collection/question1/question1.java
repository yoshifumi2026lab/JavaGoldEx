package sprint1.BlackBook.collection.question1;

class question1 {

    public static void main(String[] args) {
        /**
         * Integer
         */
        // オートボクシング
        Integer integer1 = 1;
        // プリミティブ型 ⇒ ラッパークラス
        Integer integer2 = Integer.valueOf(2);
        // オートアンボクシング
        int int1 = integer1;
        // ラッパークラス ⇒ プリミティブ型
        int int2 = integer2.intValue();

        /**
         * Byte
         * byte = 8ビット = 256種類 = -128～127
         * 2の補数 全ビット反転 +1 00000101(5) ⇒ 11111010(全ビット反転) ⇒ 11111011(-1)
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