package Seminar12.Solid2;

import Seminar12.Solid2.srp.Order;
import Seminar12.Solid2.srp.Persister;
import Seminar12.Solid2.srp.View;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        View view = new View();
        Order order = view.inputFromConsole();
        Persister persister = new Persister("order.json");
        persister.saveToJson(order);
    }
}