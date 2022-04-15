package Week2.Baristachallenge;
import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items;

    public Order() {
        this.name = "guest";
        this.ready = false;
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;
    }

    public String getName(){
        return this.name;
    }

    public Boolean getReady() {
        return this.ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if(this.ready == true) {
            return "Order is ready now!";
        }
        else {
            return "Your order will be available soon!";
        }
    }
    public double getOrderTotal() {
        double total = 0.0;
        for(Item i: this.items) {
            total += i.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.printf("Name:%s", this.name);
        for(Item i: this.items) {
            System.out.println(i.getName() + "-$" + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}
