package br.com.builder.cars;

import br.com.builder.components.CarType;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class Car {

	private final CarType type;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	
	public Car(CarType type, int seats, Engine engine, Transmission transmission) {
		this.type = type;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
	}

	public CarType getType() {
		return type;
	}

	public int getSeats() {
		return seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", seats=" + seats + ", engine=" + engine + ", transmission=" + transmission + "]";
	}
	
	
}
