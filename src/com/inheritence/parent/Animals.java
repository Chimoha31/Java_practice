package com.inheritence.parent;

public class Animals {

	private boolean drySkin;
	private boolean backBone;
	private boolean softShelledEgg;
	
	
	public Animals() {
		this.drySkin = true;
		this.backBone = true;
		this.softShelledEgg = false;
	} 

	public Animals(boolean drySkin, boolean backBone, boolean softShelledEgg) {
		super();
		this.drySkin = drySkin;
		this.backBone = backBone;
		this.softShelledEgg = softShelledEgg;
	}

	public boolean getdrySkin() {
		return drySkin;
	}

	public boolean getbackBone() {
		return backBone;
	}

	public boolean getsoftShelledEgg() {
		return softShelledEgg;
	}

	
	
	public String run() {
		return "hello";
	}

	
}
