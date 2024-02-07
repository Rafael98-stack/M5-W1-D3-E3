package it.be.epicode.EsercizioUno.Entities;

public class Toppings extends  Commons{

    public Toppings() {
    }

    public Toppings(String name, int prezzo, int calorie) {
        super(name, prezzo, calorie);
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "name='" + name + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                '}';
    }
}
