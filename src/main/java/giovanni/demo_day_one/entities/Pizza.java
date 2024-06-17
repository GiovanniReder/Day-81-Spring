package giovanni.demo_day_one.entities;

public class Pizza {
    private String name;
    private String ingredients;
    private int calories;
    private double price;


    public Pizza(String name, double price, int calories, String ingredients) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
