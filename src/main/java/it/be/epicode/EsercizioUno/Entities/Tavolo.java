package it.be.epicode.EsercizioUno.Entities;

import lombok.Getter;

import java.util.List;
import java.util.Random;
@Getter
public class Tavolo extends Coperto{
private int sedie;
private List<Persone> persone;
    public Tavolo() {
    }

    public Tavolo(int sedie, List<Persone> persone) {
        super(sedie);
        this.persone = persone;
    }
public List<Persone> getPersone() {
        return persone;
}
    public void getNumeroSedie () {
        this.sedie= persone.size();
    }

    public void ShowPersone() {
        System.out.println("Sedie: " + persone.size());

        System.out.println("PERSONE");
        this.persone.forEach(System.out::println);
    }
    @Override
    public String toString() {
        return "Tavolo{" +
                "sedie=" + sedie +
                ", persone=" + persone +
                '}';
    }
}
