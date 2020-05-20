package command.stockbroker;

/**
 * This class is the Receiver: it gets commanded (indirectly) by the Invoker.
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;
    private String name2 = "DEF";
    private int quantity2 = 15;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }
    public void undon() { System.out.println("Stock [Name: " + name + " Quantity: " + quantity + " ] was re-bought/re-sold"); }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }
}
