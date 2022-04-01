package br.com.builder.builders;

import br.com.builder.cars.Car;
import br.com.builder.cars.Truck;
import br.com.builder.components.CarType;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class TruckBuilder implements IBuilder{
	private CarType carType;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	
	
	@Override
	public void setCarType(CarType type) {
		// TODO Auto-generated method stub
		this.carType = type;
	}

	@Override
	public void setSeats(int seats) {
		// TODO Auto-generated method stub
		this.seats = seats;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		// TODO Auto-generated method stub
		this.transmission = transmission;
	}

	@Override
	public void setEngine(Engine engine) {
		// TODO Auto-generated method stub
		this.engine = engine;
	}
	
	public Truck getResult() {
		return new Truck(carType, seats, engine, transmission);
	}

}
