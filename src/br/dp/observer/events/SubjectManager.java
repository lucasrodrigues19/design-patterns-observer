package br.dp.observer.events;

import java.util.Arrays;
import java.util.List;

public interface SubjectManager {

	
	List<ObserverManager> getObservers();
	
	default void addObserver(ObserverManager observer) {
		if(getObservers() != null)
			getObservers().add(observer);
	}
	
	default void addAllObserver(ObserverManager... observer) {
		if(getObservers() != null)
			getObservers().addAll(Arrays.asList(observer));
	}
	
	default void warn() {
		if(getObservers() != null) 
			for(ObserverManager o : getObservers())
				o.exec();
	}

	
	
}
