package Seminar7;

public class Main {
    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("lays", 2.62))
                .addProduct(new Water("water", 0.5, true))
                .addProduct(new CurcedProduct("milk", 2.05, 7))
                .addProduct(new Beverage("redbull", 4.11, 0.33))
                .addProduct(new Wine("torres", 5.15, 0.375, 13.5));

        System.out.println("Search for lays: ");
        machine.searchProduct("lays");

        System.out.println("Search for non-available: ");
        machine.searchProduct("123");


        System.out.println("______________");
        machine.buy("milk", 2.05);
        //System.out.println(machine);
        machine.printContent();

        System.out.println("_______________");
        machine.buy("redbull", 4.11);
        //System.out.println(machine);
        machine.printContent();
    }
}
