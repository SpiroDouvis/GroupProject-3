
package edu.ucalgary.oop;


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
		// TODO - implement MedicalRecord.MedicalRecord
		throw new UnsupportedOperationException();
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
		this.dateOfTreatment = dateOfTreatment;
	}

}