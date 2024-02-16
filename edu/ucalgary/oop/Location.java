/**
 * @author Jaisumer Sandhu, Spiro Douvis <a href = "mailto"; spiro.douvis@ucalgary.ca>spiro.douvis@ucalgary.ca</a>
 * @version 1.1
 * @since 1.0
 */

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
		this.name = name;
		this.address = address;
		this.occupants = new DisasterVictim[0];
		this.supplies = new Supply[0];
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
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
		DisasterVictim[] updatedOccupants = new DisasterVictim[occupants.length + 1];
		System.arraycopy(occupants, 0, updatedOccupants, 0, occupants.length);
		updatedOccupants[occupants.length] = occupant;
		occupants = updatedOccupants;
	}

	/**
	 * 
	 * @param occupant
	 */
	public void removeOccupant(DisasterVictim occupant) {
		int index = -1;
		for (int i = 0; i < occupants.length; i++) {
			if (occupants[i].equals(occupant)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			DisasterVictim[] updatedOccupants = new DisasterVictim[occupants.length - 1];
			System.arraycopy(occupants, 0, updatedOccupants, 0, index);
			System.arraycopy(occupants, index + 1, updatedOccupants, index, occupants.length - index - 1);
			occupants = updatedOccupants;
		}
	}

	/**
	 * 
	 * @param supply
	 */
	public void addSupply(Supply supply) {
		Supply[] updatedSupplies = new Supply[supplies.length + 1];
		System.arraycopy(supplies, 0, updatedSupplies, 0, supplies.length);
		updatedSupplies[supplies.length] = supply;
		supplies = updatedSupplies;
	}

	/**
	 * 
	 * @param supply
	 */
	public void removeSupply(Supply supply) {
		int index = -1;
		for (int i = 0; i < supplies.length; i++) {
			if (supplies[i].equals(supply)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			Supply[] updatedSupplies = new Supply[supplies.length - 1];
			System.arraycopy(supplies, 0, updatedSupplies, 0, index);
			System.arraycopy(supplies, index + 1, updatedSupplies, index, supplies.length - index - 1);
			supplies = updatedSupplies;
		}
	}

}
