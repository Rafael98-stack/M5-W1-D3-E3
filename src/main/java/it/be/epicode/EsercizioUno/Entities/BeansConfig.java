package it.be.epicode.EsercizioUno.Entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {

    /////////////TOPPINGS /////////////

    @Bean(name = "toppingAlici")
    Toppings toppingsAlici() {
        return new Toppings("Alici",2,20);
    }
    @Bean(name = "toppingFormaggio")
    Toppings toppingsFormaggio() {
        return new Toppings("Formaggio",2,15);
    }
    @Bean(name = "toppingMozzarella")
    Toppings toppingsMozzarella() {
        return new Toppings("Mozzarella",0,30);
    }
@Bean(name = "toppingPomodoro")
    Toppings toppingsPomodoro() {
    return new Toppings("Pomodoro",1,10);
}
    @Bean(name = "toppingBasilico")
    Toppings toppingsBasilitco() {
        return new Toppings("Basilico",1,5);
    }
    @Bean(name = "toppingBufala")
    Toppings toppingsBufala() {
        return new Toppings("Bufala",4,30);
    }
    @Bean(name = "toppingPancetta")
    Toppings toppingsPancetta() {
        return new Toppings("Pancetta",3,25);
    }

    @Bean(name = "tuttiToppings")
   List<Toppings> tuttiTopping () {
        List<Toppings> tuttiTopping = new ArrayList<>();
        tuttiTopping.add(toppingsMozzarella());
        tuttiTopping.add(toppingsBufala());
        tuttiTopping.add(toppingsAlici());
        tuttiTopping.add(toppingsPancetta());
        tuttiTopping.add(toppingsBasilitco());
        tuttiTopping.add(toppingsPomodoro());
        tuttiTopping.add(toppingsFormaggio());
        return tuttiTopping;
    };

    ///////////////////////////////////////
    @Bean(name = "pizzaMargherita")
    Pizza getPizzaMargherita() {
    List<Toppings> toppings = new ArrayList<>();
    toppings.add(toppingsPomodoro());
    toppings.add(toppingsBasilitco());
    toppings.add(toppingsMozzarella());
return new Pizza("PizzaMargherita",toppings);
    }
    @Bean(name = "pizza4Formaggi")
    Pizza getPizza4Formaggi() {
        List<Toppings> toppings = new ArrayList<>();
        toppings.add(toppingsFormaggio());
        toppings.add(toppingsMozzarella());
        return new Pizza("Pizza4Formaggi",toppings);
    }

    @Bean(name = "coca-Cola")
    Drink cocaCola(){
    return new Drink("Coca-Cola",2,30);
    }
    @Bean(name = "Fanta")
    Drink fanta(){
        return new Drink("Fanta",2,25);
    }
    @Bean(name = "Sprite")
    Drink sprite(){
        return new Drink("Sprite",2,25);
    }
//    @Bean(name = "ordineAlTavolo")
//    Menu menu1 () {
//    List<Pizza> pizzas = new ArrayList<>();
//    List<Drink> drinks = new ArrayList<>();
//
//    pizzas.add(getPizza4Formaggi());
//    drinks.add(cocaCola());
//
//    return new Menu(pizzas,drinks);
//    }
@Bean(name = "menuTest")
@Scope("prototype")
    Menu menu () {
//        List<Toppings> toppings = List.of(tuttiTopping().get(1)); se vogliamo prendere solo un elemento della lista a nostra scelta
    List<Toppings> toppings = new ArrayList<>(tuttiTopping());
        List<Pizza> pizzas = new ArrayList<>();
        List<Drink> drinks = new ArrayList<>();

        pizzas.add(getPizzaMargherita());

        drinks.add(cocaCola());

        return new Menu(toppings,pizzas,drinks);
    }

    @Bean
    Persone marco() {
        return new Persone("Marco","Nanni");
    }
    @Bean
    Persone giulio() {
        return new Persone("Giulio","DeLuca");
    }
    @Bean
    Persone giuseppe() {
        return new Persone("Giuseppe","DeSantis");
    }


    @Bean(name = "tavolo1")
    Tavolo tavolo1() {
        List<Persone> persones = new ArrayList<>();
        persones.add(marco());
        persones.add(giuseppe());
        persones.add(giulio());
        Tavolo tavolo = new Tavolo(0,persones);
        tavolo.getNumeroSedie();
        return tavolo;
    }

}
