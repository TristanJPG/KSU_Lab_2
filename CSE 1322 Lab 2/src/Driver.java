import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Driver {
    public static StockItem milk = new StockItem("1 Gallon of Milk", 3.60, 15);
    public static StockItem bread = new StockItem("1 Loaf of Bread", 1.98, 30);
    public static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        boolean opp  = true;
        StringBuilder  quest = new StringBuilder();
        quest.append("1. Sold One Milk \n").append("2. Sold One Bread \n").append("3. Change price of Milk \n")
                .append("4. Change price of Bread \n").append("5. Add Milk to Inventory\n").append("6. Add Bread to Inventory \n")
                .append("7. See Inventory \n").append("8. Quit");
        while(opp) {
            System.out.println(quest);
            String ans = scr.nextLine();

            if (ans.equals("1")) {
                milk.setQuantityLower();
            }
            else if (ans.equals("2")) {
                bread.setQuantityLower();
            }
            else if (ans.equals("3")){
                System.out.println("Please Enter New Price of Milk:");
                String newPrice = scr.nextLine();
                milk.setPrice(Double.parseDouble(newPrice));
            }
            else if (ans.equals("4")) {
                System.out.println("Please Enter New Price of Bread:");
                String newPrice = scr.nextLine();
                bread.setPrice(Double.parseDouble(newPrice));
            }
            else if (ans.equals("5")) {
                System.out.println("Please Enter the New Quantity of Milk to Add:");
                String newQuan = scr.nextLine();
                milk.setQuantityHigher(Integer.parseInt(newQuan));
            }
            else if (ans.equals("6")) {
                System.out.println("Please Enter the New Quantity of Bread to Add:");
                String newQuan = scr.nextLine();
                bread.setQuantityHigher(Integer.parseInt(newQuan));
            }
            else if (ans.equals("7")) {
                System.out.println("Milk: " + milk);
                System.out.println("Bread: "+ bread + "\n");
            }
            else {
                opp = false;
            }
        }
    }
}
