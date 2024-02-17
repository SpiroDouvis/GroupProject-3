/**
 * @author Jaisumer Sandhu, Spiro Douvis <a href = "mailto"; jaisumer.sandhu@ucalgary.ca>jaisumer.sandhu@ucalgary.ca</a>
 * @version 1.2
 * @since 1.0
 */

package edu.ucalgary.oop;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DisasterVictim {

	private static int counter = 0;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String comments;
	private MedicalRecord[] medicalRecords;
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
		//there should be proper date format for entry date
		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate.parse(ENTRY_DATE, dateformat);
            this.ENTRY_DATE = ENTRY_DATE;
        } catch (DateTimeParseException exception) {
            throw new IllegalArgumentException("Invalid date format. What the expected format is ---> yyyy-MM-dd");
        }
		//throws exception if firstname is empty
		if (firstName == null || firstName.isEmpty()) {
			throw new IllegalArgumentException("First name cannot be null or empty");
		}
		//intializes main 
		this.firstName = firstName;
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
		//there should be proper date format for birthday
		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate.parse(dateOfBirth, dateformat);
            this.dateOfBirth = dateOfBirth;
        } catch (DateTimeParseException exception) {
            throw new IllegalArgumentException("Invalid date format. What the expected format is ---> yyyy-MM-dd");
        }
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

	public MedicalRecord[] getMedicalRecords() {
		return this.medicalRecords;
	}

	/**
	 * 
	 * @param medicalRecord medical record of disaster victim as a string
	 */
	public void setMedicalRecords(MedicalRecord[] medicalRecord) {
		this.medicalRecords = medicalRecord;
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
	 * @param supply adding supply to the supply list of disaster victim
	 */
	public void addPersonalBelonging(Supply supply) {
		//makes a new array with previous array copied into it, and then it adds one to include new personal belongings
		// then it recopies the new array back into the old array
		if (personalBelongings == null) {
            personalBelongings = new Supply[1];
            personalBelongings[0] = supply;
        }
		else {
			Supply[] updatedsup = new Supply[personalBelongings.length + 1];
			System.arraycopy(personalBelongings, 0, updatedsup, 0, personalBelongings.length);
			updatedsup[personalBelongings.length] = supply;
			personalBelongings = updatedsup;
		}
	}

	/**
	 * 
	 * @param supply removing supply from the supply list of disaster victim if it is in previous array
	 */
	public void removePersonalBelonging(Supply supply) {
		int index = -1;
		for (int i = 0; i < personalBelongings.length; i++) {
			if (personalBelongings[i].equals(supply)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			Supply[] updatedsup = new Supply[personalBelongings.length - 1];
			System.arraycopy(personalBelongings, 0, updatedsup, 0, index);
			System.arraycopy(personalBelongings, 0, updatedsup, 0, personalBelongings.length - index - 1);
			personalBelongings = updatedsup;
		}
	}

	/**
	 * 
	 * @param familyConnection adding another family connection as Family Relation Object
	 */
	public void addFamilyConnection(FamilyRelation familyConnection) {
		//makes a new array with previous array copied into it, and then it adds one to include new family connection
		//then it recopies the new array back into the old array
		if (familyConnections == null){
            familyConnections = new FamilyRelation[1];
            familyConnections[0] = familyConnection;
        }
		else {
			FamilyRelation[] updatedfam = new FamilyRelation[familyConnections.length + 1];
			System.arraycopy(familyConnections, 0, updatedfam, 0, familyConnections.length);
			updatedfam[familyConnections.length] = familyConnection;
			familyConnections = updatedfam;
		}
	}

	/**
	 * 
	 * @param familyConnection removing a family connection as Family Relation Object if it is in previous array
	 */
	public void removeFamilyConnection(FamilyRelation familyConnection) {
		int index = -1;
		for (int i = 0; i < familyConnections.length; i++) {
			if (familyConnections[i].equals(familyConnection)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			//creates new array and updates it by taking out the object that user wants out
			FamilyRelation[] updatedfam = new FamilyRelation[familyConnections.length - 1];
			System.arraycopy(familyConnections, 0, updatedfam, 0, index);
			System.arraycopy(familyConnections, index + 1, updatedfam, 0, familyConnections.length - index - 1);
			familyConnections = updatedfam;
		}
	}

	/**
	 * 
	 * @param medicalRecord adding to the list of medical records
	 */
	public void addMedicalRecord(MedicalRecord medicalRecord) {
		//makes a new array with previous array copied into it, and then it adds one to include new medical record
		//then it recopies the new array back into the old array
		MedicalRecord[] updatedmed = new MedicalRecord[medicalRecords.length + 1];
		System.arraycopy(medicalRecords, 0, updatedmed, 0, familyConnections.length);
		updatedmed[medicalRecords.length] = medicalRecord;
		medicalRecords = updatedmed;
	}

	public int getAssignedSocialID() {
		return this.ASSIGNED_SOCIAL_ID;
	}

	public String getEntryDate() {
		return this.ENTRY_DATE;
	}

}