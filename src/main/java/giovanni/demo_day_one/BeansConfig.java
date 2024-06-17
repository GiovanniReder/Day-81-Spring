package giovanni.demo_day_one;


import giovanni.demo_day_one.entities.Drinks;
import giovanni.demo_day_one.entities.Pizza;
import giovanni.demo_day_one.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration

public class BeansConfig {

    @Bean
    public Pizza getMargherita(){
        return new Pizza("Margherita" , 4.99 , 1104 , "tomato and cheese");
    }

    @Bean
    public Pizza getHawaiana(){
        return new Pizza("Hawaiian", 6.49 , 1024 , "tomato, cheese, ham, pineapple");
    }

    @Bean
    public Pizza getSalami(){
        return new Pizza("Salami", 5.99 , 1160 , "tomato, cheese, salami");
    }



    @Bean
    public Drinks getLemonade(){
        return new Drinks("Lemonade" , 1.29 , 128);
    }
    @Bean
    public Drinks getWater(){
        return new Drinks("water" , 1.29 , 0);
    }
    @Bean
    public Drinks getWine(){
        return new Drinks("Wine" , 7.49 , 607);
    }


    @Bean
    public Toppings getCheese(){
        return new Toppings("cheese" , 92 , 0.69);
    }
    @Bean
    public Toppings getHam(){
        return new Toppings("ham" , 35 , 0.99);
    }
    @Bean
    public Toppings getOnions(){
        return new Toppings("onions" , 22 , 0.69);
    }
    @Bean
    public Toppings getPineapple(){
        return new Toppings("pineapple" , 24 , 0.79);
    }
    @Bean
    public Toppings getSalame(){
        return new Toppings("salame" , 86 , 0.99);
    }

    @Bean
    public void getMenu(){

        System.out.println("Ecco il nostro menu: ");
        System.out.println();
    }

}
