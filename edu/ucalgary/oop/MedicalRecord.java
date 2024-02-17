/**
 * @author Spiro Douvis <a href = "mailto"; spiro.douvis@ucalgary.ca>spiro.douvis@ucalgary.ca</a>
 * @version 1.2
 * @since 1.0
 */

package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MedicalRecord {

	private Location location;
	private String treatmentDetails;
	private String dateOfTreatment;

	/**
	 * 
	 * @param location
	 * @param treatmentDetails
	 * @param dateOfTreatment
	 */
	public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
		if (location == null || treatmentDetails == null || dateOfTreatment == null) {
			throw new IllegalArgumentException("Invalid arguments provided");
		}
		this.location = location;
		this.treatmentDetails = treatmentDetails;
		this.dateOfTreatment = dateOfTreatment;
	}

	public Location getLocation() {
		return this.location;
	}

	/**
	 * 
	 * @param location
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	public String getTreatmentDetails() {
		return this.treatmentDetails;
	}

	/**
	 * 
	 * @param treatmentDetails
	 */
	public void setTreatmentDetails(String treatmentDetails) {
		this.treatmentDetails = treatmentDetails;
	}

	public String getDateOfTreatment() {
		return this.dateOfTreatment;
	}

	/**
	 * 
	 * @param dateOfTreatment
	 */
	public void setDateOfTreatment(String dateOfTreatment) {
		//there should be proper date format treatment date
		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate.parse(dateOfTreatment, dateformat);
            this.dateOfTreatment = dateOfTreatment;
        } catch (DateTimeParseException exception) {
            throw new IllegalArgumentException("Invalid date format. What the expected format is ---> yyyy-MM-dd");
        }
	}

}