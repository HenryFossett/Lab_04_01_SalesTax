public class main {
    public static void main(String[] args){
        double itemPrice = 79.99;
        double taxTotal = 0;
        double finalCost = 0;

        taxTotal = itemPrice * 0.05;
        finalCost = itemPrice + taxTotal;
        System.out.println("Your total cost is $" + finalCost + ". This is $" + taxTotal + " in sales tax and $" + itemPrice + " on your item");
    }
}
