import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Item i = new Item();

        System.out.println("Enter the name of the Item you are purchasing.");
        String item = scan.nextLine();
        System.out.println("Enter the  quantity and the price seperated by spaces: ");
        int quanti = scan.nextInt();
        double price = scan.nextDouble();

        i.setItemName(item);
        i.setQuantity(quanti);
        i.setItemPrice(price);

        System.out.println("You are purchasing  " + i.getQuantity() + " " + i.getItemName() + " at "
                + i.getItemPrice() + " each.");
        System.out.println("Amount due: " + i.getAmountDue());

    }
}
class Item {
    private String itemName;
    private double itemPrice;
    private int Quantity;
    private double amountDue;

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
    public String getItemName() {
        return itemName;
    }
    public int getQuantity() {
        return Quantity;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public double getAmountDue() {
        return itemPrice * Quantity;
    }
}
