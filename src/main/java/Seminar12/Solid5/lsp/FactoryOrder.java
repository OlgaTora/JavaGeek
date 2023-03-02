package Seminar12.Solid5.lsp;

public class FactoryOrder {
    public Orderable create(int qnt, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(qnt, price);
        }
        return new Order(qnt, price);
    }
}