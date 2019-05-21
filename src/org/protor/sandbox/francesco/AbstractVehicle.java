package org.protor.sandbox.francesco;

import java.io.File;

public abstract class AbstractVehicle {

	private String name = "";
	private EnumGroundContactType engineType = EnumGroundContactType.NONE;
	private double range = 0.0;     // Km
	private double endurance = 0.0; // hours
	private int numMaxPassengers = 0;
	private double maxPayload = 0.0; // Kg

	private File configFile;

	public AbstractVehicle(File configFile) {
		this.configFile = configFile;
		this.loadFromFile(configFile);
	}

	protected abstract boolean loadFromFile(File configFile);

	/**
	 * 
	 * @param name Name of the Vehicle
	 * @param engineType Type of engine
	 * @param range  Maximun possible distance (km)
	 * @param endurance Maximum
	 * @param numMaxPassengers
	 * @param maxPayload
	 */
	public AbstractVehicle(
			String name, 
			EnumGroundContactType engineType,
			double range, 
		    double endurance,
		    int numMaxPassengers,
		 	double maxPayload) {
		this.name = name;
		this.engineType = engineType;
		this.range = range;
		this.endurance = endurance;
		this.numMaxPassengers = numMaxPassengers;
		this.maxPayload = maxPayload;
	}

	public AbstractVehicle(EnumGroundContactType type) {
		this.engineType = type;
	}

	public AbstractVehicle(String name, EnumGroundContactType type) {
		this.name = name;
		this.engineType = type;
	}

	
	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getEndurance() {
		return endurance;
	}

	public void setEndurance(double endurance) {
		this.endurance = endurance;
	}

	public int getNumMaxPassengers() {
		return numMaxPassengers;
	}

	public void setNumMaxPassengers(int numMaxPassengers) {
		this.numMaxPassengers = numMaxPassengers;
	}

	public double getMaxPayload() {
		return maxPayload;
	}

	public void setMaxPayload(double maxPayload) {
		this.maxPayload = maxPayload;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public EnumGroundContactType getEngineType() {
		return engineType;
	}

	public void setEngineType(EnumGroundContactType engineType) {
		this.engineType = engineType;
	}
}
