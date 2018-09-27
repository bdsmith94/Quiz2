package pkgHelper;

import org.junit.Test;
import pkgPayment.CarPayment;
import static org.junit.Assert.*;


public class CarPaymentTest {
	
	@Test
	public void monthlyPayment () {
		CarPayment loan = new CarPayment(35000, 0, 60, 0.1);
		System.out.println(loan.monthlyPayment());
	}
	
	@Test
	public void totalInterest () {
		CarPayment loan = new CarPayment(35000, 0, 60, 0.1);
		System.out.println(loan.totalInterest());
	}

}
