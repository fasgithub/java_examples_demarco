package org.protor.sandbox.francesco;

import java.io.File;

public class Car extends AbstractTerrestrialVehicle{

	public Car(EnumGroundContactType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	public Car(File configFile) {
		super(configFile);
		// TODO Auto-generated constructor stub
	}

	public Car(String name, EnumGroundContactType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload, EnumGroundContactType groundContactType) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload, groundContactType);
		// TODO Auto-generated constructor stub
	}

	public Car(String name, EnumGroundContactType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
	}

	public Car(String name, EnumGroundContactType type) {
		super(name, type);
	}

	@Override
	protected boolean loadFromFile(File configFile) {
		return false;
	}
	

}
