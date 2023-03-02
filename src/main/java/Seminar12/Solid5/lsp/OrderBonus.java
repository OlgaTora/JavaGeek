package Seminar12.Solid5.lsp;

public class OrderBonus extends AbstractOrder{


    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    }

    public int getAmount() {
        return qnt + price/2;
    }
}
