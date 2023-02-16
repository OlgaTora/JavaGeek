package Seminar7;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private double revenue = 0.0;
    private List<Product> products = new ArrayList<>();


    public VendingMachine addProduct(Product product) {
        this.products.add(product);
        return this;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getRevenue() {
        return revenue;
    }

    public Product searchProduct(String name) {
        for (Product product :
                getProducts()) {
            if (product.getName().equals(name)) {
                System.out.println("You've find: " + product);
                return product;
            }
        }
        return null;
    }

    public void buy(String name, double cost) {
        Product fnd = searchProduct(name);
        if (fnd == null) {
            System.out.println("Try again, this machine don't contain" +
                    "this product");
        } else {
            if (fnd.getCost() == cost) {
                products.remove(fnd);
                revenue += cost;
                System.out.println("You've bought: " + fnd.getName());
            } else {
                System.out.println("Try again, price is not true");
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : getProducts()
        ) {
            sb.append(product.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String printRevenue() {
        return "Revenue of this machine is: "
                + getRevenue() + "$";
    }

    public void printContent() {
        System.out.println(printRevenue());
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("Machine contents:");
        System.out.println(this);
    }
}
