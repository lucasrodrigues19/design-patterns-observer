package br.dp.observer.domains;

import java.util.ArrayList;
import java.util.List;

import br.dp.observer.events.ObserverManager;
import br.dp.observer.events.SubjectManager;

public class Netflix implements SubjectManager{

	
	private List<ObserverManager> listObserver = new ArrayList<>();

	private List<String> listFilms = new ArrayList<>();
	
	private List<String> listSerie = new ArrayList<>();
	
	
	@Override
	public List<ObserverManager> getObservers() {
		return listObserver;
	}
	
	public void addFilm(String name) {
		System.out.println();
		listFilms.add(name);
		System.out.println(getClass().getName()+": Opa, adicionei o filme: "+name+" :) ");
		warn();
	}
	
	public void addSerie(String name) {
		System.out.println();
		listSerie.add(name);
		System.out.println(getClass().getName()+": Opa, adicionei essa serie pessoal...");
		warn();
	}

}
