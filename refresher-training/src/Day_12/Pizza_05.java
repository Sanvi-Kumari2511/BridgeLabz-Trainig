package Day_12;

public class Pizza_05 {
    String size;
    String crustType;
    int toppingsCount;
    double price;
    //Constructor 1: taking size only
    public Pizza_05(String size){
        this(size, "Regular", 0);
    }

    //Constructor 2: taking size and crustType
    public Pizza_05(String size, String crustType){
        this(size, crustType, 0);
    }

    //Constructor 3: taking size, crustType, and toppingsCount
    public Pizza_05(String size, String crustType, int toppingsCount){
        this(size, crustType, toppingsCount, 0);
    }

    //Constructor 4: taking all fields including an explicit price override
    public Pizza_05(String size, String crustType, int toppingsCount, double price){
        this.size = size;
        this.crustType = crustType;
        this.toppingsCount = toppingsCount;

        if(price > 0){
            this.price = price;
        }
        else{

            //Base price calculation
            if(size.equalsIgnoreCase("Small")){
                this.price = 250;
            }
            else if(size.equalsIgnoreCase("Medium")){
                this.price = 350;
            }
            else if(size.equalsIgnoreCase("Large")){
                this.price = 500;
            }
            else{
                this.price = 150;
            }

            this.price += toppingsCount * 30;
        }
    }

    public void displayPizza(){
        System.out.println("Size: " + size);
        System.out.println("Crust: " + crustType);
        System.out.println("toppings: " + toppingsCount);
        System.out.println("Price: " + price);

        System.out.println();
    }
}

class Main4{
    public static void main(String[] args) {
        //Constructor 1
        Pizza_05 p1 = new Pizza_05("Small");
        //Constructor 2
        Pizza_05 p2 = new Pizza_05("Medium", "Thin");
        //Constructor 3
        Pizza_05 p3 = new Pizza_05("Large", "Cheese Burst", 3);
        //Constructor 4
        Pizza_05 p4 = new Pizza_05("Large", "Family", 2, 999);

        System.out.println("Pizza 1: ");
        p1.displayPizza();

        System.out.println("Pizza 2: ");
        p2.displayPizza();

        System.out.println("Pizza 3: ");
        p3.displayPizza();

        System.out.println("Pizza 4: ");
        p4.displayPizza();
    }
}


