package org.protor.sandbox.francesco.tests;

import java.io.File;
import java.util.List;
import org.protor.sandbox.francesco.Car;
import org.protor.sandbox.francesco.VehicleUtils;

public class Test05 {

	public static void main(String[] args) {
		
		if (args.length != 0) {
			
			String filePath = args[0];
			File carsFile = new File(filePath);
			
			List<Car> cars = VehicleUtils.loadListOfCars(carsFile);
			
			if(cars.isEmpty())
				System.err.println("No cars were found!");
			
		}else
			System.err.println(
					"This program must be used this arguments!\n"
						+ "Terminating.");
			System.exit(1);
	}
}
