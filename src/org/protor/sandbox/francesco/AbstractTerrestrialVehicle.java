package org.protor.sandbox.francesco;

import java.io.File;

public abstract class AbstractTerrestrialVehicle extends AbstractVehicle {

	private EnumGroundContactType groundContactType = EnumGroundContactType.WHEELS;

	public AbstractTerrestrialVehicle(EnumGroundContactType type) {
		super(type);
	}

	public AbstractTerrestrialVehicle(String name, EnumGroundContactType type) {
		super(name, type);
	}

	public AbstractTerrestrialVehicle(File configFile) {
		super(configFile);
	}

	public AbstractTerrestrialVehicle(String name, EnumGroundContactType engineType, double range, double endurance,
			int numMaxPassengers, double maxPayload) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
	}

	public AbstractTerrestrialVehicle(
			String name, EnumGroundContactType engineType, double range, double endurance,
			int numMaxPassengers, double maxPayload, EnumGroundContactType groundContactType) {
				super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
				this.groundContactType = groundContactType;
	}


	public EnumGroundContactType getGroundContactType() {
		return groundContactType;
	}

	public void setGroundContactType(EnumGroundContactType groundContactType) {
		this.groundContactType = groundContactType;
	}
}
