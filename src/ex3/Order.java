package ex3;

import java.util.ArrayList;
import java.util.List;

public class Order implements ICloneable {
    private List<Product> products;
    private double shippingCost;
    private List<Discount> discounts;
    private String paymentMethod;

    public Order() {
        products = new ArrayList<>();
        discounts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void addDiscount(Discount discount) {
        discounts.add(discount);
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public Object clone() {
        Order clonedOrder = new Order();
        for (Product product : products) {
            clonedOrder.addProduct((Product) product.clone());
        }
        clonedOrder.setShippingCost(shippingCost);
        for (Discount discount : discounts) {
            clonedOrder.addDiscount((Discount) discount.clone());
        }
        clonedOrder.setPaymentMethod(paymentMethod);
        return clonedOrder;
    }

    @Override
    public String toString() {
        return "Order{products=" + products + ", shippingCost=" + shippingCost + ", discounts=" + discounts + ", paymentMethod='" + paymentMethod + "'}";
    }
}
