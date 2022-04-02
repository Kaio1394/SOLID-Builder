package br.com.builder.cars;

import br.com.builder.components.CarType;
import br.com.builder.components.Color;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class Truck {
	private final CarType type;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final Color color;

	public Truck(CarType type, int seats, Engine engine, Transmission transmission, Color color) {
		this.type = type;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.color = color;
		
	}

	public String result() {
		return "Truck with motor: " + engine.getPower() + "\n" + 
				" Transmission: " + transmission + "color: " + color;
	}
}
