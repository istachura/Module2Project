public class PersonalLoan extends Loan{
	
	public PersonalLoan(String last, double ln, double la, double term1) {
		super(name,loanNum,loanAmnt,intRate,term);
		setName(last);
		setLoanNum(ln);
		setLoanAmnt(la);
		setTerm(term1);
		intRate = (double)((primeRate * 0.02) + primeRate);
		setIntRate(intRate);
	}

	private void setIntRate(double intRate) {
		// TODO Auto-generated method stub
		
	}
public void LoanConstants() {
		
	}
}
