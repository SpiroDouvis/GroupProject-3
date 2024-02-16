/**
 * @author Jaisumer Sandhu, Spiro Douvis <a href = "mailto"; spiro.douvis@ucalgary.ca>spiro.douvis@ucalgary.ca</a>
 * @version 1.1
 * @since 1.0
 */

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
		this.type = type;
		this.quantity = quantity;
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