package it.be.epicode.EsercizioUno;

import it.be.epicode.EsercizioUno.Entities.Menu;
import it.be.epicode.EsercizioUno.Entities.Ordine;
import it.be.epicode.EsercizioUno.Entities.Tavolo;
import it.be.epicode.EsercizioUno.EsercizioUnoApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class OrderRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioUnoApplication.class);
        try {
            Menu menu = (Menu) ctx.getBean("menuTest");
            menu.getOrdine();
            Tavolo tavolo = (Tavolo) ctx.getBean("tavolo1");
Ordine ordine = new Ordine(1, tavolo.getSedie(),menu,tavolo);
ordine.showOrdine();
tavolo.ShowPersone();
ordine.getConto(menu);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            ctx.close();
        }
    }
}
