package Day_13_Section3;

public enum OrderStatus_10 {
    PLACED, SHIPPED, DELIVERED, CANCELLED;

    boolean isFinal(){
        return this == DELIVERED || this == CANCELLED ;
    }
}

class Main8{
    public static void main(String[] args) {
        OrderStatus_10 status = OrderStatus_10.PLACED;

        System.out.println("Order Status: " + status);
        System.out.println("Is Final: " + status.isFinal());

        System.out.println();

        status = OrderStatus_10.SHIPPED;

        System.out.println("Order Status: " + status);
        System.out.println("Is Final: " + status.isFinal());

        System.out.println();

        status = OrderStatus_10.DELIVERED;
        System.out.println("Order Status: " + status);
        System.out.println("Is Final: " + status.isFinal());

        System.out.println();

        status = OrderStatus_10.CANCELLED;
        System.out.println("Order Status: " + status);
        System.out.println("Is Final: " + status.isFinal());

    }
}
