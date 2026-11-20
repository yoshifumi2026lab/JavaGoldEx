package BlackBook.practice;

public class ProductManager<T extends Product> {
    public void showProduct(T product){
        System.out.println(product.getName());
    } 
}
