package giovanni.demo_day_one.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizze;
    private List<Drinks> drinks;
    private List<Toppings> toppings;

    public Menu(List<Pizza> pizze, List<Toppings> toppings, List<Drinks> drinks) {
        this.pizze = pizze;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    public List<Drinks> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drinks> drinks) {
        this.drinks = drinks;
    }

    public void getMenu(){

        for (Pizza pizza: pizze){
            System.out.println(pizza);
        }
        for (Drinks drinks: drinks){
            System.out.println(drinks);
        }
        for (Toppings toppings : toppings){
            System.out.println(toppings);
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizze +
                ", drinks=" + drinks +
                ", toppings=" + toppings +
                '}';
    }
}
