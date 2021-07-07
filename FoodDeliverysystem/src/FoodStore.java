import java.util.*;
import java.util.stream.Stream;

public class FoodStore {
    Set<FoodItem> foodList = new HashSet<>();

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

    public void placeOrder(String name) {
        foodList.stream().filter(x -> x.foodname.equals(name)).
                forEach(foodItem -> {
                    System.out.println("Price of " + foodItem.foodname + "is : " +foodItem.price);
                });
    }
}
