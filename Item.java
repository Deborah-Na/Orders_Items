public class Item{

//private member variables:
    private String name;
    private double price;

// this is my constructor: 
    public Item(String name, double price ){
        this.name = name;
        this.price= price; 
    }

//getter
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

//setter
public void setName(String name){
    this.name =name;
}

public void setPrice(Double price){
    this.price = price;
}




// public Item(String name, double price){
//     this.price=price;
// }

}