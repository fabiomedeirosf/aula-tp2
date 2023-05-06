package br.edu.fatec.padroes.observer;

import br.edu.fatec.padroes.observer.impl.WeatherSensorSubject;

public class App {

	public static void main(String...strings) {
		
		WeatherSensorSubject sensor = new WeatherSensorSubject();
		
		DisplayWeatherObserver displayObserver = new DisplayWeatherObserver();
		DisplayWeatherObserver display2 = new DisplayWeatherObserver();
		
		AlarmeObserver alarme = new AlarmeObserver();
		sensor.registerObserver(displayObserver);
		sensor.registerObserver(display2);
		sensor.registerObserver(alarme);
		
		sensor.setWeatherData(30F, 40F, 20F);
		displayObserver.displayInfo();
		display2.displayInfo();
		
		sensor.setWeatherData(69F, 30F, 20F);
		System.out.println(alarme.getCountAlarme());
	}
}

