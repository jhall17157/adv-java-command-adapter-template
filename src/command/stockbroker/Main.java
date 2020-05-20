package command.stockbroker;

public class Main {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        Order buyStockOrder = new BuyStock(abcStock);
        Order sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        System.out.println("Bought");
        broker.takeOrder(buyStockOrder);
        broker.undo();

        System.out.println("Sold");
        broker.takeOrder(sellStockOrder);

        broker.undo();

        System.out.println("Placing Order");
        broker.placeOrders();
    }

}
