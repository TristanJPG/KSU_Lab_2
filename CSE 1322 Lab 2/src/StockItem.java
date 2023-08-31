import java.text.DecimalFormat;

public class StockItem {
    public String description;
    public int id;
   public double price;
    public int quantity;
    public static int nextId = 0;

    public StockItem() {

    }
    public StockItem(String desc, double price, int quantity) {
        this.description = desc;
        this.price = price;
        this.quantity = quantity;
        this.id = nextId;
        nextId += 1;
    }

    public String getDescription() {
        return description;
    }

    public int getId(){
        return id;
    }

    public double getPrice() {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(price));
    }

    public int getQuantity() {
        return quantity;
    }

     public void setPrice(double price) {
         this.price = price;
         if (this.price < 0.00) {
             System.out.println("Error Price is Below Zero.");
         }
     }

    public void setQuantityLower() {
        this.quantity -= 1;
        if (this.quantity < 0) {
            System.out.println("Error the Quantity Dropped Below Zero.");
        }
    }

    public void setQuantityHigher(int quantity) {
        this.quantity += quantity;
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Item Number: ").append(this.getId()).append(" Is ").append(this.getDescription())
                .append(" has price ").append(this.getPrice()).append(" we currently have ").append(this.getQuantity())
                .append(" in stock");
        return sb.toString();
    }
}


