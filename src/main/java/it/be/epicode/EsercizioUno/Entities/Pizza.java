package it.be.epicode.EsercizioUno.Entities;

import java.util.List;

public class Pizza  extends Commons{

    String name;
    private List<Toppings> toppings;

    public Pizza() {
    }

    public Pizza(String name, List<Toppings> toppings) {
        this.name = name;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
