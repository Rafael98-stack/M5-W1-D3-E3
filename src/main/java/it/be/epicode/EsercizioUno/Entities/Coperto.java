package it.be.epicode.EsercizioUno.Entities;

import java.util.List;

public abstract class Coperto {
   private int sedie;


    public Coperto() {
    }

    public Coperto(int sedie) {
        this.sedie = sedie;

    }

    public int getSedie() {
        return sedie;
    }

    public void setSedie(int sedie) {
        this.sedie = sedie;
    }


}
