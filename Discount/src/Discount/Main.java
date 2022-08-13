package Discount;

public class Main {
    public static void main(String[] args) {
        Discounteble d1= new BestForCustomer(2.5,1.5,5.5);
        System.out.println(d1.duscountedPrice(500));

    }
}
