package BlackBook.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManager<Book> manager = new ProductManager<>();
        manager.showProduct(new Book("Java Gold"));

        ProductManager<Food> managerFood = new ProductManager<>();
        managerFood.showProduct(new Food("りんご"));

        List<Book> books = new ArrayList<>();
        books.add(new Book("Spring Boot入門"));
        books.add(new Book("応用情報技術者"));

        List<?> list = books;

        Book book1 = books.get(0);
        // listの型がわからないからNG
        // Book book2 = list.get(1);
        Object book2 = list.get(1);

        ApiResponse<String> response1 = new ApiResponse<>(200, "登録成功");

        ApiResponse<User> response2 = new ApiResponse<>(200, new User("藤井"));

        ApiResponse<Integer> response3 = new ApiResponse<>(200, 100);

        ResponseLogger.logResponse(response1);
        ResponseLogger.logResponse(response2);
        ResponseLogger.logResponse(response3);
    }
}
