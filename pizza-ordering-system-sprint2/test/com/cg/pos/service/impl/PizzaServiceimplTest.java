package com.cg.pos.service.impl;

import org.junit.Before;
import org.junit.Test;

import com.cg.pos.exceptions.StoreNameException;
import com.cg.pos.service.PizzaService;

public class PizzaServiceimplTest {
	private PizzaService pizza;

	@Before
	public void setUp() throws Exception {
		pizza = new PizzaServiceimpl();
	}

	/**
	 * TestCase to check Whether Store name taken by user contain any integer
	 * 
	 * @throws StoreNameException
	 */
	@Test(expected = StoreNameException.class)
	public void testViewPizzaIntInStoreName() throws StoreNameException {
		pizza.viewPizza("abc123");

	}

	/**
	 * TestCase to check Whether Store name taken by user contain any special
	 * character
	 * 
	 * @throws StoreNameException
	 */
	@Test(expected = StoreNameException.class)
	public void testViewPizzaSpclCharInStoreName() throws StoreNameException {
		pizza.viewPizza("abc@@!!");

	}

	/**
	 * TestCase to check Whether Store name taken by user is empty
	 * 
	 * @throws StoreNameException
	 */
	@Test(expected = StoreNameException.class)
	public void testViewPizzaEmptyStoreName() throws StoreNameException {
		pizza.viewPizza("");
	}

}
