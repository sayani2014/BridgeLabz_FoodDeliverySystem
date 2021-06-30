import java.util.*;

public class FoodStore {
    Set<FoodItem> foodList = new HashSet<>();

    public void add(FoodItem foodItem) {
        foodList.add(foodItem);
    }

    public void remove(FoodItem foodItem) {
        foodList.remove(foodItem);
    }

    public void display() {
        Iterator iterator = foodList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        /*for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i));
        }*/
    }

    public void displayJuices() {
        Iterator iterator = foodList.iterator();
        while(iterator.hasNext()) {
            FoodItem foodItem = (FoodItem)iterator.next();
            if(foodItem.foodCategory ==FoodItem.Category.JUICES) {
                System.out.println(iterator.next());
            }
        }
        System.out.println();
        /*for (int i = 0; i < foodList.size(); i++) {
            if(foodList.get(i).foodCategory == FoodItem.Category.JUICES) {
                System.out.println(foodList.get(i));
            }
        }*/
    }

    public void displayDessert() {
        Iterator iterator = foodList.iterator();
        while(iterator.hasNext()) {
            FoodItem foodItem = (FoodItem)iterator.next();
            if(foodItem.foodCategory ==FoodItem.Category.DESSERT) {
                System.out.println(iterator.next());
            }
        }
        System.out.println();
        /*for (int i = 0; i < foodList.size(); i++) {
            if(foodList.get(i).foodCategory == FoodItem.Category.DESSERT) {
                System.out.println(foodList.get(i));
            }
        }*/
    }

    public void displayMainCourse() {
        Iterator iterator = foodList.iterator();

        while(iterator.hasNext()) {
            FoodItem foodItem = (FoodItem)iterator.next();
            if(foodItem.foodCategory == FoodItem.Category.MAIN_COURSE) {
                System.out.println(foodItem);
            }
        }
        System.out.println();
        /*for (int i = 0; i < foodList.size(); i++) {
            if(foodList.get(i).foodCategory == FoodItem.Category.MAIN_COURSE) {
                System.out.println(foodList.get(i));
            }
       }*/
    }

    public void displayStarter() {
        Iterator iterator = foodList.iterator();
        while(iterator.hasNext()) {
            FoodItem foodItem = (FoodItem)iterator.next();
            if(foodItem.foodCategory ==FoodItem.Category.STARTER) {
                System.out.println(iterator.next());
            }
        }
        System.out.println();
        /*for (int i = 0; i < foodList.size(); i++) {
            if(foodList.get(i).foodCategory == FoodItem.Category.STARTER) {
                System.out.println(foodList.get(i));
            }
        }*/
    }
}
