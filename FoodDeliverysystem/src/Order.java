import java.util.HashMap;

public class Order {

    enum ORDERSTATUS {
        DELIVERED, PENDING
    }

    HashMap<FoodItem, Integer> hMap = new HashMap<>();
    private Integer orderID;
    private Integer totalPrice;
    private String deliveryAddress;
    private ORDERSTATUS orderstatus = ORDERSTATUS.PENDING;

    public void setTotalPrice() {
        totalPrice = hMap.entrySet().stream().map(item -> item.getKey().price * item.getValue())
                .reduce(0, (total, item) -> total + item);
        //System.out.println("\nTotal Price after placing the order is : " +totalPrice +"\n");
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", totalPrice=" + totalPrice +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", orderstatus=" + orderstatus +
                '}';
    }
}
