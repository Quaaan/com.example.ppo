package com.example.ppo;

import java.util.Date;
import java.util.List;

/**
 * 
 * @model
 *
 */
public interface PurchaseOrder {
	/**
	 * @model
	 */
	String getComment();
	
	/**
	 * @model dataType="com.example.ppo.Date"
	 */
	Date getOrderDate();
	
	/**
	 * @model containment="true" required="true"
	 */
	USAddress getShipTo();
	
	/**
	 * @model containment="true" required="true"
	 */
	USAddress getBillTo();
	 
	/**
	 * @model type="Item" containment="true"
	 */
	List getItems();
}
	