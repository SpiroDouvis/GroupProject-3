
package edu.ucalgary.oop;


public class DisasterVictim {

	private int counter;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String comments;
	private MedicalRecord[] medicalRecord;
	private FamilyRelation[] familyConnections;
	private Supply[] personalBelongings;
	private String gender;
	private int ASSIGNED_SOCIAL_ID;
	private String ENTRY_DATE;

	/**
	 * 
	 * @param firstName
	 * @param ENTRY_DATE
	 */
	public DisasterVictim(String firstName, String ENTRY_DATE) {
		// TODO - implement DisasterVictim.DisasterVictim
		throw new UnsupportedOperationException();
	}

	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	/**
	 * 
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getComments() {
		return this.comments;
	}

	/**
	 * 
	 * @param comments
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	public MedicalRecord[] getMedicalRecord() {
		return this.medicalRecord;
	}

	/**
	 * 
	 * @param medicalRecord
	 */
	public void setMedicalRecord(MedicalRecord[] medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	public FamilyRelation[] getFamilyConnections() {
		return this.familyConnections;
	}

	/**
	 * 
	 * @param familyConnections
	 */
	public void setFamilyConnections(FamilyRelation[] familyConnections) {
		this.familyConnections = familyConnections;
	}

	public Supply[] getPersonalBelongings() {
		return this.personalBelongings;
	}

	/**
	 * 
	 * @param personalBelongings
	 */
	public void setPersonalBelongings(Supply[] personalBelongings) {
		this.personalBelongings = personalBelongings;
	}

	public String getGender() {
		return this.gender;
	}

	/**
	 * 
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * 
	 * @param supply
	 */
	public void addPersonalBelonging(Supply supply) {
		// TODO - implement DisasterVictim.addPersonalBelonging
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param supply
	 */
	public void removePersonalBelonging(Supply supply) {
		// TODO - implement DisasterVictim.removePersonalBelonging
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param familyConnection
	 */
	public void addFamilyConnection(FamilyRelation familyConnection) {
		// TODO - implement DisasterVictim.addFamilyConnection
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param familyConnection
	 */
	public void removeFamilyConnection(FamilyRelation familyConnection) {
		// TODO - implement DisasterVictim.removeFamilyConnection
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param medicalRecord
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