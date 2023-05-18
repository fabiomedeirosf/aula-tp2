package br.edu.fatec.padroes.observer.exvaga;

public interface Subject {

	public void registerObserver(VagaObserver observer);
	
	public void removeObserver(VagaObserver observer);
	
	public void notifyObservers();
}
