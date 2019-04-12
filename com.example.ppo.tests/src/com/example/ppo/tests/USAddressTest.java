/**
 */
package com.example.ppo.tests;

import com.example.ppo.PpoFactory;
import com.example.ppo.USAddress;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>US Address</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class USAddressTest extends TestCase {

	/**
	 * The fixture for this US Address test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected USAddress fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(USAddressTest.class);
	}

	/**
	 * Constructs a new US Address test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USAddressTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this US Address test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(USAddress fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this US Address test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected USAddress getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PpoFactory.eINSTANCE.createUSAddress());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //USAddressTest
