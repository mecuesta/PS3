package MainPackage;

// importing the classes that are needed for the methods and to use the exception
import MainPackage.Account;
import MainPackage.InsufficientFundsException;

public class TestingOfInvalidWithdrawal {

	public static void main(String [] args) {
			Account test = new Account(1122, 0.00, .045);
	        System.out.println("Depositing $25000...");
	        test.deposit(25000.00);
	        try {
	           System.out.println("\nWithdrawing $1000...");
	           test.withdraw(1000.00);
	           System.out.println("\nWithdrawing $25000...");
	           test.withdraw(25000.00);
	        } catch(InsufficientFundsException exception) {
	           System.out.println("Sorry, but you are short $"
	                                  + exception.getAmount());
	           exception.printStackTrace();
	        }
	}
	
}
