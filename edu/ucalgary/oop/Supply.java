
package edu.ucalgary.oop;


public class Supply {

	private String type;
	private int quantity;

	/**
	 * 
	 * @param type
	 * @param quantity
	 */
	public Supply(String type, int quantity) {
		// TODO - implement Supply.Supply
		throw new UnsupportedOperationException();
	}

	public String getType() {
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return this.quantity;
	}

	/**
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}