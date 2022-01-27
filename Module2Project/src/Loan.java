
abstract public class Loan implements LoanConstants {
	
	static String name;		//Customer Last Name
	static double loanNum;		//Loan Number
	static double loanAmnt;	//Loan Amount
	static double intRate;		//Interest Rate
	static double term;		//Term
	double primeRate;	//Prime rate
	
	public Loan(int loanAmnt) {
		setLoanAmnt(loanAmnt);
		
	}
	public Loan(String name, double loanNum, double loanAmnt, double intRate, double term) {
		// TODO Auto-generated constructor stub
	}
	
	abstract public void LoanConstants();
	
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		Loan.name = name;
	}
	public double getLoanNum() {
		return loanNum;
	}
	public void setLoanNum(double loanNum) {
		Loan.loanNum = loanNum;
	}
	public double getLoanAmnt() {
		return loanAmnt;
	}
	public void setLoanAmnt(double loanAmnt) {
		Loan.loanAmnt = loanAmnt;
	}
	public double getTerm() {
		return term;
	}
	public void setTerm(double term) {
		Loan.term = term;
	}
	public double getPrimeRate() {
		return primeRate;
	}
	public void setPrimeRate(double primeRate) {
		this.primeRate = primeRate;
	}
	public String toString() {
		String result;
		result = "Loan information " + name +  loanNum + loanAmnt + intRate + term;
		return result;
	}
	public double getintRate() {
		// TODO Auto-generated method stub
		return intRate;
	}
	protected static String compName() {
		// TODO Auto-generated method stub
		return compName;
	}
	
		
	}
	


