import java.util.Scanner;

public class FoodDeliverySystem {
    Scanner input = new Scanner(System.in);
    FoodStore foodStore = new FoodStore();

    public void userMenu() {
        while(true) {
            System.out.println("1. Add Food Items");
            System.out.println("2. Display all Food Items");
            System.out.println("3. Display STARTER");
            System.out.println("4. Display MAIN_COURSE");
            System.out.println("5. Display JUICES");
            System.out.println("6. Display DESSERT");
            System.out.println("7. Quit");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n" + "Add food items to the menu: ");
                    addfoodDetails();
                    break;
                case 2:
                    System.out.println("\n" + "Display all menu: ");
                    foodStore.display();
                    break;
                case 3:
                    System.out.println("\n" + "Printing the Starter: ");
                    foodStore.displayStarter();
                    break;
                case 4:
                    System.out.println("\n" + "Printing the Main Course: ");
                    foodStore.displayMainCourse();
                    break;
                case 5:
                    System.out.println("\n" + "Printing the Juices: ");
                    foodStore.displayJuices();
                    break;
                case 6:
                    System.out.println("\n" + "Printing the Dessert: ");
                    foodStore.displayDessert();
                    break;
                case 7:
                    return;
                    //break;
            }
        }
    }
    public void addfoodDetails(){
        while(true) {
            FoodItem foodItem = new FoodItem();
            System.out.print("Enter the food Name: ");
            foodItem.foodname = input.next().toString();
            System.out.print("Enter the food price: ");
            foodItem.price = input.nextInt();

            System.out.println("Enter the food taste");
            System.out.println("Press 1- Salty");
            System.out.println("Press 2 - Sweet");
            System.out.println("Press 3 - Spicy");
            System.out.println("Press 4 - Sour ");
            int foodTaste = input.nextInt();

            if(foodTaste == 1)
                foodItem.taste = FoodItem.Taste.SALTY;
            else if(foodTaste == 2)
                foodItem.taste = FoodItem.Taste.SWEET;
            else if(foodTaste == 3)
                foodItem.taste = FoodItem.Taste.SPICY;
            else if(foodTaste == 4)
                foodItem.taste = FoodItem.Taste.SOUR;

            System.out.println("Enter the food category");
            System.out.println("Press 1 - STARTER");
            System.out.println("Press 2 - Main Course");
            System.out.println("Press 3 - Desert");
            System.out.println("Press 4 - Juices ");
            int foodCat = input.nextInt();

            if(foodCat == 1)
                foodItem.foodCategory = FoodItem.Category.STARTER;
            else if(foodCat == 2)
                foodItem.foodCategory = FoodItem.Category.MAIN_COURSE;
            else if(foodCat == 3)
                foodItem.foodCategory = FoodItem.Category.DESSERT;
            else if(foodCat == 4)
                foodItem.foodCategory = FoodItem.Category.JUICES;

            foodStore.add(foodItem);
            break;
        }
    }
    public static void main(String[] args) {
        FoodDeliverySystem foodDeliverySystem = new FoodDeliverySystem();

        System.out.println("Welcome to Food Delivery System" + "\n");

        /*Biryani biryani = new Biryani();
        biryani.price = 120;
        biryani.quantity = 1;

        MasalaPapad masalaPapad = new MasalaPapad();
        masalaPapad.price = 50;
        masalaPapad.quantity = 3;

        IdliDosa idliDosa = new IdliDosa();
        idliDosa.price = 80;
        idliDosa.quantity = 2;

        PavBhaji pavbhaji = new PavBhaji();
        pavbhaji.price = 70;
        pavbhaji.quantity = 1;

        IceCream iceCream = new IceCream();
        iceCream.price = 150;
        iceCream.quantity = 5;

        MilkShake milkShake = new MilkShake();
        milkShake.price = 200;
        milkShake.quantity = 4;

        foodStore.add(biryani);
        foodStore.add(masalaPapad);
        foodStore.add(pavbhaji);
        foodStore.add(idliDosa);
        foodStore.add(iceCream);
        foodStore.add(milkShake);*/

        foodDeliverySystem.userMenu();


        //Choose menu option
        //foodDeliverySystem.userMenu();
    }
}

