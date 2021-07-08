public class FoodItem {
    enum Taste {
        SALTY, SWEET, SPICY, SOUR
    }
    enum Category {
        STARTER, MAIN_COURSE, DESSERT, JUICES
    }

    String foodname;
    int price;
    Taste taste;
    Category foodCategory;

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodname='" + foodname + '\'' +
                ", price=" + price +
                ", taste=" + taste +
                ", foodCategory=" + foodCategory +
                '}';
    }
}
