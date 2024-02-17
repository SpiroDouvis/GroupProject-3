/**
 * @author Jaisumer Sandhu, Spiro Douvis <a href = "mailto"; spiro.douvis@ucalgary.ca>spiro.douvis@ucalgary.ca</a>
 * @version 1.1
 * @since 1.0
 */

package edu.ucalgary.oop;

import java.util.ArrayList;

public class Location {

	private String name;
	private String address;
	private ArrayList<DisasterVictim> occupants;
	private ArrayList<Supply> supplies;

	/**
	 * 
	 * @param name
	 * @param address
	 */
	public Location(String name, String address) {
		this.name = name;
		this.address = address;
        this.occupants = new ArrayList<>();
        this.supplies = new ArrayList<>();
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

	public ArrayList<DisasterVictim> getOccupants() {
		return this.occupants;
	}

	/**
	 * 
	 * @param occupants
	 */
	public void setOccupants(ArrayList<DisasterVictim> occupants) {
		this.occupants = occupants;
	}

	public ArrayList<Supply> getSupplies() {
		return this.supplies;
	}

	/**
	 * 
	 * @param supplies
	 */
	public void setSupplies(ArrayList<Supply> supplies) {
		this.supplies = supplies;
	}

	/**
	 * 
	 * @param occupant
	 */
	public void addOccupant(DisasterVictim occupant) {
        this.occupants.add(occupant);
	}

	/**
	 * 
	 * @param occupant
	 */
	public void removeOccupant(DisasterVictim occupant) {
        this.occupants.remove(occupant);
	}

	/**
	 * 
	 * @param supply
	 */
	public void addSupply(Supply supply) {
        this.supplies.add(supply);
	}

	/**
	 * 
	 * @param supply
	 */
	public void removeSupply(Supply supply) {
        this.supplies.remove(supply);
	}

}
