package br.dp.observer.domains;

import br.dp.observer.events.ObserverManager;

/**
 * @author Lucas Rodrigues
 * @since 2021/10/21
 */
public class Subscriber implements ObserverManager {

	private String name;
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	@Override
	public void exec() {
		System.out.println(name+": ");
		System.out.println("Oba! vou assistir...");
	}

}
