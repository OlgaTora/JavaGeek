package Seminar12.Solid5.lsp;
public class Order extends AbstractOrder{


    public Order(int qnt, int price) {
        super(qnt, price);
    }

    public int getAmount() {
        return qnt * price;
    }


    }
