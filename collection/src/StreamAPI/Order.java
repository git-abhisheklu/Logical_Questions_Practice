package StreamAPI;

import java.util.Comparator;

public class Order implements Comparator<Order>{
    private Long orderId;
    private String orderName;
    private String orderPrice;

    public Order(){}

    public Order(Long orderId) {
        this.orderId = orderId;
    }

    public Order(Long orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public Order(Long orderId, String orderName, String orderPrice) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderPrice = orderPrice;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", orderPrice='" + orderPrice + '\'' +
                '}';
    }

    @Override
    public int compare(Order o1, Order o2) {
        return o2.getOrderName().compareTo(o1.getOrderName());
    }
}
