package objetos2.Solution21;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class ShoppingCart{

    public Product[] products;

}

class Product{

    public String name;
    public float price;

}
public class Solution21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        ShoppingCart shoppingCart = new ShoppingCart();

        int nProducts = sc.nextInt();
        sc.nextLine();

        shoppingCart.products = new Product[nProducts];

        for (int i = 0; i < nProducts; i++) {
            shoppingCart.products[i] = new Product();
            shoppingCart.products[i].name = sc.nextLine();
            shoppingCart.products[i].price = sc.nextFloat();
            sc.nextLine();
        }

        System.out.println("ShoppingCart");
        for (int i = 0; i < nProducts; i++) {
            System.out.format("%40s  %6.2f%n", shoppingCart.products[i].name, shoppingCart.products[i].price);
        }
    }
}
