import java.util.*;
import java.util.stream.Stream;

public class FoodStore {
    Set<FoodItem> foodList = new HashSet<>();
    OrderStore orderStore = new OrderStore();
    Scanner input = new Scanner(System.in);

    public void add(FoodItem foodItem) {
        foodList.add(foodItem);
    }

    public void remove(FoodItem foodItem) {
        foodList.remove(foodItem);
    }

    public void display() {
        Stream.of(foodList).forEach(
                 System.out::println
        );
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

        System.out.println("\nPlease enter orderID");
        orderObj.setOrderID(input.nextInt());

        System.out.println("\nPlease enter delivery address");
        orderObj.setDeliveryAddress(input.next());

        while(true) {
            System.out.println("Press 1 to place order");
            System.out.println("Press 2 to exit");
            int choice = input.nextInt();

            if(choice == 1) {

                System.out.println("\nPlease select the menu item");
                String name = input.next().concat(input.nextLine());


                System.out.println("\nPlease enter food quantity");
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

        System.out.println("\nOrder placed successfully!\n");
        orderStore.add(orderObj);
        //System.out.println(orderObj);
    }
}
