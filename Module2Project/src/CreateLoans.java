import java.util.*;

public class CreateLoans {
	public static void main(String[] args) {
        int x = 0;
        double primeRate;
        String type;
        Scanner input = new Scanner(System.in);
        Loan[] loans = new Loan[5];
        System.out.println("Enter prime rate: ");
        primeRate = input.nextInt();
        primeRate = primeRate/100;
        input.nextLine();

        for(x = 0; x < 6; ++x) {
            System.out.println("What is the loan type the you would like to apply for? Business/Personal");
            type = input.nextLine();
            if (type.equalsIgnoreCase("Business")) {
                System.out.println("Enter loan number: ");
                int ln = input.nextInt();
                System.out.println("Customer last name: ");
                String last = input.nextLine();
                input.nextLine();
                System.out.println("Loan amount desired: "+"(only allowed up to $50,000)");
                int la = input.nextInt();
                System.out.println("How long would you like the loan for?");
                int term = input.nextInt();
                loans[x] = new BusinessLoan(last, ln, la, term);
                System.out.println("Company providing the loan " + Loan.compName());
                System.out.println("The loan number is " + loans[x].getLoanNum());
                System.out.println("The last name on the loan is " + Loan.getName());
                System.out.println("The loan amount is " + loans[x].getLoanAmnt());
                System.out.println("The interest rate on the loan is " + loans[x].getintRate());
                System.out.println("The term on the account is " + loans[x].getTerm());
            }
            else if (type.equalsIgnoreCase("Personal")) {
                System.out.println("What is the account number on the loan?");
                int ln = input.nextInt();
                System.out.println("What is the last name on the account?");
                String last = input.nextLine();
                input.nextLine();
                System.out.println("What is the loan amount? If you put more then 100k it'll only accept up to 100k");
                int la = input.nextInt();
                System.out.println("What is the term on the account? If you enter something other then 1, 3, or 5 it will default to a short term.");
                int term = input.nextInt();
                loans[x] = new PersonalLoan(last, ln, la, term);
                System.out.println("Customer Name is " + Loan.getName());
                System.out.println("The loan number is " + loans[x].getLoanNum());
                System.out.println("The last name on the loan is " + Loan.getName());
                System.out.println("The loan amount is " + loans[x].getLoanAmnt());
                System.out.println("The interest rate on the loan is " + loans[x].getintRate());
                System.out.println("The term on the account is " + loans[x].getTerm());
            } else {
                System.out.println("You've entered an invalid type. Please restart and try again.");
                System.exit(0);
            }
        }
    } 
}