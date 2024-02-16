
package edu.ucalgary.oop;


public class FamilyRelation {

	private DisasterVictim personOne;
	private String relationshipTo;
	private DisasterVictim personTwo;

	/**
	 * 
	 * @param personOne
	 * @param relationshipTo
	 * @param personTwo
	 */
	public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo) {
		// TODO - implement FamilyRelation.FamilyRelation
		throw new UnsupportedOperationException();
	}

	public DisasterVictim getPersonOne() {
		return this.personOne;
	}

	/**
	 * 
	 * @param personOne
	 */
	public void setPersonOne(DisasterVictim personOne) {
		this.personOne = personOne;
	}

	public String getRelationshipTo() {
		return this.relationshipTo;
	}

	/**
	 * 
	 * @param relationshipTo
	 */
	public void setRelationshipTo(String relationshipTo) {
		this.relationshipTo = relationshipTo;
	}

	public DisasterVictim getPersonTwo() {
		return this.personTwo;
	}

	/**
	 * 
	 * @param personTwo
	 */
	public void setPersonTwo(DisasterVictim personTwo) {
		this.personTwo = personTwo;
	}

}