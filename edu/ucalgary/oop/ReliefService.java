
package edu.ucalgary.oop;


public class ReliefService {

	private Inquirer inquirer;
	private DisasterVictim missingPerson;
	private String dateOfInquiry;
	private String infoProvided;
	private Location lastKnownLocation;

	/**
	 * 
	 * @param inquirer
	 * @param missingPerson
	 * @param dateOfInquiry
	 * @param infoProvided
	 * @param lastKnownLocation
	 */
	public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
		// TODO - implement ReliefService.ReliefService
		throw new UnsupportedOperationException();
	}

	public Inquirer getInquirer() {
		return this.inquirer;
	}

	/**
	 * 
	 * @param inquirer
	 */
	public void setInquirer(Inquirer inquirer) {
		this.inquirer = inquirer;
	}

	public DisasterVictim getMissingPerson() {
		return this.missingPerson;
	}

	/**
	 * 
	 * @param missingPerson
	 */
	public void setMissingPerson(DisasterVictim missingPerson) {
		this.missingPerson = missingPerson;
	}

	public String getDateOfInquiry() {
		return this.dateOfInquiry;
	}

	/**
	 * 
	 * @param dateOfInquiry
	 */
	public void setDateOfInquiry(String dateOfInquiry) {
		this.dateOfInquiry = dateOfInquiry;
	}

	public String getInfoProvided() {
		return this.infoProvided;
	}

	/**
	 * 
	 * @param infoProvided
	 */
	public void setInfoProvided(String infoProvided) {
		this.infoProvided = infoProvided;
	}

	public Location getLastKnownLocation() {
		return this.lastKnownLocation;
	}

	/**
	 * 
	 * @param lastKnownLocation
	 */
	public void setLastKnownLocation(Location lastKnownLocation) {
		this.lastKnownLocation = lastKnownLocation;
	}

	public String getLogDetails() {
		// TODO - implement ReliefService.getLogDetails
		throw new UnsupportedOperationException();
	}

}