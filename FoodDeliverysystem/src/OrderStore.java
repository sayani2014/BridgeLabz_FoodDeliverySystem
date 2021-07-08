import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class OrderStore {
    private static OrderStore instance;
    Set<Order> orderSet = new HashSet<>();
    Scanner input = new Scanner(System.in);

    //Singelton pattern : so that we are not able to create the object
    private OrderStore() {
    }

    //Since we cannot create a object, so declare the () as static
    public static synchronized OrderStore getInstance() {
        if(instance == null)
            instance = new OrderStore();

        return instance;
    }

    public void add(Order order) {
        orderSet.add(order);
    }

    public void viewAllOrder() {
        Stream.of(orderSet).forEach(System.out::println);
    }

    public void viewParticularOrder() {
        System.out.print("Please enter order id : ");
        int orderID = input.nextInt();

        orderSet.stream().filter(x -> x.getOrderID() == orderID).
                forEach(System.out::println);
    }
}
