package Week2.orders_items;
import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();
}
