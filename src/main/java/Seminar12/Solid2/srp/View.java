package Seminar12.Solid2.srp;

import static Seminar12.Solid2.Utils.prompt;

public class View {

    public Order inputFromConsole(){
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int qnt = Integer.parseInt(prompt("Quantity: "));
        int price = Integer.parseInt(prompt("Price: "));
        return new Order(clientName, product, qnt, price);
    }
}
