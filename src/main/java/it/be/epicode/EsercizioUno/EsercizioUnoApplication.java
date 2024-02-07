package it.be.epicode.EsercizioUno;

import it.be.epicode.EsercizioUno.Entities.Menu;
import it.be.epicode.EsercizioUno.Entities.Tavolo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EsercizioUnoApplication {

	public static void main(String[] args) {

		SpringApplication.run(EsercizioUnoApplication.class, args);
//
//		Bevande bevande = new Bevande("Coca-Cola",2);
//		Pizze pizze = new Pizze("Margherita",7);
//		Toppings toppings = new Toppings("Bufala",4);
//
//		Menu m = new Menu(bevande);
//
//		System.out.println(m);
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioUnoApplication.class);

//		System.out.println("RISTORANTE 'PASTICCIO E PASTICCIATO'");
//		System.out.println("MENU': ");
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioUnoApplication.class);
//		Menu m = (Menu) ctx.getBean(Menu.class);
//m.getOrdine();
//		m.getMenu();
//		System.out.println(m);
//		System.out.println(m);
//		System.out.println();
//		Tavolo t = (Tavolo) ctx.getBean("tavolo1");
//		Menu m1 = (Menu) ctx.getBean("ordineAlTavolo");
//	System.out.println(t);
//		System.out.println("Prezzo totale: " + m1.getPrezzo());
//		ctx.close();
	}

}
