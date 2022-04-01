package br.com.builder.cars;

import br.com.builder.components.CarType;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class Truck {
	private final CarType type;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;

	public Truck(CarType type, int seats, Engine engine, Transmission transmission) {
		this.type = type;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
	}

	public String result() {
		return "Truck with motor: " + engine.getPower() + "\n" + 
				" Transmission: " + transmission;
	}
}
