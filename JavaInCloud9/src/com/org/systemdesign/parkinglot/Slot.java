package com.org.systemdesign.parkinglot;

abstract class Slot {
	private int slotNumber;
	private boolean isOccupied;

	Slot(int slotNumber){
		this.slotNumber = slotNumber;
		isOccupied = false;
	}

	boolean isOccupied() {
		return isOccupied;
	}

	int getSlotNumber() {
		return slotNumber;
	}

	void park() {
		isOccupied = true;
	} 

	void unPark() {
		isOccupied = false;
	}

	@Override
	public boolean equals(Object o) {
		return (((Slot) o).slotNumber == this.slotNumber);
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 53 * hash + this.slotNumber;
		return hash;
	}  
}
