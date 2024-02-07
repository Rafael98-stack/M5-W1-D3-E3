package it.be.epicode.EsercizioUno.Entities;

public class Drink extends Commons{

    public Drink() {
    }

    public Drink(String name, int prezzo, int calorie) {
        super(name, prezzo, calorie);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", prezzo=" + prezzo +
                ", calorie=" + calorie +
                '}';
    }
}
