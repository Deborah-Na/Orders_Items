
import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Deborah");
        Order order4 = new Order("Brian");
        Order order5 = new Order("Daniel");

        

        // Menu items
        Item item1 = new Item("mocha", 4.50);
        Item item2 = new Item("latte", 5);
        Item item3 = new Item("drip coffee", 5.50);
        Item item4 = new Item("cappucino", 6);

        order2.addItem(item1);
        order2.addItem(item2);
        order1.addItem(item4);
        order3.addItem(item3);
        order3.addItem(item1);
        order4.addItem(item2);

        order2.setReady(true);
        System.out.println(order2.getStatusMessage());

        System.out.println("Your order total is $" + order1.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();


    
        // // Order variables -- order1, order2 etc.
        // Order order1= new Order();
        // order1.name= "Cindhuri";
        // System.out.println(order1.total);
    
        // Order order2= new Order();
        // order2.name= "Jimmy";

        // Order order3= new Order();
        // order3.name= "Noah";
        
        // Order order4= new Order();
        // order4.name= "Sam";
        
        
        // // Application Simulations
        // order2.items.add(item1);
        // order2.total += item1.price;

        // order3.items.add(item4);
        // order3.total += item4.price;

        // order4.items.add(item2);
        // order4.total += item2.price;

        // order1.ready= true;

        // order4.items.add(item2);
        // order4.items.add(item2);
        // order4.total += item2.price *2;

        // order2.ready = true;


        // // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    

        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);

        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Ready: %s\n", order3.ready);

        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.ready);
    }
}
