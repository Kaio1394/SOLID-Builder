package br.com.builder;

import br.com.builder.builders.CarBuilder;
import br.com.builder.director.Director;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		CarBuilder car = new CarBuilder();
		director.constructSedanCar(car);

		System.out.println(car.getResult());

	}

}
