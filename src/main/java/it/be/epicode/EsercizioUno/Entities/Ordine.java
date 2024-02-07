package it.be.epicode.EsercizioUno.Entities;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

public class Ordine {
    private int numeroOrdine;

    private int sedie;

    private Coperto coperto;
private Toppings toppings;
private Pizza pizza;
    private double conto;

    private List<Persone> persone;
private Commons commons;

private Menu menu;


    public Ordine(int numeroOrdine, int sedie,Menu menu, Coperto coperto) {
        this.numeroOrdine = numeroOrdine;
        this.sedie = sedie;
        this.conto = conto;
        this.persone = persone;
        this.menu = menu;
    }

    public void showOrdine() {
        System.out.println("Il tavolo: " + numeroOrdine);
        System.out.println("Ha ordinato: ");
    menu.getMenu();
        System.out.println("E le persone che hanno mangiato sono: ");
    }
    public void getConto(Menu menu) {
        menu.getPrezzi(toppings);
        int conto = menu.getPrezzi(toppings) + menu.getPrezzi(pizza);
        System.out.println("Conto: " +conto);
    }
}
