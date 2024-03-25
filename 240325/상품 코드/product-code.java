import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Product product1 = new Product();
        product1.name = "codetree";
        product1.code = 50;

        System.out.println("product " + product1.code + " is " + product1.name);

        Product product2 = new Product();
        product2.name = sc.next();
        product2.code = sc.nextInt();

        System.out.println("product " + product2.code + " is " + product2.name);

    }
}

class Product {
    String name;
    int code;

    public Product() {
        this.name = "";
        this.code = 0;
    }

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}