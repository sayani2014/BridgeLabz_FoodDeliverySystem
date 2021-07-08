import java.util.*;
import java.util.stream.Stream;

public class FoodStore {
    private static FoodStore instance;
    Set<FoodItem> foodList = new HashSet<>();
    OrderStore orderStore = OrderStore.getInstance();
    Scanner input = new Scanner(System.in);

    private FoodStore() {
    }

    public static synchronized FoodStore getInstance() {
        if(instance == null)
            instance = new FoodStore();

        return instance;
    }

    public void add(FoodItem foodItem) {
        foodList.add(foodItem);
    }

    public void display() {
        Stream.of(foodList).forEach(System.out::println);
    }

    public void displayJuices() {
        foodList.stream().filter(x -> x.foodCategory == FoodItem.Category.JUICES)
                .forEach(System.out::println);
    }

    public void displayDessert() {
        foodList.stream().filter(x -> x.foodCategory == FoodItem.Category.DESSERT)
                .forEach(System.out::println);
    }

    public void displayMainCourse() {
        foodList.stream().filter(x -> x.foodCategory == FoodItem.Category.MAIN_COURSE)
                .forEach(System.out::println);
    }

    public void displayStarter() {
        foodList.stream().filter(x -> x.foodCategory == FoodItem.Category.STARTER)
                .forEach(System.out::println);
    }

    public void placeOrder() {

        Order orderObj = new Order();

        System.out.print("\nPlease enter orderID : ");
        orderObj.setOrderID(input.nextInt());

        System.out.print("Please enter delivery address : ");
        orderObj.setDeliveryAddress(input.next());

        while(true) {
            System.out.println("\nPress 1 to place order");
            System.out.println("Press 2 to exit");
            int choice = input.nextInt();

            if(choice == 1) {

                System.out.print("\nPlease select the menu item : ");
                String name = input.next().concat(input.nextLine());


                System.out.print("Please enter food quantity : ");
                int quantity = input.nextInt();

                foodList.stream().filter(x -> x.foodname.equals(name)).
                        forEach(foodItem -> {
                            orderObj.hMap.put(foodItem , quantity);
                           });
                orderObj.setTotalPrice();
            }
            else
                break;
        }

        orderStore.add(orderObj);
        System.out.println("\nOrder placed successfully!");
    }
}
