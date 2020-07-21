package BT_product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    ArrayList<Product> arrayProduct = new ArrayList<>();

    public boolean add(Product p) {
        if (arrayProduct.add(p)) {
            return true;
        }
        return false;
    }

    public void delProduct(int id) {
        arrayProduct.removeIf(product -> product.getID() == id);
    }

    public void searchProduct(String name) {
        for (Product product : arrayProduct) {
            if (product.getName() == name)
                System.out.println(product);
        }
        System.out.println("Product not in array product!");
    }

    public void changeProduct(int id, String name) {
        for (Product product : arrayProduct) {
            if (product.getID() == id) {
                product.setName(name);
            }
        }
    }

    public void decreaseArray() {
        Collections.sort(arrayProduct, getComparator1());
    }

    public void increaseArray() {
        Collections.sort(arrayProduct, getComparator());
    }

    public void changeProduct(int id, int price) {
        for (Product product : arrayProduct) {
            if (product.getID() == id) {
                product.setPrice(price);
            }
        }
    }

    public void changeProduct(int id, String name, int price) {
        for (Product product : arrayProduct) {
            if (product.getID() == id) {
                product.setName(name);
                product.setPrice(price);
            }
        }
    }

    public void display() {
        for (Product product : arrayProduct) {
            System.out.println("ID = " + product.getID() + " , name = " + product.getName() + " , price = " + product.getPrice());
        }
    }

    @Override
    public String toString() {
        return "ProductManager{" + "arrayProduct=" + arrayProduct + "}";
    }

    private Comparator<Product> getComparator() {
        return new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() > p2.getPrice()) {
                    return 1;
                } else {
                    if (p1.getPrice() == p2.getPrice()) {
                        return 0;
                    } else
                        return -1;
                }
            }
        };
    }

    private Comparator<Product> getComparator1() {
        return new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() < p2.getPrice()) {
                    return 1;
                } else {
                    if (p1.getPrice() == p2.getPrice()) {
                        return 0;
                    } else
                        return -1;
                }
            }
        };
    }
}
