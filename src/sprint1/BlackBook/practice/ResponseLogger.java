package BlackBook.practice;

public class ResponseLogger {

    public static void logResponse(ApiResponse<?> response) {

        System.out.println("ステータス: " + response.getStatus());
        if (response.getData() instanceof User) {
            User user = (User) response.getData();
            System.out.println("データ: " + user.getName());
        } else {
            System.out.println("データ: " + response.getData());
        }
    }
}
