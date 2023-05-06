package br.edu.fatec.padroes.observer.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.fatec.padroes.observer.Observer;
import br.edu.fatec.padroes.observer.Subject;

public class WeatherSensorSubject implements Subject {

	private List<Observer> listObservers;
	
	private Float temperature;
	private Float pressure;
	private Float humidity;
	
	public WeatherSensorSubject() {
		this.listObservers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		this.listObservers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		this.listObservers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		
		for(Observer observer : this.listObservers) {
			observer.update(temperature, humidity, pressure);
		}		
	}
	
	/**
	 * Collect data of sensor
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setWeatherData(Float temperature, 
							   Float humidity, 
							   Float pressure) {
		
		this.humidity = humidity;
		this.pressure = pressure;
		this.temperature = temperature;
		
		this.notifyObservers();
		
	}
	
}
