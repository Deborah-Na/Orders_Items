import java.util.ArrayList;

public class Order{
    //member variables:
    private String name;
    private boolean ready;
    private ArrayList<Item>items = new ArrayList<Item>();

//--constructors--
    public Order(){
        this.name = "Guest"; 
        this.items = new ArrayList<Item>();
        this.ready=true;
    }

    public Order(String name){
        this.name=name;
        this.items = new ArrayList<Item>();
    }

//--Methods--

public void addItem(Item item){
    this.items.add(item);
}

public String getStatusMessage(){
    if(this.ready==true){
        return "Your order is ready.";
    } else{
        return "Thank you for waiting. Your order will be ready soon.";
    }
}
public double getOrderTotal(){
    double total = 0;
    for(Item item: this.items){
        total += item.getPrice();
    }
    return total;

}
public void display(){
    System.out.println("Customer Name: " + this.getName());
    for(Item item: this.items){
    System.out.println(item.getName() +" - $" + item.getPrice());
    }
    System.out.println("Total: " + this.getOrderTotal());
}

//--Getters and Setters--
public String getName(){
    return this.name;
}

public void setName(String name){
    this.name = name;
}

public void setReady(Boolean ready){
    this.ready = true;
}
}
