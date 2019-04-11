package com.example.ppo;

import java.util.Date;

/**
 * 
 * @model 
 *
 */
public interface Item {
	/**
	 * @model
	 */
	String getProductName();
	
	/**
	 * @model
	 */
	int getQuantity();
	
	/**
	 * @model
	 */
	int getUSPrice();
	
	/**
	 * @model
	 */
	String getComment();
	
	/**
	 * @model dataType="com.example.ppo.Date"
	 */
	Date getShipDate();
	
	/**
	 * @model dataType="com.example.ppo.SKU"
	 */
	String getPartNum();

}
