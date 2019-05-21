package org.protor.sandbox.francesco;

public abstract class AbstractAerialVehicle extends AbstractVehicle{

	public AbstractAerialVehicle(EnumGroundContactType type) {
		super(type);
	}

	public AbstractAerialVehicle(String name, EnumGroundContactType type) {
		super(name, type);	
	}
	
	
}
