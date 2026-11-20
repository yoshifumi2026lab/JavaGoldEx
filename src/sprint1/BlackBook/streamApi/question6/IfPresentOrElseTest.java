package BlackBook.streamApi.question6;

import java.util.Optional;

public class IfPresentOrElseTest {
    public static void main(String[] args) {
        Optional<String> sample = Optional.empty();
        //値がある場合は第１引数ラムダ式(Counsumer型) 
        //値がない場合は第２引数ラムダ式(Runnable型)　引数・戻り値なし　
        sample.ifPresentOrElse((str) -> System.out.println(str), () -> System.out.println("emply"));
    }
}
