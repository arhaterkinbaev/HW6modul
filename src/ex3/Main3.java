package ex3;

public class Main3 {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.00, 1);
        Product product2 = new Product("Mouse", 25.00, 2);

        Discount discount = new Discount("New Year Sale", 10.0);

        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.setShippingCost(15.0);
        order1.addDiscount(discount);
        order1.setPaymentMethod("Credit Card");

        System.out.println("Original Order:");
        System.out.println(order1);

        Order order2 = (Order) order1.clone();
        order2.setPaymentMethod("PayPal");

        System.out.println("\nCloned Order (modified payment method):");
        System.out.println(order2);
    }
}
