package it.be.epicode.EsercizioUno.Entities;

public abstract class Commons {
   protected String name;

   protected int prezzo;

   protected int calorie;

    public Commons() {
    }

    public Commons(String name, int prezzo, int calorie) {
        this.name = name;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
}
