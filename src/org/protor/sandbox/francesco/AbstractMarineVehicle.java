package org.protor.sandbox.francesco;

public abstract class AbstractMarineVehicle extends AbstractVehicle{

	public AbstractMarineVehicle(EnumGroundContactType type) {
		super(type);
	}

	public AbstractMarineVehicle(String name, EnumGroundContactType type) {
		super(name, type);
	}
}
