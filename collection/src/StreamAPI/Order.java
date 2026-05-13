package StreamAPI;

import java.util.Comparator;

public class Order implements Comparator<Order>{
    private Long orderId;
    private String orderName;
    private Long orderPrice;

    public Order(){}

    public Order(Long orderId, String orderName, Long orderPrice) {
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

    public Long getOrderPrice() {
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
        return o1.getOrderPrice().compareTo(o2.getOrderPrice());
    }
}
