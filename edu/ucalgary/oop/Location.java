
package edu.ucalgary.oop;


public class Location {

	private String name;
	private String address;
	private DisasterVictim[] occupants;
	private Supply[] supplies;

	/**
	 * 
	 * @param name
	 * @param address
	 */
	public Location(String name, String address) {
		// TODO - implement Location.Location
		throw new UnsupportedOperationException();
	}

	public String getName() {
		// TODO - implement Location.getName
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		// TODO - implement Location.setName
		throw new UnsupportedOperationException();
	}

	public void getAttribute() {
		// TODO - implement Location.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement Location.setAttribute
		throw new UnsupportedOperationException();
	}

	public DisasterVictim[] getOccupants() {
		return this.occupants;
	}

	/**
	 * 
	 * @param occupants
	 */
	public void setOccupants(DisasterVictim[] occupants) {
		this.occupants = occupants;
	}

	public Supply[] getSupplies() {
		return this.supplies;
	}

	/**
	 * 
	 * @param supplies
	 */
	public void setSupplies(Supply[] supplies) {
		this.supplies = supplies;
	}

	/**
	 * 
	 * @param occupant
	 */
	public void addOccupant(DisasterVictim occupant) {
		// TODO - implement Location.addOccupant
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param occupant
	 */
	public void removeOccupant(DisasterVictim occupant) {
		// TODO - implement Location.removeOccupant
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param supply
	 */
	public void addSupply(Supply supply) {
		// TODO - implement Location.addSupply
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param supply
	 */
	public void removeSupply(Supply supply) {
		// TODO - implement Location.removeSupply
		throw new UnsupportedOperationException();
	}

}