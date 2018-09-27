package pkgPayment;

public class CarPayment {
	
	private double TotalPrice;
	private double DownPayment;
	private int LoanLength;
	private double InterestRate;
	
	public CarPayment(double tP, double dP, int lL, double iR) {
		TotalPrice = tP;
		DownPayment = dP;
		LoanLength = lL;
		InterestRate = iR;
	}
	
	public double getTotalPrice () {
		return TotalPrice;
	}
	
	public void setTotalPrice(double tP) {
		TotalPrice = tP;
	}
	
	public double getDownPayment() {
		return DownPayment;
	}
	
	public void setDownPayment(double dP) {
		DownPayment = dP;
	}
	
	public int getLoanLength() {
		return LoanLength;
	}
	
	public void setLoanLength(int lL) {
		LoanLength = lL;
	}
	
	public double getInterestRate() {
		return InterestRate;
	}
	
	public void setInterestRate(double iR) {
		InterestRate = iR;
	}
	
	/* I found the formula for loan amortization on wikiHow
	 * https://www.wikihow.com/Calculate-Auto-Loan-Payments
	 * *
	 */
	
	public double monthlyPayment () {
		double tP = TotalPrice;
		double dP = DownPayment;
		int lL = LoanLength;
		double iR = InterestRate;
		
		double monthlyPayment = ((tP - dP)*Math.pow(1+(iR/12),lL)*(iR/12))/(Math.pow(1+(iR/12), lL)-1);
		
		return monthlyPayment;
	}
	
	public double totalInterest () {
		double tP = TotalPrice;
		int lL = LoanLength;
		
		double totalPayment = (monthlyPayment() * lL);
		double totalInterest = totalPayment - tP;
		
		return totalInterest;
	}
	
}
