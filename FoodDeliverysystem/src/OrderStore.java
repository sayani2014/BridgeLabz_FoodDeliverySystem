import java.util.HashSet;
import java.util.Set;

public class OrderStore {
    Set<Order> orderSet = new HashSet<>();

    public void add(Order order) {
        orderSet.add(order);
    }
}
