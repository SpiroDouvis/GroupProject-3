/**
 * @author Jaisumer Sandhu, Spiro Douvis <a href = "mailto"; jaisumer.sandhu@ucalgary.ca>jaisumer.sandhu@ucalgary.ca</a>
 * @version 1.2
 * @since 1.0
 */


package edu.ucalgary.oop;

public class DisasterVictim {

	private static int counter = 0;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String comments;
	private MedicalRecord[] medicalRecord;
	private FamilyRelation[] familyConnections;
	private Supply[] personalBelongings;
	private String gender;
	private final int ASSIGNED_SOCIAL_ID;
	private final String ENTRY_DATE;

	/**
	 * 
	 * @param firstName
	 * @param ENTRY_DATE
	 */
	public DisasterVictim(String firstName, String ENTRY_DATE) {
		//throws exception if firstname is empty
		if (firstName == null || firstName.isEmpty()) {
			throw new IllegalArgumentException("First name cannot be null or empty");
		}
		//intializes main 
		this.firstName = firstName;
		this.ENTRY_DATE = ENTRY_DATE;
		this.ASSIGNED_SOCIAL_ID = counter;
		counter += 1;
	}

	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * 
	 * @param firstName firstname of disaster victim as a string
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param lastName lastname of disaster victim as a string
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	/**
	 * 
	 * @param dateOfBirth date of birth of disaster victim as a string
	 */
	public void setDateOfBirth(String dateOfBirth) {
		if (dateOfBirth == null || dateOfBirth.isEmpty()) {
			throw new IllegalArgumentException("Date of birth cannot be null or empty");
		}
		this.dateOfBirth = dateOfBirth;
	}

	public String getComments() {
		return this.comments;
	}

	/**
	 * 
	 * @param comments any additional comments of disaster victim as a string
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	public MedicalRecord[] getMedicalRecord() {
		return this.medicalRecord;
	}

	/**
	 * 
	 * @param medicalRecord medical record of disaster victim as a string
	 */
	public void setMedicalRecord(MedicalRecord[] medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	public FamilyRelation[] getFamilyConnections() {
		return this.familyConnections;
	}

	/**
	 * 
	 * @param familyConnections family relatives of disaster victim as FamilyRelation objects
	 */
	public void setFamilyConnections(FamilyRelation[] familyConnections) {
		this.familyConnections = familyConnections;
	}

	public Supply[] getPersonalBelongings() {
		return this.personalBelongings;
	}

	/**
	 * 
	 * @param personalBelongings any of the disaster victim's personal belongings as Supply object
	 */
	public void setPersonalBelongings(Supply[] personalBelongings) {
		this.personalBelongings = personalBelongings;
	}

	public String getGender() {
		return this.gender;
	}

	/**
	 * 
	 * @param gender gender of disaster victim (M/F) as a string
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * 
	 * @param supply adding supply to the supply list of disaster vicitm
	 */
	public void addPersonalBelonging(Supply supply) {
		// TODO - implement DisasterVictim.addPersonalBelonging

		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param supply removing supply from the supply list of disaster vicitm
	 */
	public void removePersonalBelonging(Supply supply) {
		// TODO - implement DisasterVictim.removePersonalBelonging
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param familyConnection adding another family connection as Family Relation Object
	 */
	public void addFamilyConnection(FamilyRelation familyConnection) {
		FamilyRelation[] updatedfam = new FamilyRelation[familyConnections.length + 1];
		System.arraycopy(familyConnections, 0, updatedfam, 0, familyConnections.length);
		updatedfam[familyConnections.length] = familyConnection;
		familyConnections = updatedfam;
	}

	/**
	 * 
	 * @param familyConnection removing a family connection as Family Relation Object
	 */
	public void removeFamilyConnection(FamilyRelation familyConnection) {
		// TODO - implement DisasterVictim.removeFamilyConnection
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param medicalRecord adding to the list of medical records
	 */
	public void addMedicalRecord(MedicalRecord medicalRecord) {
		// TODO - implement DisasterVictim.addMedicalRecord
		throw new UnsupportedOperationException();
	}

	public int getAssignedSocialID() {
		// TODO - implement DisasterVictim.getAssignedSocialID
		throw new UnsupportedOperationException();
	}

	public String getEntryDate() {
		// TODO - implement DisasterVictim.getEntryDate
		throw new UnsupportedOperationException();
	}

}