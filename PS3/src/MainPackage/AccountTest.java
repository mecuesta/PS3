package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
	
	public static Account newAccount;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		newAccount = new Account(1122, 20000, .045);
		newAccount.withdraw(2500);
		newAccount.deposit(3000);
		System.out.printf("The Balance is $%,.2f ", newAccount.getBalance());
		System.out.print("\n");
		System.out.println("The monthly interest is " 
				+ (newAccount.getMonthlyInterestRate() * 100) + "%");
		System.out.print("\n");
		System.out.println("The date the account was created was on " + newAccount.getDateCreated());
		System.out.print("\n");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		newAccount = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	
	@Test
	public void testGetID() {
		assertTrue(newAccount.getID() == 1122);
		assertFalse(newAccount.getID() == 1111);
	}

	@Test
	public void testGetBalance() {
		assertTrue(newAccount.getBalance() == 20500);
		assertFalse(newAccount.getBalance() == 20000);
	}

	@Test
	public void testGetDateCreated() {
		//Not Sure how to make an assert test for this method
		assertTrue(newAccount.getDateCreated() == newAccount.getDateCreated());
	}

	@Test
	public void testGetMonthlyInterestRate() {
		assertTrue(newAccount.getMonthlyInterestRate() == .045);
	}


}
