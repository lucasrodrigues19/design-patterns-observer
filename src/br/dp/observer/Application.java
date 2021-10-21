package br.dp.observer;

import br.dp.observer.domains.Netflix;
import br.dp.observer.domains.Subscriber;

public class Application {

	public static void main(String[] args) {
		
		Subscriber subscriber1 = new Subscriber("Alex");
		Subscriber subscriber2 = new Subscriber("Cesar");
		Subscriber subscriber3 = new Subscriber("Maria");
		Subscriber subscriber4 = new Subscriber("Marta");
		
		
		Netflix netflix = new Netflix();
		netflix.addAllObserver(subscriber1,subscriber2,subscriber3,subscriber4);
		
		
		netflix.addFilm("O Protetor");
		netflix.addFilm("American pie 1");
		
		netflix.addSerie("Supernatural");
		
		
		
	}
}
