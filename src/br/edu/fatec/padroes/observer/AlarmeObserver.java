package br.edu.fatec.padroes.observer;

public class AlarmeObserver implements Observer {

	private int countTempAlarme;
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		
		if(temp > 50) {
			countTempAlarme++;
		}		
	}
	
	public int getCountAlarme() {
		return this.countTempAlarme;
	}

}
