import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Product product1 = new Product("codetree", 50);

        System.out.println("product " + product1.code + " is " + product1.name);

        String name = sc.next();
        int code = sc.nextInt();
        Product product2 = new Product(name, code);


        System.out.println("product " + product2.code + " is " + product2.name);

    }
}

class Product {
    String name;
    int code;

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}