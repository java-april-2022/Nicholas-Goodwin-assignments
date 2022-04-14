package Week2.orders_items;
import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.price = 1.50;
        item1.name = "mocha";

        Item item2 = new Item();
        item2.price = 2.50;
        item2.name = "latte";

        Item item3 = new Item();
        item3.price = 3.14;
        item3.name = "drip coffee";

        Item item4 = new Item();
        item4.price = 5.00;
        item4.name = "capucccino";
    
        // Order variables -- order1, order2 etc.
        Order order1= new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";
    
        // Application Simulations
        order2.items.add(item1);
        order2.total += item1.price;

        order3.items.add(item4);
        order3.total += item4.price;

        order4.items.add(item2);
        order4.total += item2.price;

        order1.ready = true;

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;

        order2.ready = true;

        order1.items.add(item1);
        order1.items.add(item3);
        order1.total += item1.price + item3.price; //added for curiosity!


        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}


