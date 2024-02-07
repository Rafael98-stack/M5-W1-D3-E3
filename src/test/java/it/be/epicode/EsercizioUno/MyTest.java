package it.be.epicode.EsercizioUno;

import it.be.epicode.EsercizioUno.Entities.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class MyTest {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioUnoApplication.class);

 Drink drink = (Drink) ctx.getBean(Drink.class);

    @Test
    public void testListaVuotoPieno() {

//drink = new Drink("CocaCola",2,10);
int prezzo1 = drink.getPrezzo();
        assertEquals(2,prezzo1);
    }
}
