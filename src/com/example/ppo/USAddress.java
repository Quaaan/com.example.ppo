package com.example.ppo;

/**
 * 
 * @model
 *
 */
public interface USAddress {
	/**
	 * @model
	 */
	String getName();
	
	/**
	 * @model
	 */
	String getStreet();
	
	/**
	 * @model
	 */
	String getCity();
	
	/**
	 * @model 
	 */
	String getState();
	
	/**
	 * @model
	 */
	int getZip();
	
	/**
	 * @model default="US" changeable="false"
	 */
	String getCountry();

}
