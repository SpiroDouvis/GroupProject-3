/**
 * @author Spiro Douvis <a href = "mailto"; spiro.douvis@ucalgary.ca>spiro.douvis@ucalgary.ca</a>
 * @version 1.1
 * @since 1.0
 */

package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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
		this.inquirer = inquirer;
		this.missingPerson = missingPerson;
		this.dateOfInquiry = dateOfInquiry;
		this.infoProvided = infoProvided;
		this.lastKnownLocation = lastKnownLocation;
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
		//there should be proper date format for Inquiry date
		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate.parse(dateOfInquiry, dateformat);
            this.dateOfInquiry = dateOfInquiry;
        } catch (DateTimeParseException exception) {
            throw new IllegalArgumentException("Invalid date format. What the expected format is ---> yyyy-MM-dd");
        }
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
		StringBuilder logDetails = new StringBuilder();
		logDetails.append("Inquirer: ").append(inquirer.getFirstName()).append("\n");
		logDetails.append("Missing Person: ").append(missingPerson.getFirstName()).append("\n");
		logDetails.append("Date of Inquiry: ").append(dateOfInquiry).append("\n");
		logDetails.append("Information Provided: ").append(infoProvided).append("\n");
		logDetails.append("Last Known Location: ").append(lastKnownLocation.toString()).append("\n");
		return logDetails.toString();
	}

}