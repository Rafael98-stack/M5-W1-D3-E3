package it.be.epicode.EsercizioUno.Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
public class Persone {
    String Nome;
    String Cognome;

    public Persone() {
    }

    public Persone(String nome, String cognome) {
        Nome = nome;
        Cognome = cognome;
    }


}
